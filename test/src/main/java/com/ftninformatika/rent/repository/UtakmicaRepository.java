package com.ftninformatika.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Utakmica;

@Repository
public interface UtakmicaRepository extends JpaRepository<Utakmica, Long> {

}
