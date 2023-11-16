/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  E
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int opcion;
        int valor1;
        int valor2;
        int resultado = 0;

        System.out.print("Ingrese el primer valor ");
        valor1 = entrada.nextByte();
        System.out.print("Ingrese el segundo valor ");
        valor2 = entrada.nextByte();
        System.out.println("Seleccione la opcion que desea realizar\n"
                + "dijite 1 para sumar\n"
                + "dijitw 2 para restar\n"
                + "dijite 3 para multiplicar\n "
                + "dijte 4 para dividir\n");

        opcion = entrada.nextInt();

        if (valor1 > valor2) {
            switch (opcion) {

                case 1:
                    resultado = valor1 + valor2;
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    break;

                case 4:
                    resultado = valor1 / valor2;
                    break;

                default:
                    System.out.println(" resultado incorrecto");
                    break;

            }

        } else {
            System.out.println("fuera de rango");

        }

        System.out.printf("resultado de la operacion es : %d\n", 
                resultado);

    }
}
