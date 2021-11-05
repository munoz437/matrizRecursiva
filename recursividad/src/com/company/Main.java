package com.company;

import java.util.Random;
//JORGE LUIS MUÑOZ ELÍAS
//CARNE 1290-18-17017
public class Main {

    private static Random rnd = new Random();
    private static final String abecedary = "0123456789";
    private static int words = abecedary.length() - 1;

    public static void main(String args[]) {
        int[][] matriz = new int[3][5];

        for (int i = 0; i < matriz.length; i++) {
            rellenarFila(matriz, i, 0);
        }

        //Salida
        for (int i = 0; i < matriz.length; i++) {
            StringBuilder fila = new StringBuilder();
            fila.append("Fila " + i + ": ");
            for (int j = 0; j < matriz.length; j++) {
                fila.append(matriz[i][j]);
                fila.append(",");
            }
            System.out.println(fila);
        }
    }


    public static void rellenarFila(int[][] matriz, int i, int j) {
        matriz[i][j] = abecedary.charAt(rnd.nextInt(words));
        if (j < matriz[i].length - 1) {
            rellenarFila(matriz, i, j + 1);
        }
    }
}
