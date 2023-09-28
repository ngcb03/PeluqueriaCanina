package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombreMascota;
    private String raza;
    private String color;
    private String alergico;
    
    @OneToOne(mappedBy = "mascota")
    Cliente cliente;
    
    public Mascota() {
    }

    public Mascota(int id, String nombreMascota, String raza, String color, String alergico) {
        this.id = id;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
            
}
