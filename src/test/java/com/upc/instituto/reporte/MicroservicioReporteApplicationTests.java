package com.upc.instituto.reporte;

import com.upc.instituto.reporte.entidades.Matricula;
import com.upc.instituto.reporte.negocio.IReporteNegocio;
import com.upc.instituto.reporte.negocio.ReporteNegocio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicroservicioReporteApplicationTests {

	@Autowired
	private IReporteNegocio reporteNegocio;

	@Test
	void contextLoads() {
	}

	@Test
	void testreporte(){
		List<Matricula> listado;
		listado = reporteNegocio.listareporte(Long.valueOf("4"));
		for (Matricula matricula:listado){
			System.out.println(matricula);
		}


	}
}
