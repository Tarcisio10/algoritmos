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
public class imprimeMatriz {

    public static void main(String[] args) {

    }

    static int[][] ImprimeMatriz(int v[][]) {
        for (int linha = 0; linha < v.length; linha++) {
            //res = "";
            for (int coluna = 0; coluna < v[0].length; coluna++) {
                System.out.println(Arrays.toString(v) + "oi");
                //   res += v;
            }
        }
        return v;

    }
}
