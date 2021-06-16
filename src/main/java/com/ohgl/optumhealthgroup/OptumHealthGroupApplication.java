package com.ohgl.optumhealthgroup;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class OptumHealthGroupApplication {

	public static void main(String[] args) {
		log.info("Starting Application....");
		SpringApplication.run(OptumHealthGroupApplication.class, args);
	}

}
