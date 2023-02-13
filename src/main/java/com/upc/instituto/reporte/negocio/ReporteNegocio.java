package com.upc.instituto.reporte.negocio;

import com.upc.instituto.reporte.repositorio.IReporteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteNegocio implements IReporteNegocio {
    @Autowired
    IReporteRepositorio iReporteRepositorio;

    @Override
    public List<Object[]> findById_asignatura(Long asignatura) {
        return iReporteRepositorio.findById_asignatura(asignatura);
    }


    /*public List<Matricula> listareporte(Long asignatura) {
        return iReporteRepositorio.ObtenerReporte(asignatura);
    }*/



}
