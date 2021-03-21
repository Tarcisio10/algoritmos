package ADO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//bunca binaria = vetor ordenado
/**
 *
 * @author tbn
 */
public class buscaLinear {

    public static void main(String[] args) {
        int v[] = {1, 2, 3, 6};
        int p = buscaLinear(v, 6);
        if (p >= 0) {
            System.out.println("valor encontrado " + p);
        } else {
            System.out.println("n encontrado");
        }
    }

    public static int buscaLinear(int v[], int x) {
        for (int i = 0; i < v.length; i++) {
            if (i >= x) {
                return x;
            } else {
                return -1;
            }
        }
        return x;
    }
}
