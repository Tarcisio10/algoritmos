/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

public class exemplo {

    public static void main(String[] args) {
        int[][] m = {
            {1, 3, 5, 7},
            {2, 4, 6, 8},
            {2, 1, 2, 2},
            {3, 3, 3, 3}
        };
        System.out.println(calcularTraco1(m));

        //System.out.println("Traco = " + traco);
    }

    public static int calcularTraco(int m[][]) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            soma = m[i][i];
        }
        return soma;
    }

    public static int calcularTraco1(int m[][]) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

}
