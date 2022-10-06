/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.institutoEducativo.entity.Categoria;

import java.util.Optional;

/**
 *
 * @author imano-oh
 */
/*
public interface CategoriaRepository extends CrudRepository<Entity, Id> {
    void save(Optional<Categoria> CategoriaToUpdate);
}
*/

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    void save(Optional<Categoria> CategoriaToUpdate);
}