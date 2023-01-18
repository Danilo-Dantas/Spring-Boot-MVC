package com.danilodantas.aula.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilodantas.aula.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByLogin(String login);
}
