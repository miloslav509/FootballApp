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

import com.ftninformatika.rent.model.Sudija;
import com.ftninformatika.rent.service.SudijaService;
import com.ftninformatika.rent.support.SudijaToSudijaDto;
import com.ftninformatika.rent.web.dto.SudijaDTO;

@RestController
@RequestMapping(value = "/api/sudije", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class SudijaController {

	@Autowired
	private SudijaService sudijaService;
	
	@Autowired
	private SudijaToSudijaDto sudijaToSudijaDto;
	
	@GetMapping
	public ResponseEntity<List<SudijaDTO>> getAll() {
		List<Sudija> sudije = sudijaService.findAll();
		
		return new ResponseEntity<List<SudijaDTO>>(sudijaToSudijaDto.convert(sudije), HttpStatus.OK);
	}
}
