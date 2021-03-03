/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
O traço de uma matriz é a soma dos elementos de sua diagonal
principal. Implemente uma função que receba uma matriz quadrada
(número de linhas = número de colunas) e devolva o seu traço.
 */
package listaexercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class ex3 {
    
    public static void main(String[] args) {
        matrizQuadrada();
        
    }

    public static void matrizQuadrada() {
        
        int v[][] = {{1,2,3},{2,4,6},{5,7,8}};

        if (v.length == v[0].lenght) {
            //System.out.println("é uma matriz quadrada de tamanho : " + numLinhas + "x" + numColunas);

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

    public static int[][] ImprimeMatriz(int v[][]) {
        for (int linha = 0; linha < v.length; linha++) {
            for (int coluna = 0; coluna < v[linha].length; linha++) {
                System.out.println(Arrays.toString(v) + "oi");
            }
        }
        return v;
    }
    
}
