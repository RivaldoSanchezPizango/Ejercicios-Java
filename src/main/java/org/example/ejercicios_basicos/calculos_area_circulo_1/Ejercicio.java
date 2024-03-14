package org.example.ejercicios_basicos.calculos_area_circulo_1;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");

        double radio = sc.nextDouble();

        double areaCirculo = Math.PI*(Math.pow(radio, 2));

        System.out.println("El area del circulo es: " + areaCirculo);

    }
}
