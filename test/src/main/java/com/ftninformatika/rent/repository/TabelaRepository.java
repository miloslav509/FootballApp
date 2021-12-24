package com.ftninformatika.rent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.rent.model.Tabela;

@Repository
public interface TabelaRepository extends JpaRepository<Tabela, Long> {

	List<Tabela> findAllByOrderByBodoviDesc ();
}
