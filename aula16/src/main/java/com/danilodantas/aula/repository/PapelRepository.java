package com.danilodantas.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilodantas.aula.modelo.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {

	Papel findByPapel(String papel);
}
