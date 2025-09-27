package unidad1;

import java.util.Scanner;

public class DatosUsuario {
     public static void main(String[] args) {
        System.out.println("*** Sistema de detos de una persona ***");
        Scanner consola = new Scanner(System.in);
        String[] nombres = new String[3];
        int[] edades = new int[3];
        int[] documentos = new int[3];
        int tamanioArreglo = nombres.length;
        int edadMinima = 18;
        for (int i = 0; i < tamanioArreglo; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = consola.nextLine();
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = consola.nextInt();
            System.out.print("Ingrese el documento de la persona " + (i + 1) + ": ");
            documentos[i] = consola.nextInt();
            consola.nextLine();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Lista de datos de los usuarios");
        for (int i = 0; i < tamanioArreglo; i++) {
            if (edades[i] >= edadMinima) {
                System.out.printf("\nEl nombre de la persona " + (i + 1) + " es  %s, su edad es %d y su documento es %d." +
                                " ES MAYOR DE EDAD ", nombres[i], edades[i], documentos[i]);
            } else {
                System.out.printf("\nEl nombre de la persona " + (i + 1) + " es  %s, su edad es %d y su documento es %d." +
                        ". ES MENOR DE EDAD.", nombres[i], edades[i], documentos[i]);
            }

        }
        consola.close();
    }
}
