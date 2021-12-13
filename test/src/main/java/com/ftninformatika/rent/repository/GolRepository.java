package com.ftninformatika.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Gol;

@Repository
public interface GolRepository extends JpaRepository<Gol, Long> {

}
