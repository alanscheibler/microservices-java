package br.edu.atitus.paradigma.saudacao_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerviceApplication.class, args);
	}

}
