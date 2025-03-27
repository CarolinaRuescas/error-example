package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

        private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Introduce un número positivo");
        int number = scanner.nextInt();
        scanner.nextLine();
        if( number < 0) {
            log.warn("El número introducido es negativo!!!");
        }

        factorial(5);

    }

    public static String test(String message) {
        log.info("Hola, " + message);
        return "Hola, " + message;
    }

    public static int factorial(int number) {
        int res = number;
        log.debug("Empezamos con " + res);
        for (int i = 1; i < number; i++) {
            res *= i;
            log.debug("Lo multiplico por " + i + " y me da " + res);

        }

        log.info("El resultado es " + res);
        return res;
    }

}