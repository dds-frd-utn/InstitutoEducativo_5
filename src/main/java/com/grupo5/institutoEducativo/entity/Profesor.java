/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/*
 *
 * @author imano-oh
 */
@Entity
@Table(name = "profesores")
@XmlRootElement

public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@Column(name = "profesion")
	private String profesion;
	@JoinColumn(name = "id_docente", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Docente idDocente;
	@JoinColumn(name = "id_categoria", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Categoria idCategoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Docente getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Docente idDocente) {
		this.idDocente = idDocente;
	}

	public Categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

}
