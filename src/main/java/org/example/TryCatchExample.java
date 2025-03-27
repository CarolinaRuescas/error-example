package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    private static final Logger log = LoggerFactory.getLogger(TryCatchExample.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            log.info("" + Math.sqrt(-1));
            log.info("Introduce un número");
            int number = scanner.nextInt();
            scanner.nextLine();

            log.info("Introduce otro número");
            int number2 = scanner.nextInt();
            scanner.nextLine();
            log.info("La división es " + number / number2);

        } catch (InputMismatchException e) {
            log.error("El valor introducido no es un número");
        }
    }
}
