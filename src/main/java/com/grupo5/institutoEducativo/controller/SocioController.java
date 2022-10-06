/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.grupo5.institutoEducativo.entity.Socio;
import com.grupo5.institutoEducativo.service.SocioService;

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
//@RequestMapping("/url")
public class SocioController {

    @Autowired(required = false)
    SocioService socioService;

    @RequestMapping(value = "/socios", method = RequestMethod.GET, produces = "application/json")
    public List<Socio> getSocio() {
        return socioService.findAllSocio();
    }

    @RequestMapping(value = "/socios/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Socio> getSocio(@PathVariable Long id) {
        return socioService.findSocioById(id);
    }

    @RequestMapping(value = "/socios/add", method = RequestMethod.POST, produces = "application/json")
    public Socio addPostPost(Socio socio) {
        return socioService.saveSocio(socio);
    }

    @RequestMapping(value = "/socios/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deletePost(@PathVariable Long id) {
        return socioService.deleteSocio(id);
    }

    @RequestMapping(value = "/socios/update", method = RequestMethod.PUT, produces = "application/json")
    public String updateSocio(Socio socio) {
        return socioService.updateSocio(socio);
    }

}