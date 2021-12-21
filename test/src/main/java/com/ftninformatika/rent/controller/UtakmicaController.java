package com.ftninformatika.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.service.UtakmicaService;
import com.ftninformatika.rent.support.UtakmicaDtoToUtakmica;
import com.ftninformatika.rent.support.UtakmicaToUtakmicaDto;
import com.ftninformatika.rent.web.dto.UtakmicaDTO;

@RestController
@RequestMapping(value = "/api/utakmice", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class UtakmicaController {

	@Autowired
	private UtakmicaService utakmicaService;
	
	@Autowired
	private UtakmicaToUtakmicaDto utakmicaToUtakmicaDto;
	
	@Autowired
	private UtakmicaDtoToUtakmica utakmicaDtoToUtakmica;
	
	@GetMapping("/by-page")
    public ResponseEntity<Page<UtakmicaDTO>> get(Pageable pageable){

        Page<Utakmica> utakmice = utakmicaService.findAll(pageable);
        List<UtakmicaDTO> utakmiceLista = utakmicaToUtakmicaDto.convert(utakmice.toList());

        Page<UtakmicaDTO> utakmiceDTO = new PageImpl<>(utakmiceLista, utakmice.getPageable(), utakmice.getTotalElements());

        return new ResponseEntity<>(utakmiceDTO, HttpStatus.OK);
    }
}
