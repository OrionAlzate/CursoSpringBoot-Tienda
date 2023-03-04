package com.example.tiendamoraazul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendamoraazulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendamoraazulApplication.class, args);
	}

}


// CAPAS: servicios, repositorios, entidades y controladores
// Repositorios son los que se comunican con los servicios
// Servicios son los que se comunican con la base de datos para obtener o brindar información
// Entidades son los que modelan la información de la base de datos (las tablas)

