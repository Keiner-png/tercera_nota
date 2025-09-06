package unidad1;

import java.util.Scanner;

public class E4_While {
    public static void main(String[] args) {
        // Hayar el factorial de un número ingresado por teclado
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Factorial de un número ***");
        System.out.print("Ingrese el número: ");
        int numero = consola.nextInt(); 
        int factorial = 1; 
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial del numero " + numero + " es: " + factorial);
        consola.close();
    }
}
