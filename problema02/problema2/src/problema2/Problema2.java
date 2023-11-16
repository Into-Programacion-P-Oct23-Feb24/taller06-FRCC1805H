/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String propietario;
        int tipo;
        double valor;
        double peaje;

        System.out.println("Ingrese el nombre del propietario");
        propietario = entrada.nextLine();
        System.out.println("Ingresar el dijito segun tipo de vehiculo"
                + "vehiculo liviano particular dijite:1\n"
                + "vehiculo grande particular dijite:2\n"
                + " Taxi dijite:3\n"
                + "Bus urbano:4");
        tipo = entrada.nextInt();
        System.out.println("Dijite el valor del vehiculo");
        valor = entrada.nextDouble();
        peaje = 0;
        switch (tipo) {
            case 1:
                peaje = ((valor * 0.01) / 100) + 2;
                break;

            case 2:
                peaje = ((valor * 0.02) / 100) + 2.5;
                break;
            case 3:
                peaje = ((valor * 0.04) / 100) + 1.5;
                break;
            case 4:
                peaje = ((valor * 0.05) / 100) + 2.2;
                break;
            default:
                System.out.println("vehiculo no valido");
                break;

        }
        System.out.printf("Peaje  Buen dia Propietario: %s "
                + "Tipo %s "
                + "Valor %.2f"
                + " Peaje:%.2f", propietario, tipo,
                valor, peaje);
    }

}
