package com.example.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = { "com.example.songr", "com/example/songr/Controller"} )
//@ComponentScan(basePackages = { "com.example.songr", "com/example/songr/Model"} )
//@ComponentScan(basePackages = { "com.example.songr", "com/example/songr/Repos"} )
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

}
