package Unidad2;
// Creacion de la clase Rectangulo
class Rectangulo {
    // Creación de los atributos que pertenecen a la clase Rectangulo
 int ancho; 
 int alto;
}

public class EjerPract2 {
    public static void main(String[] args) {
        // Creacion de un objeto que pertenece a la clase Rectangulo
        Rectangulo objeto = new Rectangulo();
        // Darle valores a los atributos del objeto
        objeto.ancho = 10;
        objeto.alto = 20;
        System.out.println("Atributos del objeto antes de llamar el metodo: " + objeto );
        modificarRectangulo(objeto);
    }
    
    // Creacion del metodo para modificar los atributos
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 100;
        System.out.println("Dentro del metodo: ancho= " + r.ancho +", alto = " + r.alto);
    }
}
