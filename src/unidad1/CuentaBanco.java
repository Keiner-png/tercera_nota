package unidad1;

public class CuentaBanco {
    public static void main(String[] args) {
         float saldo = 1000.0f;
       final float MONTO_RETIRO = 200.00f;
        System.out.println("Hola, su saldo actual es de: " + saldo);
        // Primer retiro
        saldo -= MONTO_RETIRO;
        System.out.println("Su saldo despues del retiro en la primera semana es de: " + saldo);
        // Segundo retiro
        saldo -= MONTO_RETIRO;
        System.out.println("Su saldo despues del retiro en la segunda semana es de: " + saldo);
        // Tercer retiro
        saldo -= MONTO_RETIRO;
        System.out.println("Su saldo despues del retiro en la tercera semana es de: " + saldo);
        // Cuarto retiro
        saldo -= MONTO_RETIRO;
        System.out.println("Su saldo despues del retiro en la cuarta semana es de: " + saldo);
        System.out.println("El saldo después de este mes es de: " +  saldo);
    }
}
