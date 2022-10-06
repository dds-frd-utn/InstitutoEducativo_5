/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.institutoEducativo.entity.Docente;

import java.util.Optional;

/**
 *
 * @author imano-oh
 */
/*
public interface DocenteRepository extends CrudRepository<Entity, Id> {
    void save(Optional<Docente> DocenteToUpdate);
}
*/
@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    void save(Optional<Docente> DocenteToUpdate);
}
