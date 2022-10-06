package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.grupo5.institutoEducativo.entity.Categoria;
import com.grupo5.institutoEducativo.repository.CategoriaRepository;

public class CategoriaServiceImpl implements CategoriaService {

    @Autowired(required = false)
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAllCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> findCategoriaById(Long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria saveCategoria(Categoria newCategoria) {
        return categoriaRepository.save(newCategoria);
    }

    @Override
    public String deleteCategoria(Long id) {
        if (categoriaRepository.findById(id) != null)
        {
            categoriaRepository.deleteById(id);
            return "OK";
        }
        return "error: id no existe";
    }

    @Override
    public String updateCategoria(Categoria categoria) {
        int id = categoria.getId();
        long longId = id;
        if (categoriaRepository.findById(longId) != null)
        {
            categoriaRepository.save(categoria);
            return "OK";
        }

        return "error: id no existe";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
