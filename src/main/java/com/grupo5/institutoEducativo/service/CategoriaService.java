/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupo5.institutoEducativo.entity.Categoria;

/**
 *
 * @author imano-oh
 */
@Service
public interface CategoriaService {

    public List<Categoria> findAllCategoria();

    public Optional<Categoria> findCategoriaById(Long id);

    public Categoria saveCategoria(Categoria newCategoria);

    public String deleteCategoria(Long id);

    public String updateCategoria(Categoria categoria);
}
