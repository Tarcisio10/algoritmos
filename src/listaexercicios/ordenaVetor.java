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
public class ordenaVetor {

    public static void main(String[] args) {
        int v1[] = {2, 6, 3};
        ordenaVetor(v1);

    }

    public static void ordenaVetor(int x[]) {
        //System.out.println(Arrays.toString(x));//[i] = 2,6,3

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] < x[j]) {
                    int vAux[] = {x[i]};
                    vAux[i] = x[j];
                    x[j] = vAux[x[i]];
                    //System.out.println(vAux);
                    //System.out.println(x);

                }

            }

            //System.out.println(Arrays.toString(x));//[i] = 2,6,3
            /*for (int j = 0; j < x.length; j++) {
                if (x[i] < j) {
                    int v2[] = {x[i]};
                    System.out.println(Arrays.toString(v2));
                }
            }*/
        }

    }

}
