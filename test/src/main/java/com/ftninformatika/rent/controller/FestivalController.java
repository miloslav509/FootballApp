package com.ftninformatika.rent.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.MestoService;
import com.ftninformatika.rent.support.FestivalDtoToFestival;
import com.ftninformatika.rent.support.FestivalToFestivalDto;
import com.ftninformatika.rent.web.dto.FestivalDTO;

@RestController
@RequestMapping(value = "/api/festivali", produces = MediaType.APPLICATION_JSON_VALUE)
public class FestivalController {
	
	@Autowired
	private FestivalService festivalService;
	
	@Autowired
	private MestoService mestoService;
	
	@Autowired
	private FestivalDtoToFestival toFestival;
	
	@Autowired
	private FestivalToFestivalDto toDto;
	
	@PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
	@GetMapping("/{id}")
    public ResponseEntity<FestivalDTO> getOne(@PathVariable Long id){
        Festival festival = festivalService.findOne(id);

        if(festival != null) {
            return new ResponseEntity<>(toDto.convert(festival), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	
	@PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
	@GetMapping
	public ResponseEntity<List<FestivalDTO>> getAll(
			@RequestParam(value="mestoId", required = false) Long mestoId,
            @RequestParam(value= "naziv", required = false ) String naziv,
            @RequestParam(value = "pageNo", defaultValue = "0") int pageNo){
		if (mestoId == -1) {
			mestoId = null;
		}
		
		
		if (naziv == "") {
			naziv = null;
		}
		Page<Festival> festivali = festivalService.search(naziv, mestoId, pageNo);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Total-Pages", Integer.toString(festivali.getTotalPages()));
		return new ResponseEntity<>(toDto.convert(festivali.getContent()), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FestivalDTO> create(@Valid @RequestBody FestivalDTO festivalDTO){
        Festival festival = toFestival.convert(festivalDTO);
        Festival sacuvan = festivalService.save(festival);

        return new ResponseEntity<>(toDto.convert(sacuvan), HttpStatus.CREATED);
    }
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FestivalDTO> update(@PathVariable Long id, @Valid @RequestBody FestivalDTO festivalDTO){

        if(!id.equals(festivalDTO.getId())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Festival festival = toFestival.convert(festivalDTO);
        Festival sacuvan = festivalService.save(festival);

        return new ResponseEntity<>(toDto.convert(sacuvan),HttpStatus.OK);
    }
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
		Festival festival = festivalService.findOne(id);
		festivalService.delete(id);

        if(festival != null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
