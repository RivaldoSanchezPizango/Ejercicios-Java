package org.example.ejercicio_condicionales.es_divisible;

import java.util.Scanner;

public class EsDivisible {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero  entero: ");

        int numero1 = sc.nextInt();

        System.out.println("Ingrese un segundo numero entero: \n Debe ser diferente al primer numero ");

        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los numeros tienen que ser diferentes.");
            System.exit(0);
        }

        if (numero2 > numero1) numero1 = numero2;

        if (numero1 % 2 == 0) System.out.println("El numero es par.");
        else System.out.println("El numero no es par.");

        if (numero2 % 5 == 0) System.out.println("El numero es divisible entre 5.");
        else System.out.println("El numero no es divisible entre 5.");



    }
}
