/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.service;

import java.util.List;

import java.util.Optional;
import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Profesor;

/**
 *
 * @author imano-oh
 */
@Service
public interface ProfesorService {
	public List<Profesor> findAllProfesor();

	public Optional<Profesor> findProfesorById(Long id);

	public Profesor saveProfesor(Profesor newProfesor);

	public String deleteProfesor(Long id);

	public String updateProfesor(Profesor profesor);
}