/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m5.practica2.calculadora;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Pt2_Metodos {

    public static double pidiendoNumeros() {
        Scanner sc = new Scanner(System.in);
        String numero1;
        do {
            System.out.print("\nIntrodueix un numero: ");
            numero1 = sc.nextLine();
        } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
        double nume1 = Double.parseDouble(numero1);
        double n1 = new Double(numero1);
        return n1;
    }

    public static String pidiendoSignoOperacion() {
        Scanner sc = new Scanner(System.in);
        boolean comprobar = false;
        String operacion;
        do {
            System.out.println("\nQuina operació faras servir? (Indica el signe)");
            System.out.println(" + = sumar \n - = restar \n"
                    + " x = multiplicar \n / = dividir \n * = elevar primer num al segon num."
                    + "\n % = residu");
            operacion = sc.nextLine();
            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                    || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                    || operacion.equals("*")) {
                comprobar = true;
            } else {
                comprobar = false;
            }
        } while (comprobar != true);
        return operacion;
    }

    public static double calculando(double n1, double n2, String operacion) {
        Scanner sc = new Scanner(System.in);
        boolean comprobar = false;
        double res = 0;
        do {
            comprobar = true;
            switch (operacion) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "x":
                case "X":
                    res = n1 * n2;
                    break;
                case "/":
                    while (n2 == 0) {
                        System.err.println(" Al denominador hi ha un zero \n"
                                + "per a  evitar errors coloca un altre valor.");
                        n2 = Pt2_Metodos.pidiendoNumeros();
                    }
                    res = n1 / n2;
                    break;
                case "*":
                    res = Math.pow(n1, n2);
                    break;
                case "%":
                    while (n2 == 0) {
                        System.err.println(" Al denominador hi ha un zero \n"
                                + "per a  evitar errors coloca un altre valor.");
                        n2 = Pt2_Metodos.pidiendoNumeros();
                    }
                    res = n1 % n2;
                    break;
            }
        } while (comprobar != true);
        return res;
    }

    public static String continuarOperando() {
        Scanner sc = new Scanner(System.in);
        boolean comprobar = false;
        String operacion;
        System.out.println("\n Vols continuar operant? \n");
        System.out.println(" [s/n]");
        do {
            comprobar = true;
            operacion = sc.nextLine();

            switch (operacion) {
                case "s":
                case "S":
                case "n":
                case "N":
                    break;
                default:
                    System.err.println("\n Error, posa un valor vàlid. \n");
                    comprobar = false;
            }
        } while (comprobar != true);
        return operacion;
    }
}
