package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Grad;

@Repository
public interface GradRepository extends JpaRepository<Grad, Long> {

	List<Grad> findByDrzavaId(Long id);
}
