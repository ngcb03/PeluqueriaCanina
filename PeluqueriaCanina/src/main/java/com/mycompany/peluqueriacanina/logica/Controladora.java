package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    private static final ControladoraPersistencia controlPersis = ControladoraPersistencia.getInstance();
    

    
// Implementamos patrón singleton
    
    private static Controladora controladora = null;
    
    private Controladora(){}
    
    public static Controladora getInstance(){
        
        if (controladora == null){
            return (controladora = new Controladora());
        }   return controladora;
        
    }

    private static int idIncremental = 0;
    private static Mascota mascota;
    private static Duenio duenio;
    private static Cliente cliente;
    
    public void crearCliente(String duenio, String celDuenio, String mascota, String raza, String color, String alergico, String atEspecial, String observaciones) {
        
        Controladora.mascota = new Mascota(idIncremental, mascota, raza, color, alergico);
        Controladora.duenio = new Duenio(idIncremental, duenio, celDuenio);
        Controladora.cliente = new Cliente(idIncremental, atEspecial, observaciones, Controladora.mascota, Controladora.duenio);
        
        controlPersis.crearMascota(Controladora.mascota);
        controlPersis.crearDuenio(Controladora.duenio);
        controlPersis.crearCliente(Controladora.cliente);
        
        Controladora.idIncremental++;
    }

    public List<Cliente> traerClientes() {
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int num_cliente) {
        controlPersis.borrarCliente(num_cliente);
    }

    public Cliente buscarCliente(int num_cliente) {
        return controlPersis.buscarCliente(num_cliente);
    }

    public void modificarCliente(int num_cliente, String duenio, String celDuenio, String mascota, String raza, String color, String alergico, String atEspecial, String observaciones) {
        Controladora.mascota = new Mascota(num_cliente, mascota, raza, color, alergico);
        Controladora.duenio = new Duenio(num_cliente, duenio, celDuenio);
        Controladora.cliente = new Cliente(num_cliente, atEspecial, observaciones, Controladora.mascota, Controladora.duenio);
        
        controlPersis.modificarMascota(Controladora.mascota);
        controlPersis.modificarDuenio(Controladora.duenio);
        controlPersis.modificarCliente(Controladora.cliente);
    }
    
}
