package com.programacionparaaprender.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.programacionparaaprender.app.demo.SpringCommandlineApplication;

import lombok.extern.slf4j.Slf4j;

@Order(value=3)
@Component
@Slf4j
public class BeanOne implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("BeanOne run method Started !!");
    }
}
