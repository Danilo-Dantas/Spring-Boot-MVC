package com.danilodantas.aula.service;

import java.util.List;

import com.danilodantas.aula.modelo.Papel;

public interface PapelService {
	public Papel buscarPapelPorId(Long id);
	public Papel buscarPapel(String papel);
	public List<Papel> listarPapel();
}

