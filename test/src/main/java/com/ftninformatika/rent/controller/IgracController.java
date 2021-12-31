package com.ftninformatika.rent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.service.IgracService;
import com.ftninformatika.rent.support.IgracToIgracDto;

@RestController
@RequestMapping(value = "/api/igraci", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class IgracController {

	@Autowired
	private IgracService igracService;
	
	@Autowired
	private IgracToIgracDto igracToIgracDto;
	
	
}
