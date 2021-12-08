package com.ftninformatika.rent.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Festival;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long> {

	
	@Query("SELECT f FROM Festival f WHERE" +
			"(:naziv = NULL OR f.naziv LIKE %:naziv%) AND " +
			"(:mestoId = NULL OR f.mesto.id = :mestoId)")
	Page<Festival> search(@Param("naziv") String naziv, @Param("mestoId") Long mestoId, Pageable pageable);
	
}
