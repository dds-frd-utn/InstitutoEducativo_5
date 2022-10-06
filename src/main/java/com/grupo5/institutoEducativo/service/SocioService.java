/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Socio;

/**
 *
 * @author imano-oh
 */
@Service
public interface SocioService {
 	public List<Socio> findAllSocio();

	public Optional<Socio> findProfesorById(Long id);

	public Socio saveProfesor(Socio newSocio);

	public String deleteSocio(Long id);

	public String updateSocio(Socio socio);
}
