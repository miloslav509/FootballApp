package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Komentar;

@Repository
public interface KomentarRepository extends JpaRepository<Komentar, Long> {

	List<Komentar> findByKorisnikId(Long id);
	
	List<Komentar> findByUtakmicaId(Long id);
}
