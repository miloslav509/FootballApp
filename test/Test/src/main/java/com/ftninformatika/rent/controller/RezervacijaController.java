package com.ftninformatika.rent.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.model.Rezervacija;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.RezervacijaService;
import com.ftninformatika.rent.support.RezervacijaDtoToRezervacija;
import com.ftninformatika.rent.support.RezervacijaToRezervacijaDto;
import com.ftninformatika.rent.web.dto.FestivalDTO;
import com.ftninformatika.rent.web.dto.RezervacijaDTO;

@RestController
@RequestMapping(value = "/api/rezervacije", produces = MediaType.APPLICATION_JSON_VALUE)
public class RezervacijaController {
	
	@Autowired
	private RezervacijaService rezervacijaService;
	
	@Autowired
	private FestivalService festivalService;
	
	@Autowired
	private RezervacijaDtoToRezervacija toRezervacija;
	
	@Autowired
	private RezervacijaToRezervacijaDto toDto;
	
	@PreAuthorize("hasRole('KORISNIK')")
	@GetMapping("/{id}")
    public ResponseEntity<RezervacijaDTO> getOne(@PathVariable Long id){
        Rezervacija rez = rezervacijaService.findOne(id);

        if(rez != null) {
            return new ResponseEntity<>(toDto.convert(rez), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RezervacijaDTO> create(@Valid @RequestBody RezervacijaDTO rezervacijaDTO){
		Rezervacija rezervacija = toRezervacija.convert(rezervacijaDTO);
		Rezervacija sacuvana = rezervacijaService.save(rezervacija);
		Festival festival = rezervacija.getFestival();
		festival.getRezervacije().add(rezervacija);
		festival.setBrojKarata(festival.getBrojKarata() - rezervacija.getBrojKarata());
		festivalService.save(festival);
		

        return new ResponseEntity<>(toDto.convert(sacuvana), HttpStatus.CREATED);
    }

}
