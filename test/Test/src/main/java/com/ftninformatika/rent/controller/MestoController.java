package com.ftninformatika.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Mesto;
import com.ftninformatika.rent.service.MestoService;
import com.ftninformatika.rent.support.MestoDtoToMesto;
import com.ftninformatika.rent.support.MestoToMestoDto;
import com.ftninformatika.rent.web.dto.MestoDTO;

@RestController
@RequestMapping(value = "/api/mesta", produces = MediaType.APPLICATION_JSON_VALUE)
public class MestoController {
	
	@Autowired
	private MestoService mestoService;
	
	@Autowired
	private MestoToMestoDto toDto;
	
	@Autowired
	private MestoDtoToMesto toMesto;
	
	

	
	@PreAuthorize("hasAnyRole('KORISNIK', 'ADMIN')")
    @GetMapping
    public ResponseEntity<List<MestoDTO>> getAll(){

    	List<Mesto> mesta = mestoService.findAll();

        return new ResponseEntity<>(toDto.convert(mesta), HttpStatus.OK);
    
    }

}
