package org.example;

import lombok.extern.log4j.Log4j;

import java.util.InputMismatchException;
import java.util.Scanner;

// Escribe un programa que pide un número double, luego pide otro número
// double que debe ser distinto de cero. El programa calcula la división
// entre ambos números y la muestra en pantalla.

@Log4j
public class Ej3 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double numerator = askOtherDouble();
        double denominator = askNotZero();

        double res = numerator / denominator;

        log.info("El resultado es " + res);
    }

    private static double askNotZero() {
        Double number = null;
        do {
            number = askOtherDouble();
            if (number == 0) {
                log.error("El número no debe ser cero");
            }
        } while (number == 0);
        return number;
    }


    private  static double askOtherDouble(){
        Double number = null;
        do{
            try{
                number = scanner.nextDouble();
            }catch (InputMismatchException e){
                log.error("El valor introducido no es un número entero");
            }finally{
                scanner.nextLine();
            }
        }while (number == null);
        return number;
    }

}
