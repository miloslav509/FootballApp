package com.ftninformatika.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Klub;
import com.ftninformatika.rent.service.KlubService;
import com.ftninformatika.rent.support.KlubToKlubDto;
import com.ftninformatika.rent.web.dto.KlubDTO;

@RestController
@RequestMapping(value = "/api/klubovi", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class KlubController {
	
	@Autowired
	private KlubService klubService;
	
	@Autowired
	private KlubToKlubDto klubToKlubDto;
	
	@GetMapping
	public ResponseEntity<List<KlubDTO>> getAll() {
		List<Klub> klubovi = klubService.findAll();
		
		return new ResponseEntity<List<KlubDTO>>(klubToKlubDto.conver(klubovi), HttpStatus.OK);
	}

}
