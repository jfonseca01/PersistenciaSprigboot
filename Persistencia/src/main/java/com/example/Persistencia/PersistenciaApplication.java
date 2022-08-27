package com.example.Persistencia;

import com.example.Entidades.Empleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PersistenciaApplication {

	public static void main(String[] args) {

		SpringApplication.run(PersistenciaApplication.class, args);
		Empleado empleado1 = new Empleado();
		empleado1.setName("Pedro");
		System.out.println("RESULTADO DEL NOMBRE DEL EMPLEADO 1: "+empleado1.getName());
	}

}
