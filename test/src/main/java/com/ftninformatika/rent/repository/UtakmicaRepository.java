package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Utakmica;

@Repository
public interface UtakmicaRepository extends JpaRepository<Utakmica, Long> {
	
	List<Utakmica> findByTakmicenjeId(Long id);
	
	List<Utakmica> findByKlubDomacinId(Long id);
	
	List<Utakmica> findByKlubGostId(Long id);
	
	List<Utakmica> findByStadionId(Long id);
	
	List<Utakmica> findByKolo(int kolo);
	
	List<Utakmica> findBySudijaId(Long id);
	
}
