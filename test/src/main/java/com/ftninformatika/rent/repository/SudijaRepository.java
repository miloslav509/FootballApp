package com.ftninformatika.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Sudija;

@Repository
public interface SudijaRepository extends JpaRepository<Sudija, Long> {

}
