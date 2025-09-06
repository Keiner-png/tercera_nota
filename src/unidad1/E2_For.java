package unidad1;

public class E2_For {
    public static void main(String[] args) {
        // Contador de números pares
        int numerosPares = 0 ;
        for (int i = 1 ; i <= 100 ; i ++){
            if (i % 2 == 0) {
                System.out.print(i + ", " );
                numerosPares ++;
            }
        }
        System.out.println("\nLa cantidad de números pares que hay entre 1 y 100 es de: " + numerosPares);
    }
}
