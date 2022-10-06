/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Docente;

/**
 *
 * @author imano-oh
 */
@Service
public interface DocenteService {
	public List<Docente> findAllDocente();

	public Optional<Docente> findDocenteById(Long id);

	public Docente saveDocente(Docente newDocente);

	public String deleteDocente(Long id);

	public String updateDocente(Docente docente);
	

}