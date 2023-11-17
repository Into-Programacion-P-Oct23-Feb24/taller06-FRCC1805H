/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreempleado;
        int tipoempleado;
        double sueldo;
        double incrementosueldo;
        double sueldototal;

        System.out.println("Nombre de empleado:");
        nombreempleado = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado"
                + "Empleado tipo 1 dijite:1\n"
                + "Empleado tipo 2 dijite:2\n"
                + "Empleado tipo 3 dijite:3\n"
                + "Empleado tipo 4 dijite:4\n"
                + "Empleado tipo 5 dijite:5");
        tipoempleado = entrada.nextInt();
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextDouble();

        incrementosueldo = 0;
        sueldototal = sueldo;

        switch (tipoempleado) {
            case 1:

                incrementosueldo = (sueldo * 5) / 100;
                sueldototal = sueldo + incrementosueldo;
                break;

            case 2:

                incrementosueldo = (sueldo * 7) / 100;
                sueldototal = sueldo + incrementosueldo;
                break;

            case 3:

                incrementosueldo = (sueldo * 9) / 100;
                sueldototal = sueldo + incrementosueldo;

                break;

            case 4:

                incrementosueldo = (sueldo * 9) / 100;
                sueldototal = sueldo + incrementosueldo;

                break;

            case 5:

                incrementosueldo = (sueldo * 15) / 100;
                sueldototal = sueldo + incrementosueldo;

                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        System.out.printf("Nombre de empleado: %s\n"
                + "Incremento del sueldo: %.2f\n"
                + "Suelo toltal:%.2f\n",
                nombreempleado, incrementosueldo, sueldototal);
    }
}
