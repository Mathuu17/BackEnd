/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.lms.Service;

import com.portafolio.lms.Entity.Experiencia;
import com.portafolio.lms.Repository.IExperienciaRepository;
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
public class ExperienciaService {

    @Autowired
    IExperienciaRepository experienciaR;

    public List<Experiencia> list() {
        return experienciaR.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return experienciaR.findById(id);
    }

    public Optional<Experiencia> getByNombreE(String nombreE) {
        return experienciaR.findByNombreE(nombreE);
    }

    public void save(Experiencia expe) {
        experienciaR.save(expe);
    }

    public void delete(int id) {
        experienciaR.deleteById(id);
    }

    public boolean existsById(int id) {
        return experienciaR.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return experienciaR.existsByNombreE(nombreE);
    }
}
