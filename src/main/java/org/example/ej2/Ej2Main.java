package org.example.ej2;

import lombok.extern.log4j.Log4j;

import java.util.Scanner;

@Log4j
public class Ej2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var studentReader = new StudentReader(scanner);

        var student = studentReader.read();

        log.info(student.toString());
    }
}
