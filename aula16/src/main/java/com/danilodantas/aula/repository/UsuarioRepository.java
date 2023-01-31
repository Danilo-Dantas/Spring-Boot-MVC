package com.danilodantas.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilodantas.aula.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
