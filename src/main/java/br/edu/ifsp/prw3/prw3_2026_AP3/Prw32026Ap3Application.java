package br.edu.ifsp.prw3.prw3_2026_AP3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Prw32026Ap3Application {

	public static void main(String[] args) {
		SpringApplication.run(Prw32026Ap3Application.class, args);
	}

}
