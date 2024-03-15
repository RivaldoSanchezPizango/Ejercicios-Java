package org.example.ejercicio_condicionales.primera_y_ultima_cifra;

import java.util.Scanner;

public class Cifras {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de maximo 5 cifras: ");

        int numero = sc.nextInt();
        int numeroAux = numero;

        if (numero < 0 || numero > 99999) {
            System.out.println("Numero invalido");
            System.exit(0);
        }

        System.out.println("La ultima cifra del numero: " + numero + " es: " + numero % 10);

        if(numero < 10) {
            System.out.println("La primera cifra es la misma que la ultima");
        } else if (numero < 100) {
            numeroAux /= 10;
            System.out.println("La primera cifra del numero: " + numero + " es: " + numeroAux % 10);
        } else if (numero < 1000) {
            numeroAux /= 100;
            System.out.println("La primera cifra del numero: " + numero + " es: " + numeroAux % 10);
        } else if (numero < 10000) {
            numeroAux = 1000;
            System.out.println("La primera cifra del numero: " + numero + " es: " + numeroAux % 10);
        } else {
            numeroAux = 10000;
            System.out.println("La primera cifra del numero: " + numero + " es: " + numeroAux % 10);
        }

    }
}
