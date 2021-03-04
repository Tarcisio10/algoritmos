/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

import java.util.Arrays;

/**
 *
 * @author tbn
 */
public class matrizQuadradaTraco {

    public static void main(String[] args) {
        //static void matrizQuadrada(int m[][], int m2[][]) {
        int m[][] = {{1, 2, 3},//m[0][0]
                     {2, 4, 6},//m[1,1]
                     {5, 7, 5}
        };
        //System.out.println(m.length);
        //System.out.println(m[0].length);
        System.out.println("O traço da matriz é : " + tracoMatrizQuadrada(m));

    }

    static String tracoMatrizQuadrada(int m[][]) {
        String res = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    res += m[i][j] + " ";

                }
            }
        }
        return res;
    }
}
