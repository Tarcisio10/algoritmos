/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class difVetorAbs {

    public static void main(String[] args) {

        int[] v = {2, 4, 6, 9};
        Arrays.sort(v);
        //int x = difAbsol(v);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]+ "");
        }
        System.out.println("");
        //System.out.println(x);
        //int [][] vetorEscolhido = laco();
        //int numDif = difAbsol(vetorEscolhido);
        /*int[] vetor = criaVetor();//{10, 15, 53, 52, 41, 100};
        
        int numDif = difAbsol(vetorEScolhido);
        System.out.println(numDif);*/
    }

    static int[] criaVetor() {
        int vetorEscolhido[]; // declarei um vetor
        Scanner input = new Scanner(System.in);
        System.out.print("Informe quantos elementos voce quer no vetor:");
        int n = input.nextInt();
        vetorEscolhido = new int[n];// alocando espaço para o vetor
        for (int i = 0; i < vetorEscolhido.length; i++) {
            System.out.println("Informe o numero no indice " + i + ":");
            vetorEscolhido[i] = input.nextInt();
            System.out.println(Arrays.toString(vetorEscolhido));

        }
        return vetorEscolhido;

    }

    static void laco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos vetores quer criar: ");
        int n = input.nextInt();
        //cria matriz
        int matriz[][] = new int[n][];//[n] qtd de vetores
        for (int i = 0; i < n; i++) {
            matriz[i] = criaVetor();
            //criaVetor();
            //System.out.println(matriz.length);
        }

    }

    public static int difAbsol(int v[]) {
        int dif = 0;
        for (int i = 0; i < v.length; i++) {
            
            for (int j = 0; j < v.length; j++) {
                
                int x = v[i] - v[j];
                if (x > dif) {
                    dif = x;
                }
            }

        }
        return dif;
    }

}
