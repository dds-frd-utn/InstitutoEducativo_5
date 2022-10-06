/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.grupo5.institutoEducativo.entity.Profesor;
import com.grupo5.institutoEducativo.service.ProfesorService;

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
public class ProfesorController {

    @Autowired(required = false)
    ProfesorService profesorService;

    @RequestMapping(value = "/profesores", method = RequestMethod.GET, produces = "application/json")
    public List<Profesor> getProfesor() {
        return profesorService.findAllProfesor();
    }

    @RequestMapping(value = "/profesores/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Profesor> getProfesor(@PathVariable Long id) {
        return profesorService.findProfesorById(id);
    }

    @RequestMapping(value = "/profesores/add", method = RequestMethod.POST, produces = "application/json")
    public Profesor addPostPost(Profesor profesor) {
        return profesorService.saveProfesor(profesor);
    }

    @RequestMapping(value = "/profesores/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deletePost(@PathVariable Long id) {
        return profesorService.deleteProfesor(id);
    }

    @RequestMapping(value = "/profesores/update", method = RequestMethod.PUT, produces = "application/json")
    public String updateProfesor(Profesor profesor) {
        return profesorService.updateProfesor(profesor);
    }

}
