package com.upc.instituto.reporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioReporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioReporteApplication.class, args);
	}

}
