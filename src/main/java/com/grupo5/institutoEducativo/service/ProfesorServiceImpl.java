package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Profesor;
import com.grupo5.institutoEducativo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired(required = false)
	private ProfesorRepository profesorRepository;

	@Override
	public List<Profesor> findAllProfesor() {
		return profesorRepository.findAll();
	}

	@Override
	public Optional<Profesor> findProfesorById(Long id) {
		return profesorRepository.findById(id);
	}

	@Override
	public Profesor saveProfesor(Profesor newProfesor) {
		return profesorRepository.save(newProfesor);
	}

	@Override
	public String deleteProfesor(Long id) {
		if (profesorRepository.findById(id) != null) {
			profesorRepository.deleteById(id);
			return "OK";
		}
		return "error: id no existe";
	}

	@Override
	public String updateProfesor(Profesor profesor) {
		if (profesorRepository.findById(profesor.getId()) != null) {
			profesorRepository.save(profesor);
			return "OK";
		}

		return "error: id no existe";
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
