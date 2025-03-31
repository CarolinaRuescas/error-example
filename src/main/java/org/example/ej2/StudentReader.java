package org.example.ej2;

import lombok.extern.log4j.Log4j;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log4j
public class StudentReader implements Reader<Student>{
    private final Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Student read() {
        log.info("introduce el NIF");
        String nif = scanner.nextLine();

        log.info("Introduce el nombre");
        String name = scanner.nextLine();

        log.info("Introduce los apellidos");
        String surname = scanner.nextLine();

        int zipCode = askZipCode();

        return new Student(
                nif,
                name,
                surname,
                zipCode
        );

    }

    private int askZipCode(){
        Integer zipCode = null;
        do{
            log.info("Introduce el código postal");
            zipCode = askInteger();
            if(zipCode < 0){
                log.info("El código postal debe ser positivo");
            }
        }while (zipCode < 0);
        return zipCode;
    }

    private int askInteger(){
        Integer number = null;
        do{
            try{
                number = scanner.nextInt();
            }catch (InputMismatchException e){
                log.error("El valor introducido no es un número entero");
            }finally{
                scanner.nextLine();
            }
        }while (number == null);
        return number;
    }
}
