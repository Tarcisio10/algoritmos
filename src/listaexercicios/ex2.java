package listaexercicios;

import java.util.Arrays;

/*Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
função efetua a UNIÃO entre os vetores, ou seja, os elementos do vetor A mais aos
elementos do vetor B, desde que os elementos de B não estejam presentes no vetor
A, ao final sua função retorna uma String com a resposta. Os vetores dados não
possuem valores duplicados e não estão ordenados.
Exemplo:
A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A B= {7, 2, 5, 8, 4, 9}
A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A B = {3, 9, 11, 2, 6, 1}*/
public class ex2 {

    public static void main(String[] args) {
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        unirVetores(a, b);

    }

    public static void unirVetores(int[] v1, int[] v2) {
        //String res = "";
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    int[] v3 = {v1[i]};
                    System.out.println(Arrays.toString(v3));
                }

            }

        }
        //System.out.println(v3);
        //return v3;
    }
}
