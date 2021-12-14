package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Utakmica;

@Repository
public interface UtakmicaRepository extends JpaRepository<Utakmica, Long> {
	
	List<Utakmica> findByTakmicenjeId(Long id);
	
	List<Utakmica> findByDomacinId(Long id);
	
	List<Utakmica> findByGostId(Long id);
	
	List<Utakmica> findByStadionId(Long id);
	
	List<Utakmica> findByKolo(int kolo);
	
	List<Utakmica> findBySudijaId(Long id);
}
