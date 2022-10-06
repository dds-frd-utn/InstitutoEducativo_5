package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.grupo5.institutoEducativo.entity.Socio;
import com.grupo5.institutoEducativo.repository.SocioRepository;

public class SocioServiceImpl implements SocioService {

	@Autowired(required = false)
	private SocioRepository socioRepository;

	@Override
	public List<Socio> findAllSocio() {
		return socioRepository.findAll();
	}

	@Override
	public Optional<Socio> findSocioById(Long id) {
		return socioRepository.findById(id);
	}

	@Override
	public Socio saveSocio(Socio newSocio) {
		return socioRepository.save(newSocio);
	}

	@Override
	public String deleteSocio(Long id) {
		if (socioRepository.findById(id) != null) {
			socioRepository.deleteById(id);
			return "OK";
		}
		return "error: id no existe";
	}

	@Override
	public String updateSocio(Socio socio) {
		int id = socio.getId();
		long longId = id;
		if (socioRepository.findById(longId) != null) {
			socioRepository.save(socio);
			return "OK";
		}

		return "error: id no existe";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
