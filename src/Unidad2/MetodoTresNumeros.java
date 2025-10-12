package Unidad2;

public class MetodoTresNumeros {
    public static void main(String[] args) {
        //Dentro de este metodo main llamamos y le pasamos los argumentos (tres números a comparar) al "metodo numeroMayor"
        int mayor = numeroMayor(5, 9, 25);
        System.out.println("El número mayor es: " + mayor);
    }

    // Creamos el metodo donde le pasamos los tres argumentos a los paramatros, para encontrar el numero mayor entre tres numeros.
   public static int numeroMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
   }
}
