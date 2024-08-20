package com.example;

public class App {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        App calculator = new App();

        // Resultados de prueba
        System.out.println("3 + 2 = " + calculator.add(3, 2));
        System.out.println("3 - 2 = " + calculator.subtract(3, 2));
        System.out.println("3 * 2 = " + calculator.multiply(3, 2));
        System.out.println("3 / 2 = " + calculator.divide(3, 2));
        System.out.println("3 / 0 = " + calculator.divide(3, 0));  // Esto lanzará una excepción
    }
}
