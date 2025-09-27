package unidad1;

import java.util.Scanner;

public class Salarioo {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema de salarios ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo: ");
        int numeroLimite = consola.nextInt();
        double[] donaciones = new double[numeroLimite];
        double sumaDonaciones = 0;
        // Estructura repetitiva for
        for (int i = 0; i < numeroLimite; i++) {
            System.out.print("Ingrese la donacion " + (i + 1) + ": ");
            donaciones[i] = consola.nextDouble();
            sumaDonaciones = sumaDonaciones + donaciones[i];
        }
        System.out.println("La suma total de las donaciones es: " + sumaDonaciones );
        consola.close();
    }
    
}
