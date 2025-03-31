package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

// Escribe un metodo int readNumber() que utilice un Scanner para leer un
//  número entero, en caso de que el usuario introduzca algo que no sea
//  un número vuelve a pedir el número hasta que lo haga correctamente.

public class Ej1 {
    private static final Logger log = LoggerFactory.getLogger(ExceptionsExample.class);
    private final static Scanner scanner = new Scanner(System.in);


    public static int askInt(){
        // inicializamos la variable donde queremos ugardar el numero
        Integer number = null;
        do{
            try {
                log.info("Introduce un número entero");
                number = scanner.nextInt();
            } catch (InputMismatchException e){
                log.error("El valor introducido no es un entero");
            }
            scanner.nextLine();
        }while (number == null);
        return number;
    }

    public static void main(String[] args) {
        int number = askInt();
        log.info("El número introducido es " + number);
    }
}
