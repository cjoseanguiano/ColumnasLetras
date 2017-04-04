package com.company;

/**
 * Created by carlosjoseanguiano on 04/04/17.
 */
public class Calculo {

    public void imprimir(int f, int c, int[][] n) {
        int j;
        int i;
        for (i = 0; i < f; i++) {
            for (j = 0; j < c; j++) {
                System.out.printf("%d\t", n[i][j]);
            }
            System.out.println();

        }
    }
}
