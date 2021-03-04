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
        int m[][] = {{1, 2, 3}, {2, 4, 6}, {5, 7, 5}, {1,2,3,4}};
        int res;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i] == m[j]) {
                    res = i;
                    System.out.println(res);
                    //System.out.println(Arrays.toString(m[i]));
                }
            }
        }

    }
}
