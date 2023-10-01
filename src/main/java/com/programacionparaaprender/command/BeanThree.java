package com.programacionparaaprender.command;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Order(value=1)
@Component
@Slf4j
public class BeanThree implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("BeanThree run method Started !!");
    }
}
