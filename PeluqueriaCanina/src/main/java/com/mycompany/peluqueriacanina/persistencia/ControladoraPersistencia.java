package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Cliente;
import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private static final MascotaJpaController masJpa = MascotaJpaController.getInstance();
    private static final DuenioJpaController dueJpa = DuenioJpaController.getInstance();
    private static final ClienteJpaController cliJpa = ClienteJpaController.getInstance();
    
    
// Implementamos patrón singleton
    
    private static ControladoraPersistencia controlPersis = null;
    
    private ControladoraPersistencia(){}
    
    public static ControladoraPersistencia getInstance(){
        
        if (controlPersis == null) {
            return (controlPersis = new ControladoraPersistencia());
        } return null;
        
    }

    public void crearMascota(Mascota mascota) {
        masJpa.create(mascota);
    }

    public void crearDuenio(Duenio duenio) {
        dueJpa.create(duenio);
    }

    public void crearCliente(Cliente cliente) {
        cliJpa.create(cliente);
    }

    public List<Cliente> traerClientes() {
        return cliJpa.findClienteEntities();
    }

    public void borrarCliente(int num_cliente) {
        try {
            cliJpa.destroy(num_cliente);
            masJpa.destroy(num_cliente);
            dueJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente buscarCliente(int num_cliente) {
        return cliJpa.findCliente(num_cliente);
    }

    public void modificarMascota(Mascota mascota) {
        try {
            masJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            dueJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarCliente(Cliente cliente) {
        try {
            cliJpa.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
