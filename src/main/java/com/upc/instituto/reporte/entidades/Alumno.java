package com.upc.instituto.reporte.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_ALUMNO")
public class Alumno {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccion;
    private String celular;
    private String correo;

    public Alumno(Long codigo, String nombres, String apellidos, Date fechaNacimiento, String direccion, String celular, String correo){
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.celular = celular;
        this.correo = correo;
    }
    public Alumno(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }
}
