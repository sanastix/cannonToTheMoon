package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        double g = 6.673 * Math.pow(10, -11);
        double m1 = 81; // маса Землі у 81 раз більше маси Місяця
        double m2 = 1; // маса Місяця
        double r = Math.sqrt(x * x + y * y); // відстань до точки (x, y) від центра Землі
        double rMoon = Math.sqrt(Math.pow(x - 384000, 2) + y * y); // відстань до точки (x, y) від центра Місяця

        double forceEarth = g * m1 * m2 / (r * r);
        double forceMoon = g * m1 * m2 / (rMoon * rMoon);

        if (forceEarth > forceMoon) {
            System.out.println("Earth");
        } else if (forceEarth < forceMoon) {
            System.out.println("Moon");
        } else {
            System.out.println("Equal");
        }

    }
}