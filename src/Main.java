/*
 * El código de este archivo genera una cadena de números en el m1 la cual
 * es ordenada previamente en el método m2 y finalmente te muestra la hora
 * en la última línea.
 * <p>
 * El método m1 se encarga de generar números aleatorios con los parámetros
 * que recibe del método main y devolverlos en el sout V1. A continuación se
 * encarga de llamar al método m2 para poner la cadena que ya ha sido ordenada
 * por el propio método y a continuación lo muestra con un sout llamado V2.
 * Finalmente muestra con un sout la hora, los minutos y segundos a la hora de
 * ejecutar el código.
 * <p>
 * El método m2 se encarga de coger los números del método m1 y a continuación
 * se pone a ordenarlos.
 *
 * Las líneas con comentarios es código que ha sido desechado.
 *
 * @author mario
 *
 */

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println(m1(4, 0, 20));
    }

    public static String m1(int a, int b, int c) {
        //long d = System.currentTimeMillis();

        int[] e = new int[a];
        for (int i = 0; i < e.length; i++) {
            e[i] = ThreadLocalRandom.current().nextInt(b, c + 1);
        }

        System.out.print("V1: ");
        for (int j : e) {
            System.out.print(j + " ");
        }

        System.out.println();
        m2(e, 0, e.length - 1);

        System.out.print("V2: ");
        for (int j : e) {
            System.out.print(j + " ");
        }

        System.out.println();
        long f = System.currentTimeMillis();
        return String.format("%1$tH:%1$tM:%1$tS", f);
    }

    public static void m2(int[] a, int b, int c) {
        int i = b, j = c;
        int d = a[(b + c) / 2];

        //while (i <= j) {
        while (a[i] < d) {
            i++;
        }

        while (a[j] > d) {
            j--;
        }

        if (i <= j) {
            int e = a[i];
            a[i] = a[j];
            a[j] = e;

            i++;
            j--;
        }
        //}

        if (b < j) {
            m2(a, b, j);
        }

        if (i < c) {
            m2(a, i, c);
        }
    }

}
