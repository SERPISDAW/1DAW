
import java.util.concurrent.ThreadLocalRandom;
//prueba


public class Main {

    public static void main(String[] args) {
        System.out.println(m1(3, 0, 20));
    }

    /**
     * La función m1 recibe tres argumentos enteros: a, b y c. La variable a
     * indica la longitud del arreglo a generar y las variables b y c indican el
     * rango de los números aleatorios a generar.
     *
     * @param a es el rango del array 
     * @param b es el rango de los numeros 
     * @param c tambien es el rango de los numeros 
     * @author vicbel
     * @version 1
     * @description este programa crea un array con longitud a con un rango
     * entre b y c
     * @see
     * @return devuelve un array de rango a que tiene numeros aleatorios entre b
     * y c
     *
     */
    public static String m1(int a, int b, int c) {

        //long d = System.currentTimeMillis();

//        Crea un array y pone numeros random entre un valor b y un valor c
        int[] e = new int[a];
        for (int i = 0; i < e.length; i++) {
            e[i] = ThreadLocalRandom.current().nextInt(b, c + 1);
        }

//        V1 pone los numeros que se han añadido al array
        System.out.print("V1: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }

//        Llama a m2 el cual los parametros son un array, un numero y el rango del array -1
        System.out.println("");
        m2(e, 0, e.length - 1);

//        V2 
        System.out.print("V2: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }

//        Pone la hora actual
        System.out.println("");
        long f = System.currentTimeMillis();
        return String.format("%1$tH:%1$tM:%1$tS", f);
    }

    /**
     * La funcion m2 ordena el vector generado por m1 
     *
     * @param a es el array 
     * @param b es el rango de los numeros 
     * @param c tambien es el rango de los numeros 
     * @author vicbel
     * @version 1
     * @description ordena el vector generado por m1
     * @see
     * @return devuelve el vector que se habia generado ordenado
     *
     */
    public static void m2(int[] a, int b, int c) {

//      le de a i un valor b y a j un valor c
        //int i = b, j = c;
        int d = a[(b + c) / 2];

        while (b <= c) {
            while (a[b] < d) {
                b++;
            }

            while (a[c] > d) {
                c--;
            }

            if (b <= c) {
                int e = a[b];
                a[b] = a[c];
                a[c] = e;

                b++;
                c--;
            }
        }

        if (b < c) {
            m2(a, b, c);
        }

        
    }

}
