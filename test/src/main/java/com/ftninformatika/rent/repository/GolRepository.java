package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Gol;

@Repository
public interface GolRepository extends JpaRepository<Gol, Long> {
	
	List<Gol> findByStrelacId(Long id);

	List<Gol> findByAsistentId(Long id);
	
	List<Gol> findByUtakmicaId(Long id);
}
