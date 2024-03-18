
/**
 * La clase Principal es la clase principal del programa.
 * Contiene el método main que imprime el valor de PI utilizando el método piRecursivoRecursivo de la clase Matematicas.
 */
package src.aplicacion;
import src.mates.Matematicas;
public class Principal{public static void main(String[] args){
    System.out.println("El número PI es " + Matematicas.piRecursivoRecursivo(1000));

    }
}