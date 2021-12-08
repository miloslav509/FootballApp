package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Mesto;
import com.ftninformatika.rent.repository.MestoRepository;
import com.ftninformatika.rent.service.MestoService;

@Service
public class JpaMestoService implements MestoService {

	@Autowired
	private MestoRepository mestoRepository;

	@Override
	public Mesto findOne(Long id) {
		// TODO Auto-generated method stub
		return mestoRepository.findById(id).get();
	}

	@Override
	public List<Mesto> findAll() {
		// TODO Auto-generated method stub
		return mestoRepository.findAll();
	}

	@Override
	public Mesto save(Mesto m) {
		// TODO Auto-generated method stub
		return mestoRepository.save(m);
	}

	@Override
	public Mesto delete(Long id) {
		Mesto mesto = findOne(id);
		mestoRepository.delete(mesto);
		return mesto;
	}
	
	
	
	
}
