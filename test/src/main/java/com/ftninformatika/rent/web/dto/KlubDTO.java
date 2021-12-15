package com.ftninformatika.rent.web.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Positive;

public class KlubDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String naziv;
	 
	 private String stadionNaziv;
	 
	 private Long stadionId;
	 
	 private List<IgracDTO> igraci = new ArrayList<>();
	 
	 private String trenerImePrezime;
	 
	 private Long trenerId;
	 
	 private Long tabelaId;
}
