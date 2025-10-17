package Unidad2;

  // Creacion de una clase llamada Persona
    class Persona {
        // Creacion de un atributo de tipo String llamada nombre dentro de la clase Persona.
       String nombre;
    }

public class PasoPorReferenciaE2 {
    //Metodo principal
    public static void main(String[] args) {
        // Creacion del objeto
        Persona persona = new Persona();
        persona.nombre = "Keiner";
        // Mostramos el valor de presona.nombre antes de modificarlo
        System.out.println("Antes de modificarlo: " + persona.nombre);
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre);  // Debería imprimir María
    }

    // Creacion de un metodo para cambiarle el valor a la variable persona
    public static void cambiarNombre(Persona persona) {
        persona.nombre = "María";
    }
}

