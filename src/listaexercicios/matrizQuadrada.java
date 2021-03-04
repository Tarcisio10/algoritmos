/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
O traço de uma matriz é a soma dos elementos de sua diagonal
principal. Implemente uma função que receba uma matriz quadrada
(número de linhas = número de colunas) e devolva o seu traço.
 */
package listaexercicios;

/**
 *
 * @author tbn
 */
public class matrizQuadrada {

    public static void main(String[] args) {
        int v[][] = {{1, 2, 3}, {2, 4, 6}, {5, 7,}};
        matrizQuadrada(v);
    }

    static void matrizQuadrada(int m[][]) {
        //int m[][] = {{1, 2, 3}, {2, 4, 6}, {5, 7,}};
        String res = "";
        if (m.length == m[0].length) {
            System.out.println("é uma matriz quadrada de tamanho : " + m.length + "x" + m[0].length);
            /*for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (m[i] == m[j]) {
                        res += m[i][j] + " ";
                        System.out.println(res);
                    }
                }
            }*/
        } else {
            System.out.println("Não é uma matriz quadrada");
        }
    }

}
