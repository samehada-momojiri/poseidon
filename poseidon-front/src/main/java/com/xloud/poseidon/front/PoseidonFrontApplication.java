package com.xloud.poseidon.front;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication()
public class PoseidonFrontApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(PoseidonFrontApplication.class).profiles("web").run(args);
	}
}
