/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class Scanear {

    public static void main(String[] args) {
        int[][] matrizT = criaMatriz();
        System.out.println(Arrays.toString(matrizT));
        imprimeMatriz(matrizT);
    }

    public static int[][] criaMatriz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o num. de linhas:");
        int x = input.nextInt();
        System.out.println("Informe o num. de colunas: ");
        int y = input.nextInt();

        int matriz[][] = new int[x][y];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Random r = new Random();
                matriz[i][j] = r.nextInt(10);
            }
        }
        return matriz;
    }

    public static void imprimeMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m[j]);
            }
        }
    }

}
