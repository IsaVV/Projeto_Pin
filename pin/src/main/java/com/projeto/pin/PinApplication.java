package com.projeto.pin;

import com.projeto.pin.registroparada.RegistroParada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PinApplication {

	public static void main(String[] args) {
		RegistroParada registro = new RegistroParada();
		registro.registrar();

	}

}
