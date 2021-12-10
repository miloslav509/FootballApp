package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Klub;

@Repository
public interface KlubRepository extends JpaRepository<Klub, Long> {

	List<Klub> findByStadionId(Long id);
}
