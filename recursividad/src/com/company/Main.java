package com.company;

import java.util.Random;
//JORGE LUIS MUÑOZ ELÍAS
//CARNE 1290-18-17017
public class Main {

    private static Random rnd = new Random();
    private static final String numeros = "0123456789";
    private static int digitos = numeros.length() - 1;

    public static void main(String args[]) {
        int[][] matriz = new int[3][5];

        for (int i = 0; i < matriz.length; i++) {
            rellenarMatriz(matriz, i, 0);
        }

        //MOSTRAR SALIDA
        for (int i = 0; i < matriz.length; i++) {
            StringBuilder fila = new StringBuilder();
            fila.append("Fila " + i + "--> ");
            for (int j = 0; j < 5; j++) {
                fila.append(matriz[i][j]);
                fila.append("|");
            }
            System.out.println(fila);
        }
    }


    public static void rellenarMatriz(int[][] matriz, int i, int j) {
        matriz[i][j] = numeros.charAt(rnd.nextInt(digitos));
        if (j < matriz[i].length - 1) {
            rellenarMatriz(matriz, i, j + 1);
        }
    }
}
