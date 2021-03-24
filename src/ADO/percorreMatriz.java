/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 *
 * @author tbn
 */
public class percorreMatriz {

    public static void main(String[] args) {
        int matriz[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        percorreMatriz(matriz);

    }

    public static void percorreMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
