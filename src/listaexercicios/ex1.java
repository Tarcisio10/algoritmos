package listaexercicios;

/*1) Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
função efetua a INTERSECÇÃO entre os vetores, ou seja, os elementos em comum
entre os dois vetores, ao final sua função retorna uma String com a resposta. Os
vetores dados não possuem valores duplicados e não estão ordenados.
Exemplo:
A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A B = {2, 5, 4}
A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A B= {}*/

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        //criaVetor();
        laco();
    }

    public static void criaVetor() {
        int vetorEscolhido[]; // declarei um vetor
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quantos elementos voce quer no vetor: ");
        int n = input.nextInt();
        vetorEscolhido = new int[n];// alocando espaço para o vetor

        for (int i = 0; i < vetorEscolhido.length; i++) {
            System.out.println("Informe o numero no indice " + i + ":");
            vetorEscolhido[i] = input.nextInt();
            System.out.println(Arrays.toString(vetorEscolhido));
        }
    }

    public static void laco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos vetores quer criar: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            criaVetor();
        }
    }
}
