package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionsExample {
    private static final Logger log = LoggerFactory.getLogger(ExceptionsExample.class);

    public static void main(String[] args) {
        metodoA();
    }

    public static void metodoA() {
        metodoB("Ho");
    }


    public static void metodoB(String saludo) {
        log.info(saludo.substring(3));
    }
}
