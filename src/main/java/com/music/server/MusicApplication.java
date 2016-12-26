package com.music.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = MusicApplication.class)
public class MusicApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MusicApplication.class, args);
	}

}