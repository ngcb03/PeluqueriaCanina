package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String atencionEspecial;
    private String observaciones;
    
    @OneToOne
    Mascota mascota;
    
    @OneToOne
    Duenio duenio;

    public Cliente() {
    }
    
    public Cliente(int id, String atencionEspecial, String observaciones, Mascota mascota, Duenio duenio) {
        this.id = id;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.mascota = mascota;
        this.duenio = duenio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
}
