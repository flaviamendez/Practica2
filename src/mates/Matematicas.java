	
package src.mates;

/**
 * La clase Matematicas proporciona métodos para realizar cálculos matemáticos.
 */
public class Matematicas {
    
    /**
     * Calcula el valor aproximado de pi utilizando un enfoque recursivo.
     * 
     * @param pasos El número de pasos para realizar el cálculo.
     * @return El valor aproximado de pi.
     */
    public static double piRecursivoRecursivo(long pasos) {
        return piRecursivoRecursivo(pasos, 0, 0);
    }

    private static double piRecursivoRecursivo(long pasos, long contador, long puntosDentroDelCirculo) {
        if (contador == pasos) {
            return 4 * (double) puntosDentroDelCirculo / pasos;
        } else {
            double x = Math.random();
            double y = Math.random();
            // Si el punto generado está dentro del círculo de radio 1, incrementamos el contador
            if (x * x + y * y <= 1) {
                puntosDentroDelCirculo++;
            }
            return piRecursivoRecursivo(pasos, contador + 1, puntosDentroDelCirculo);
        }
    }
}
        
        