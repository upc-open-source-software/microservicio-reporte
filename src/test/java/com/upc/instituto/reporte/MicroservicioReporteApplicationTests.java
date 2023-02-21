package com.upc.instituto.reporte;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.upc.instituto.reporte.negocio.IReporteNegocio;

@SpringBootTest
class MicroservicioReporteApplicationTests {

	@Autowired
	private IReporteNegocio reporteNegocio;

	@Test
	void contextLoads() {
	}


	/*@Test
	/void testreporte(){
		List<Matricula> listado;
		listado = reporteNegocio.listareporte(Long.valueOf("4"));
		for (Matricula matricula:listado){
			System.out.println(matricula);
		}

	}*/
}
