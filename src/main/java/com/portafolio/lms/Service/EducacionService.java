/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.lms.Service;

import com.portafolio.lms.Entity.Educacion;
import com.portafolio.lms.Repository.IEducacionRepository;
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
public class EducacionService {

    @Autowired
    IEducacionRepository educacionR;

    public List<Educacion> list() {
        return educacionR.findAll();
    }

    public Optional<Educacion> getOne(int id) {
        return educacionR.findById(id);
    }

    public Optional<Educacion> getByNombreE(String nombreE) {
        return educacionR.findByNombreE(nombreE);
    }

    public void save(Educacion educacion) {
        educacionR.save(educacion);
    }

    public void delete(int id) {
        educacionR.deleteById(id);
    }

    public boolean existsById(int id) {
        return educacionR.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return educacionR.existsByNombreE(nombreE);
    }
}
