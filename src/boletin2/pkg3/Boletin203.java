// Crea un algoritmo que cambie euros a dólares.
package boletin2.pkg3;

import java.util.Scanner;

public class Boletin203 {

    public static void main(String[] args) {
        // Codigo del programa.
        float e, d = 1.25149f, c;
        //e=euros d=dolares c=cambio.
        //1€=1'25149 dólares.
        System.out.println("Conversión de euros a dólares");
        System.out.print("euros: ");
        Scanner dato = new Scanner(System.in);
        e = dato.nextFloat();

        c = e * d;

        System.out.println("Conversión: " + c);
        System.out.println("1€=1'25149 dólares.");
    }

}
