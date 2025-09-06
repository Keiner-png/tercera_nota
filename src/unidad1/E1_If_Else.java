package unidad1;

import java.util.Scanner;

public class E1_If_Else {
    public static void main(String[] args) {
        // Determinar el mayor de tres numeros
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenio al comparador de números ***");
        int numMayor = 0;
        System.out.print("Ingrese el primer número: ");
        int num1 = consola.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = consola.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = consola.nextInt();
        if (num1 > num1 && num1 > num3) {
            numMayor = num1;
        } else if (num2 > num1 && num2 > num3 ) {
            numMayor = num2;
        } else
            numMayor = num3;
        System.out.println("El número mayor de los tres es: " + numMayor);
        consola.close();
    }
}
