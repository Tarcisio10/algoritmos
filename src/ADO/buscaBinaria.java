package ADO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbn
 */
public class buscaBinaria {

    public static void main(String[] args) {
        int v[] = {1, 2, 3, 6};
        int p = buscaBinaria(v, 6);
        if (p >= 0) {
            System.out.println("valor encontrado " + p);
        } else {
            System.out.println("n encontrado");
        }
    }

    public static int buscaBinaria(int v[], int x) {
        int i = 0;
        int f = v.length - 1;
        while (i <= f) {
            int m = (i + f) / 2;
            if (v[m] == x) {
                return m;
            }
            if (x < v[m]) {
                f = m - 1;
            } else {
                i = m + 1;
            }
            return -1;
        }
    }

}
