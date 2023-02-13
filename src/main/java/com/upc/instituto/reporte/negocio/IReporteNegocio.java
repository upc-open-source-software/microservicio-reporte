package com.upc.instituto.reporte.negocio;

import java.util.List;

public interface IReporteNegocio {

    //public List<Matricula> listareporte(Long id_asignatura);
    public List<Object[]> findById_asignatura(Long asignatura);
}
