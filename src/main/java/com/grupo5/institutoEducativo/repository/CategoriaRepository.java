/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.repository.CrudRepository;

import com.grupo5.institutoEducativo.entity.Categoria;
import java.util.Optional;

/**
 *
 * @author imano-oh
 */
public interface CategoriaRepository extends CrudRepository<Entity, Id> {
    void save(Optional<Categoria> CategoriaToUpdate);
}
