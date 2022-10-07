/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo5.institutoEducativo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author imano-oh
 */
@Entity
@Table(name = "socios")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s"),
    @NamedQuery(name = "Socio.findById", query = "SELECT s FROM Socio s WHERE s.id = :id"),
    @NamedQuery(name = "Socio.findByAntiguedad", query = "SELECT s FROM Socio s WHERE s.antiguedad = :antiguedad"),
    @NamedQuery(name = "Socio.findByValorAcordado", query = "SELECT s FROM Socio s WHERE s.valorAcordado = :valorAcordado")
})
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
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

    public Socio() {
    }

    public Socio(Long id) {
        this.id = id;
    }

    public Socio(Long id, int antiguedad, float valorAcordado) {
        this.id = id;
        this.antiguedad = antiguedad;
        this.valorAcordado = valorAcordado;
    }

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio))
        {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.grupo5.institutoEducativo.entity.Socio[ id=" + id + " ]";
    }
    
}
