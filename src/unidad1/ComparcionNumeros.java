package unidad1;

import java.util.Scanner;

public class ComparcionNumeros {
    public static void main(String[] args) {
         Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido al comparador de números ***");
        System.out.print("Introduzca el  primer número: ");
        float num1 = consola.nextFloat(); 
        System.out.print("Introduzca el segudo número: ");
        float num2 = consola.nextFloat(); 
        System.out.print("Introduzca el tercer número: ");
        float num3 = consola.nextFloat();
        boolean mayor = (num1 > num2) && (num1 < num3);
        System.out.println("¿Es el primer número es mayor que el segundo número y menor que el tercero?");
        System.out.println("Respuesta: " + mayor );
        consola.close();
    }
}
