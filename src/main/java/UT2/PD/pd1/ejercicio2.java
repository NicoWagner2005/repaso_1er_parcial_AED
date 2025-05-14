
package UT2.PD.pd1;

public class ejercicio2 {

    private class Objeto {
        int clave;

        public Objeto(int clave) {
            this.clave = clave;
        }
    }

    public void miFuncion() {
        // Arreglo con objetos y claves
        Objeto[] arreglo = new Objeto[]{
                new Objeto(5),
                new Objeto(3),
                new Objeto(8),
                new Objeto(1),
                new Objeto(2)
        };

        int contadorSi = 0;
        int N = arreglo.length;

        for (int i = 1; i <= N - 1; i++) {
            for (int j = N - 1; j >= i; j--) {
                contadorSi++;  // Cuenta cada evaluación del "if"
                if (arreglo[j].clave < arreglo[j - 1].clave) {
                    Objeto temp = arreglo[j];
                    arreglo[j] = arreglo[j - 1];
                    arreglo[j - 1] = temp;
                }
            }
        }

        // Imprimir resultado
        System.out.println("La sentencia 'if' se evaluó " + contadorSi + " veces.");

        // Mostrar arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        for (Objeto o : arreglo) {
            System.out.print(o.clave + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ejercicio2 ej = new ejercicio2();
        ej.miFuncion();
    }
}
