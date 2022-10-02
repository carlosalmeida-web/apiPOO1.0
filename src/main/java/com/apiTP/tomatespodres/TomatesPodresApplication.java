package com.apiTP.tomatespodres;

import com.apiTP.tomatespodres.services.EmailService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TomatesPodresApplication  {


	public static void main(String[] args) {
		SpringApplication.run(TomatesPodresApplication.class, args);
	}

}
