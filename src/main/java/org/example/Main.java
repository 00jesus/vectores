package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
    }
    public static void mostrarVectores(int [] vectores) {
        for (int i = 0; i < vectores.length; i++) {
            System.out.print(vectores[i]+", ");
        }
    }
    public static int [] vectoresRandom () {
        int [] vectores = new int[10];
        for (int i = 0; i < vectores.length; i++) {
            vectores[i] = (int)(Math.random()*10);
        }
        return vectores;
    }
    public static void copiarVectores(int[] vec, int[] otrosVectores) {
        int otraPosicion = 0;
        for (int pos = 0; pos < vec.length; pos++) {
            if (esPrimo(vec[pos])) {
                otrosVectores[otraPosicion] = vec[pos];
                otraPosicion++;

            }
        }
    }
    public static boolean esPrimo(int num) {
        boolean prime = true;
        if (num <= 0) {
            prime = false;
        }
        if (num == 1) {
            prime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
