package com.programacionparaaprender.app.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cavanosa.virtual.entity.Tio;
import com.cavanosa.virtual.service.TioService;
import com.programacionparaaprender.command.*;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
//@ComponentScan({"com.cavanosa.virtual.service", "com.cavanosa.virtual.service.impl", "com.cavanosa.virtual.repository"})
//@EnableJpaRepositories({"com.cavanosa.virtual.repository", "com.cavanosa.virtual.entity"})
public class SpringCommandlineApplication  implements CommandLineRunner, ExitCodeGenerator  {

	//@Autowired
    //TioService tioService;
	
	private int ExitCode = 0;
	
	@Bean
    public BeanThree applicationStartupRunner3() {
        return new BeanThree();
    }
	
	@Bean
    public BeanTwo applicationStartupRunner2() {
        return new BeanTwo();
    }
	
	@Bean
    public BeanOne applicationStartupRunner1() {
        return new BeanOne();
    }
	
	public static void main(String[] args) {
		int exitCode = SpringApplication.exit(SpringApplication.run(SpringCommandlineApplication.class, args));
		System.exit(exitCode);
	}

	@Override
	public int getExitCode() {
		return ExitCode;
	}

	@Override
	public void run(String... args) {
		log.info("Prueba de commandline");

		try{
			//List<Tio> list = tioService.findAll();
			//for(Tio tio: list) {
			//	System.out.println("tio: " + tio);
			//}
			ExitCode = -1;
        	throw new NullPointerException();

		}catch(Exception e) {
			log.error(e.getMessage(), e);
			ExitCode = 1;
		}
		log.info("ExitCode: " + ExitCode);
		
	}

}
