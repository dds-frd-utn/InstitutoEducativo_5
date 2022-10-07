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
@Table(name = "socios")
@XmlRootElement

public class Socio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	@Basic(optional = false)
	@Column(name = "antiguedad")
	private int antiguedad;
	@Basic(optional = false)
	@Column(name = "valor_acordado")
	private float valorAcordado;
	@JoinColumn(name = "id_docente", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Docente idDocente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public float getValorAcordado() {
		return valorAcordado;
	}

	public void setValorAcordado(float valorAcordado) {
		this.valorAcordado = valorAcordado;
	}

	public Docente getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Docente idDocente) {
		this.idDocente = idDocente;
	}

}
