package com.xloud.poseidon.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan({ "com.xloud.poseidon.service" })
public class PoseidonServiceApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(PoseidonServiceApplication.class).profiles("web").run(args);
	}
}
