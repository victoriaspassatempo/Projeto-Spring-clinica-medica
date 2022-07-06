package com.cadastro.colaborador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
@EnableJpaRepositories
public class CadastroColaboradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroColaboradorApplication.class, args);
	}

}
