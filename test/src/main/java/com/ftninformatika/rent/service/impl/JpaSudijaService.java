package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Sudija;
import com.ftninformatika.rent.repository.SudijaRepository;
import com.ftninformatika.rent.service.SudijaService;

@Service
public class JpaSudijaService implements SudijaService {

	@Autowired
	private SudijaRepository sudijaRepository;

	@Override
	public Sudija findOne(Long id) {
	
		return sudijaRepository.findById(id).get();
	}

	@Override
	public List<Sudija> findAll() {
	
		return sudijaRepository.findAll();
	}

	@Override
	public Sudija save(Sudija sudija) {
		
		return sudijaRepository.save(sudija);
	}

	@Override
	public Sudija update(Sudija sudija) {
		
		return sudijaRepository.save(sudija);
	}

	@Override
	public Sudija delete(Long id) {
		Sudija sudija = findOne(id);
		if (sudija != null) {
			sudijaRepository.deleteById(id);
			return sudija;
		}
		return null;
	}

	@Override
	public Sudija findByUtakmica(Long id) {
		
		return sudijaRepository.findByUtakmiceId(id);
	}
	
	
}
