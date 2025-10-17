package Unidad2;
    // Creacion de la clase Persona (La letra inicial de los nombres de las clases van con mayusculas)
 class Persona {
    // Creacion del atributo nombre dentro de la clase Persona
    String nombre;
 }

public class ReasignacionDeReferencia {
   // Dentro del metodo principal (Main)
   public static void main(String[] args) {
    // Creacion del objeto
    Persona persona = new Persona(); 
    persona.nombre = "Keiner"; 
    // Imprimimos el objeto antes de modificarlo
    System.out.println("Objeto antes de modificar (objeto original): " + persona.nombre);
    //Llamamos el metodo y le pasamos el argumento persona al parametro de entrada
    reasignarPersona(persona);
    System.out.println("Nombre después de reasignarPersona: " + persona.nombre);  // Debería imprimir Keiner

   }

   public static void reasignarPersona(Persona persona) {
    // Creacion de un nuevo objeto local al metodo (reasignarPersona)
     persona = new Persona();
     persona.nombre = "Maria";
   }
   
}
