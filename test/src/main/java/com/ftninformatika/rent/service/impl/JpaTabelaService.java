package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Tabela;
import com.ftninformatika.rent.repository.TabelaRepository;
import com.ftninformatika.rent.service.TabelaService;

@Service
public class JpaTabelaService implements TabelaService {

	@Autowired
	private TabelaRepository tabelaRepository;

	@Override
	public Tabela findOne(Long id) {
		
		return tabelaRepository.findById(id).get();
	}

	@Override
	public List<Tabela> findAll() {
		
		return tabelaRepository.findAllByOrderByBodoviDesc();
	}

	@Override
	public Tabela save(Tabela tabela) {
		
		return tabelaRepository.save(tabela);
	}

	@Override
	public Tabela update(Tabela tabela) {
		
		return tabelaRepository.save(tabela);
	}

	@Override
	public Tabela delete(Long id) {
		Tabela tabela = findOne(id);
		if (tabela != null) {
			tabelaRepository.deleteById(id);
			return tabela;
		}
		return null;
	}

	@Override
	public Tabela findByKlub(Long id) {
		
		return tabelaRepository.findByKlubId(id);
	}
	
	
}
