package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Docente;
import com.grupo5.institutoEducativo.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired(required = false)
	private DocenteRepository docenteRepository; 
	
	@Override
	public List<Docente> findAllDocente() {
		return docenteRepository.findAll();
	}

	@Override
	public Optional<Docente> findDocenteById(Long id) {
		return docenteRepository.findById(id);
	}

	@Override
	public Docente saveDocente(Docente newDocente) {
		return docenteRepository.save(newDocente);
	}

	@Override
	public String deleteDocente(Long id) {
		if (docenteRepository.findById(id) != null) {
			docenteRepository.deleteById(id);
			return "OK";
		}
		return "error: id no existe";
	}

	@Override
	public String updateDocente(Docente docente) {
		if (docenteRepository.findById(docente.getId()) != null) {
			docenteRepository.save(docente);
			return "OK";
		}

		return "error: id no existe";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
