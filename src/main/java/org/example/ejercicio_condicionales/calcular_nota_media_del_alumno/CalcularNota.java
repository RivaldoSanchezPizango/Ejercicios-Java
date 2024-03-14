package org.example.ejercicio_condicionales.calcular_nota_media_del_alumno;

import java.util.Scanner;

public class CalcularNota {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros, para calcular el promedio de nota");

        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        int promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota final: " + promedio);

        if (promedio <= 4 ) {
            System.out.println("Desaprobado");
        } else if (promedio <= 6 ) {
            System.out.println("Aprobado bien");
        } else if (promedio <= 10 ) {
            System.out.println("Aprobado excelente");
        } else {
            System.out.println("Las notas que ingresaste no son validas");
        }

    }
}
