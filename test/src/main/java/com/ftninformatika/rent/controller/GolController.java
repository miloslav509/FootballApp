package com.ftninformatika.rent.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Gol;
import com.ftninformatika.rent.service.GolService;
import com.ftninformatika.rent.support.GolDtoToGol;
import com.ftninformatika.rent.support.GolToGolDto;
import com.ftninformatika.rent.web.dto.GolDTO;


@RestController
@RequestMapping(value = "/api/golovi", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class GolController {

	@Autowired
	private GolService golService;
	
	@Autowired
	private GolDtoToGol dtoToGol;
	
	@Autowired
	private GolToGolDto toGolDto;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GolDTO> create(@Valid @RequestBody GolDTO golDTO) {
		
		Gol gol = dtoToGol.convert(golDTO);
		
		Gol sacuvanGol = golService.save(gol);
		
		return new ResponseEntity<GolDTO>(toGolDto.convert(sacuvanGol), HttpStatus.CREATED);
	}
}
