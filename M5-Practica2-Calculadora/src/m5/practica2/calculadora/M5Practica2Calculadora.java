/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5.practica2.calculadora;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class M5Practica2Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double res = 0;
        String operacion;

        do {

            double n1 = Pt2_Metodos.pidiendoNumeros();

            operacion = Pt2_Metodos.pidiendoSignoOperacion();

            double n2 = Pt2_Metodos.pidiendoNumeros();

            res = Pt2_Metodos.calculando(n1, n2, operacion);

            System.out.println("(" + n1 + ") " + operacion + " (" + n2 + ")" + " = " + res);

            operacion = Pt2_Metodos.continuarOperando();
        } while (operacion.equals("s") || operacion.equals("S"));
    }
    
}
