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

import com.ftninformatika.rent.model.Igrac;
import com.ftninformatika.rent.service.IgracService;
import com.ftninformatika.rent.support.IgracToIgracDto;
import com.ftninformatika.rent.web.dto.IgracDTO;

@RestController
@RequestMapping(value = "/api/igraci", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class IgracController {

	@Autowired
	private IgracService igracService;
	
	@Autowired
	private IgracToIgracDto igracToIgracDto;
	
	
	@GetMapping
	public ResponseEntity<List<IgracDTO>> getAll() {
		List<Igrac> igraci = igracService.findAll();
		
		return new ResponseEntity<List<IgracDTO>>(igracToIgracDto.conver(igraci), HttpStatus.OK);
	}
	
}
