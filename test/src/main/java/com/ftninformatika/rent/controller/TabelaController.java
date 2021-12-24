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

import com.ftninformatika.rent.model.Tabela;
import com.ftninformatika.rent.service.TabelaService;
import com.ftninformatika.rent.support.TabelaToTabelaDto;
import com.ftninformatika.rent.web.dto.TabelaDTO;

@RestController
@RequestMapping(value = "/api/tabela", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class TabelaController {

	@Autowired
	private TabelaService tabelaService;
	
	@Autowired
	private TabelaToTabelaDto tabelaToTabelaDto;
	
	@GetMapping
	public ResponseEntity<List<TabelaDTO>> getAll() {
		List<Tabela> tabele = tabelaService.findAll();
		
		return new ResponseEntity<List<TabelaDTO>>(tabelaToTabelaDto.convert(tabele), HttpStatus.OK);
	}
}
