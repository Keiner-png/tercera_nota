package unidad1;

import java.util.Scanner;

public class MediaOPromedio {
    public static void main(String[] args) {
        System.out.println("*** Calcular la media ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduzca el  primer número: ");
        float num1 = consola.nextFloat(); 
        System.out.print("Introduzca el segudo número: ");
        float num2 = consola.nextFloat(); 
        System.out.print("Introduzca el tercer número: ");
        float num3 = consola.nextFloat();
        float suma = num1 + num2 + num3;
        float media = suma / 3;
        System.out.printf("La media de los tres números ingresaados es: %.2f", media);
        consola.close();
    }
}
