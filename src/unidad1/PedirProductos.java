package unidad1;

import java.util.Scanner;

public class PedirProductos {
    public static void main(String[] args) {
      Scanner consola = new Scanner(System.in);
       // Creación de la lista 
       String[] nombreCarros = new String[5]; 
       //Ciclo for para pedir productos 
       for ( int i = 1; i < 5; i ++){
        System.out.println("Ingresa el nombre del carro " + i + ": ");
        nombreCarros[i] = consola.nextLine();
       }
       // Ciclo for para imprimir los productos
        System.out.println("Lista de carros en el orden ingresado");
        for(int i = 1 ; i < 5; i++){
            System.out.println("Carro " + i + ": " + nombreCarros[i]);
        }
        consola.close();
    }
}


