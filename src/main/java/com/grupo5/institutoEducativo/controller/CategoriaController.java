/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.grupo5.institutoEducativo.entity.Categoria;
import com.grupo5.institutoEducativo.service.CategoriaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author imano-oh
 */
@RestController
@RequestMapping("/url")
public class CategoriaController {
	@Autowired(required = false)
    CategoriaService categoriaService;

    @RequestMapping(value = "/categorias", method = RequestMethod.GET, produces = "application/json")
    public List<Categoria> getDocentes() {
        return categoriaService.findAllCategoria();
    }

    @RequestMapping(value = "/categorias/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Categoria> getAlumno(@PathVariable Long id) {
        return categoriaService.findCategoriaById(id);
    }

    @RequestMapping(value = "/categorias/add", method = RequestMethod.POST, produces = "application/json")
    public Categoria addPostPost(Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @RequestMapping(value = "/categorias/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deletePost(@PathVariable Long id) {
        return categoriaService.deleteCategoria(id);
    }

    @RequestMapping(value = "/categorias/update", method = RequestMethod.PUT, produces = "application/json")
    public String updateCategoria(Categoria categoria) {
        return categoriaService.updateCategoria(categoria);
    }

}
