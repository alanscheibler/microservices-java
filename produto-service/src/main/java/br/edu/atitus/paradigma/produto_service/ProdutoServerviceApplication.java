package br.edu.atitus.paradigma.produto_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProdutoServerviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoServerviceApplication.class, args);
	}

}
