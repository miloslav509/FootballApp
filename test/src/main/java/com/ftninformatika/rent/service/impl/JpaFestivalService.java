package com.ftninformatika.rent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.model.Mesto;
import com.ftninformatika.rent.repository.FestivalRepository;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.MestoService;

@Service
public class JpaFestivalService implements FestivalService {

	
	@Autowired
	private FestivalRepository festivalRepository;
	
	@Autowired
	private MestoService mestoService;

	@Override
	public Festival findOne(Long id) {
		// TODO Auto-generated method stub
		return festivalRepository.findById(id).get();
	}

	@Override
	public Page<Festival> search(String naziv, Long mestoId, int pageNo) {
		// TODO Auto-generated method stub
		return festivalRepository.search(naziv, mestoId, PageRequest.of(pageNo, 2));
	}

	@Override
	public Festival save(Festival f) {
		// TODO Auto-generated method stub
		return festivalRepository.save(f);
	}

	@Override
	public Festival delete(Long id) {
		Festival festival = findOne(id);
		if (festival != null) {
			Mesto mesto = festival.getMesto();
			mesto.getFestivali().remove(festival);
			mestoService.save(mesto);
			festivalRepository.delete(festival);
			return festival;
		}
		return null;
	}
	
	
	
}
