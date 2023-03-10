// 1º DAW - Efraín Peris Manzano 

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println(m1(5, 0, 10));
    }

    /**
     * @author Programador Desconocido
     * @description Este método crea un array con un tamaño determinado y lo rellena con valores aleatorios entre un rango que le especificamos. Luego lo imprime y lo pasa por el método 'm2' para volverlo a imprimir. Además guarda la fecha actual.
     * @return Devuelve la fecha actual.
     * @param a: Longitud del array.
     * @param b: Rango mínimo para generar el valor de cada elemento.
     * @param c: Rango máximo para generar el valor de cada elemento.
    */
    public static String m1(int a, int b, int c) {
       // long d = System.currentTimeMillis();   Esta linea no es necesaria.

        int[] e = new int[a];
        for (int i = 0; i < e.length; i++) {e[i] = ThreadLocalRandom.current().nextInt(b, c + 1);}

        System.out.print("V1: ");
        for (int i = 0; i < e.length; i++) {System.out.print(e[i] + " ");}
        System.out.println("");
        
        m2(e, 0, 1);
        System.out.print("V2: ");
        for (int i = 0; i < e.length; i++) {System.out.print(e[i] + " ");}
        System.out.println("");
        
        long f = System.currentTimeMillis();
        return String.format("%1$tH:%1$tM:%1$tS", f);
    }

    /**
     * @author Programador Desconocido
     * @description Este método recibe un array e intercambia los elementos de las posiciones que le indicamos.
     * @param a[]: Array sobre el que se trabajará.
     * @param b: Posición origen a intercambiar.
     * @param c: Posición destino a intercambiar.
    */
    public static void m2(int[] a, int b, int c) {
    // int i = b,  j = c;   Esta línea no es necesaria.
        int d = a[(b + c) / 2];

//        while (b <= c)    Este bucle tampoco es necesario.
            
            while (a[b] < d) {b++;}
            while (a[c] > d) {c--;}
            if (b <= c) {int e = a[b]; a[b] = a[c]; a[c] = e; b++; c--;}

    // if (b < c) {m2(a, b, c);} if (b < c) {m2(a, b, c);}   Esta línea tampoco es necesaria.
    }