
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 
 * El M1 lo que hace es generar números aleatorios en base a los parámetros introducidos, 
 * es decir, la variable a (establece el tamaño del array), la variable b (es el numero mínimo 
 * del cual se parte) y la variable c (es el numero máximo al cual se puede llegar).
 *La variable: long d = System.currentTimeMillis(); la hemos eliminado con tal
 * de optimizar el código ya que se estaba utilizando.
 * 
 * Función: El M1 te enseña numeros randoms aleatorios y el M2 te ordena esos 
 * numeros aletaorios 
 * 
 * 
 * Este código se podría optimizar haciendo el famoso método burbuja de java el 
 * cual compara el primer numero con el resto y los ordena, sin embargo un Quick 
 * sort (otro método) sería mas eficiente ya que parte desde la mitad y separa los 
 * mas pequeños a la izquierda y los mas grandes a la derecha y los ordena
 * @author ivamar
 * 
 *
 */
public class main {

    

    public static String m1(int a, int b, int c) {

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

        if (b < j) {
            m2(a, b, j);
        }

        if (i < c) {
            m2(a, i, c);
        }
    }
    public static void main(String[] args) {
        System.out.println(m1(10, 10, 20));
    }

}