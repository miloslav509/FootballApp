package com.ftninformatika.rent.service;

import org.springframework.data.domain.Page;

import com.ftninformatika.rent.model.Festival;

public interface FestivalService {

	Festival findOne(Long id);
	
	Page<Festival> search(String naziv, Long mestoId, int pageNo);
	
	Festival save(Festival f);
	
	Festival delete(Long id);
}
