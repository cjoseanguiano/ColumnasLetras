package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int f, c, i;
        int v = 0;
        int j = 0;

        int[][] n;

        System.out.println("Cantidad de filas");
        f = entrada.nextInt();
        System.out.println("Cantidad de columnas");
        c = entrada.nextInt();

        n = new int[f][c];

        for (i = 0; i < f; i++) {
            for (j = 0; j < c; j++) {
                System.out.println("digite las files");
                v = entrada.nextInt();

                n[i][j] = v;
            }
        }
        Calculo vec = new Calculo();
        vec.imprimir(f, c, n);
    }
}
