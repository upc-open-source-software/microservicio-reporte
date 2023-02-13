package com.upc.instituto.reporte.entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="TBL_MATRICULA")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_matricula;

    private Long id_alumno;

    private Long id_asignatura;
    private Date fecha_creacion;
    private Double monto_pagar;
    private String estado;

    public Matricula(Long id_matricula, Long id_alumno, Long id_asignatura, Date fecha_creacion, Double monto_pagar, String estado) {
        this.id_matricula = id_matricula;
        this.id_alumno = id_alumno;
        this.id_asignatura = id_asignatura;
        this.fecha_creacion = fecha_creacion;
        this.monto_pagar = monto_pagar;
        this.estado = estado;
    }
    public Matricula(){

    }

    public Long getId_matricula() {
        return id_matricula;
    }

    public Long getId_alumno() {
        return id_alumno;
    }

    public Long getId_asignatura() {
        return id_asignatura;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public Double getMonto_pagar() {
        return monto_pagar;
    }

    public String getEstado() {
        return estado;
    }
}
