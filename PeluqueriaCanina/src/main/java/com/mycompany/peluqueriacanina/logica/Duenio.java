package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombreDuenio;
    private String celDuenio;
    
    @OneToOne(mappedBy = "duenio")
    Cliente cliente;

    public Duenio() {
    }

    public Duenio(int id, String nombreDuenio, String celDuenio) {
        this.id = id;
        this.nombreDuenio = nombreDuenio;
        this.celDuenio = celDuenio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
