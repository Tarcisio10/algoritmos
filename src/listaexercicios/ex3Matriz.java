/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class ex3Matriz {

    public static void main(String[] args) {
        matrizQuadrada();
    }

    public static void matrizQuadrada() {
        int numLinha, numColuna;// sumMain, sumB;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o numero linhas: ");
        numLinha = input.nextInt();
        System.out.print("Informe o numero de colunas: ");
        numColuna = input.nextInt();
        int v[][] = new int[numLinha][numColuna];
        int numLinhas = v.length;
        //System.out.println(numLinhas);
        int numColunas = v[0].length;
        //System.out.println(numColunas);
        if (numLinhas == numColunas) {
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

}
