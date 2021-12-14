package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Igrac;

@Repository
public interface IgracRepository extends JpaRepository<Igrac, Long> {

	List<Igrac> findByGolId(Long id);
	
	List<Igrac> findByAsistId(Long id);
	
	List<Igrac> findByKlubId(Long id);
}
