package org.example.ejercicios_basicos.tabla_de_multiplicar_sin_bucles_2;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");

        int num1 = sc.nextInt();
        System.out.println(num1 + " x 1 = " + num1 );
        System.out.println(num1 + " x 2 = " + num1 * 2 );
        System.out.println(num1 + " x 3 = " + num1 * 3);
        System.out.println(num1 + " x 4 = " + num1 * 4);
        System.out.println(num1 + " x 5 = " + num1 * 5);
        System.out.println(num1 + " x 6 = " + num1 * 6);
        System.out.println(num1 + " x 7 = " + num1 * 7);
        System.out.println(num1 + " x 8 = " + num1 * 8);
        System.out.println(num1 + " x 9 = " + num1 * 9);


    }
}
