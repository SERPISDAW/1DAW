/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ED;

/**
 *  Este codigo tiene dos metodos que se encargan de generar una cadena de numeros que se 
 *  enseña como V1 y despues se ordena y se enseña como V2. También se enseña la hora en
 *  la que se ha usado el codigo.
 * 
 * El metodo m1 es el que enseña los dos arrays y en el main se especifica el numero de numeros
 * generados en el array, el minimo de los numeros generados aleatoriamente y el maximo, en este 
 * orden. El array generado se enseña como V1, el array ordenado se enseña como V2 y también se 
 * enseña la hora exacta en el que se ha usado.
 * 
 * El método m2 se encarga de ordenar los números generados en el m1 y se ordena de manera 
 * ascendente (de menor a mayor).
 * 
 * Las lineas comentadas son variables que no se han usado
 * @author carcas
 *
 */
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println(m1(10, 0, 20));
    }

    public static String m1(int a, int b, int c) {
        // long d = System.currentTimeMillis();
        
        int[] e = new int[a];
        for (int i = 0; i < e.length; i++) {
            e[i] = ThreadLocalRandom.current().nextInt(b, c + 1);
        }

        System.out.print("V1: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }

        System.out.println("");
        m2(e, 0, e.length - 1);

        System.out.print("V2: ");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }

        System.out.println("");
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
