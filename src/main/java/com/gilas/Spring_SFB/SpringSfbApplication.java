package com.gilas.Spring_SFB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringSfbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSfbApplication.class, args);
	}

}
