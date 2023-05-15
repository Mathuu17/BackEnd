/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.lms.Service;

import com.portafolio.lms.Entity.Proyecto;
import com.portafolio.lms.Repository.IProyectoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcos
 */
@Service
@Transactional
public class ProyectoService {

    @Autowired
    IProyectoRepository proyectoR;

    public List<Proyecto> list() {
        return proyectoR.findAll();
    }

    public Optional<Proyecto> getOne(int id) {
        return proyectoR.findById(id);
    }

    public Optional<Proyecto> getByNombre(String nombre) {
        return proyectoR.findByNombre(nombre);
    }

    public void save(Proyecto proyecto) {
        proyectoR.save(proyecto);
    }

    public void delete(int id) {
        proyectoR.deleteById(id);
    }

    public boolean existsById(int id) {
        return proyectoR.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return proyectoR.existsByNombre(nombre);
    }
}
