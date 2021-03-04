/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class QuadradoMagico {

    public static void main(String[] args) {
        int quadMagico[][] = {{8, 0, 7}, {4, 5, 6}, {3, 10, 2}};
        matrizQuadrada(quadMagico);
        //ImprimeMatriz();// passar por parametro
    }

    static void matrizQuadrada(int m[][]) {
        int numLinha, numColuna;// sumMain, sumB;
        int res = 0;
        do {
            for (int i = 0; i < m.length; i++) {
                res += i;
            }
            System.out.println(res);
        } while (true);
        /*Scanner input = new Scanner(System.in);
        System.out.print("Informe o numero linhas: ");
        numLinha = input.nextInt();
        System.out.print("Informe o numero de colunas: ");
        numColuna = input.nextInt();
        int v[][] = new int[numLinha][numColuna];
        int numLinhas = v.length; //System.out.println(numLinhas);
        int numColunas = v[0].length; //System.out.println(numColunas);
        if (numLinhas == numColunas) {
            do {
                for (int i = 0; i < v[numLinhas][i]; i++) {
                    if (true) {
                    }
                }
                System.out.println("é uma matriz quadrada de tamanho : " + numLinhas + "x" + numColunas);

            } else {
            System.out.println("Não é uma matriz quadrada");
        }
            for (int i = 0; i < numLinha; i++) {
                for (int j = 0; j < numColuna; j++) {
                    System.out.println("Informe o numero na linha [" + (i + 1) + "] x coluna [" + (j + 1) + "]");
                    v[i][j] = input.nextInt();
                }
            }
        }    
    static int[] ImprimeMatriz(int v[][]) {
        for (int linha = 0; linha < v.length; linha++) {
            for (int coluna = 0; coluna < v[linha].length; linha++) {
                System.out.println(Arrays.toString(v) + "oi");
            }
        }
        return;
    }*/
        //System.out.println((v.length + "x" + v[0].length));
    }
}
