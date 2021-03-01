/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;

/**
 *
 * @author tbn
 */
public class ex3Matriz {

    public static void main(String[] args) {
        matrizQuadrada();
    }

    public static void matrizQuadrada() {
        int sumLinha, sumColuna;// sumMain, sumB;
        int v[][] = {{1, 2},
        {3, 4}};
        //System.out.println(Arrays.toString(v));
        //int matrizQuadrada[][] = {{1, 2}, {2, 4}};
        //System.out.println(v.length);
        //System.out.println(v[0].length);
        int numLinhas = v.length;
        System.out.println(numLinhas);
        int numColunas = v[0].length;
        System.out.println(numColunas);
        if (numLinhas == numColunas) {
            System.out.println("é uma matriz quadrada de tamanho : " + numLinhas + "x" + numColunas);
        } else {
            System.out.println("Não é uma matriz quadrada");
        }
        //for (int i = 0; i < v.length; i++) {

        /*for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j]);
            }*/
        //}

        /*for (int i = 0; i < v.length; i++) {
            sumLinha = (v[1][0] + v[1][1]);
            System.out.println(sumLinha + "soma dos elementos das linhas");
        }*/
    }

}
