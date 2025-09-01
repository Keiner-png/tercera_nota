package unidad1;

public class TiendaRopa {
    public static void main(String[] args) {
         float descuento = 0.15f;
        float precioCamiseta = 25.0f;
        float precioPantalon = 30.0f;
        double descuentoCamiseta = precioCamiseta - (precioCamiseta * descuento);
        double descuentoPantalon = precioPantalon - (precioPantalon * descuento);
        double totalConDescuento = descuentoCamiseta + descuentoPantalon;
        System.out.println("*** Tienda de Ropa ***");
        System.out.printf("El precio de las dos prendas con descuentos es: %.2f ", totalConDescuento);
        System.out.println();
        // Segunda camiseta
        totalConDescuento += precioCamiseta;
        double segundaCamiseta = totalConDescuento - (totalConDescuento * 0.05);
        totalConDescuento = segundaCamiseta;
        System.out.printf("El precio de las tres prendas es de: %.2f ", totalConDescuento);
    }
}
