package com.ftninformatika.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Trener;

@Repository
public interface TrenerRepository extends JpaRepository<Trener, Long> {

}
