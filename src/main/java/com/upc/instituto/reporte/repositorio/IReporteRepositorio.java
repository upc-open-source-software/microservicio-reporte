package com.upc.instituto.reporte.repositorio;

import com.upc.instituto.reporte.entidades.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;


public interface IReporteRepositorio extends JpaRepository<Matricula, Long> {
    @Query("SELECT t1, t2, t3 FROM Matricula t1 INNER JOIN Asignatura t2 ON t1.id_asignatura = t2.codigo INNER JOIN Alumno t3 ON t1.id_alumno = t3.codigo WHERE t1.id_asignatura = :asignatura")
    List<Object[]> findById_asignatura(@Param("asignatura")Long asignatura);
  //  public List<Matricula> ObtenerReporte(@Param("asignatura")Long asignatura);
}
