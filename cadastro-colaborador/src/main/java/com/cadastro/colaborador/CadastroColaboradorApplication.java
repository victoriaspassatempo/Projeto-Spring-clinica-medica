package com.cadastro.colaborador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;


@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
public class CadastroColaboradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroColaboradorApplication.class, args);
		System.out.println("Aplicação no ar!");
	}

}
