package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Tabela;

public interface TabelaService {

	Tabela findOne(Long id);
	
	List<Tabela> findAll(Long id);
	
	Tabela save(Tabela tabela);
	
	Tabela update(Tabela tabela);
	
	Tabela delete(Long id);
}
