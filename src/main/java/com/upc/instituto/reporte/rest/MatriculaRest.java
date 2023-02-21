package com.upc.instituto.reporte.rest;


import com.upc.instituto.reporte.entidades.Matricula;
import com.upc.instituto.reporte.negocio.IReporteNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(
        origins = "http://localhost:4200",
        methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE },
        allowedHeaders = "*")
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
