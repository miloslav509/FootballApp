package com.ftninformatika.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Mesto;

@Repository
public interface MestoRepository extends JpaRepository<Mesto, Long> {

	
	
}
