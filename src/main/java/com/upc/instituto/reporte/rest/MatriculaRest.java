package com.upc.instituto.reporte.rest;


import com.upc.instituto.reporte.entidades.Matricula;
import com.upc.instituto.reporte.negocio.IReporteNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MatriculaRest {

    @Autowired
    private IReporteNegocio reporteNegocio;

    /*@GetMapping("/reportecursos/{asignatura}")
    public List<Matricula> listadoPorCurso(@PathVariable(value = "asignatura") Long asignatura){
        return reporteNegocio.listareporte(asignatura);
    }*/
    @GetMapping("/reportecursos/{asignatura}")
    public List<Object[]> findById_asignatura(@PathVariable(value = "asignatura") Long asignatura){
        return reporteNegocio.findById_asignatura(asignatura);
    }

}
