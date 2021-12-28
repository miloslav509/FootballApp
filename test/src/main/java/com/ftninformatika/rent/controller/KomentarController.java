package com.ftninformatika.rent.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Komentar;
import com.ftninformatika.rent.service.KomentarService;
import com.ftninformatika.rent.support.KomentarDtoToKomentar;
import com.ftninformatika.rent.support.KomentarToKomentarDto;
import com.ftninformatika.rent.web.dto.KomentarDTO;

@RestController
@RequestMapping(value = "api/komentari", produces = MediaType.APPLICATION_JSON_VALUE)
public class KomentarController {

	@Autowired
	private KomentarService komentarService;
	
	@Autowired
	private KomentarDtoToKomentar toKomentar;
	
	@Autowired
	private KomentarToKomentarDto toDto;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<KomentarDTO> create(@Valid @RequestBody KomentarDTO komentarDTO) {
		
		Komentar komentar = toKomentar.convert(komentarDTO);
		
		Komentar sacuvanKomentar = komentarService.save(komentar);
		
		return new ResponseEntity<KomentarDTO>(toDto.convert(sacuvanKomentar), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		Komentar komentar = komentarService.delete(id);
		
		if (komentar == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
