package ADO;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tbn
 */
public class gerarVetor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] v = geraVetor();
        Arrays.sort(v);//ordena vetor
        imprimeVetor(v);
        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        int p = buscaBinaria(v, n);
        if (p >= 0) {
            System.out.println("Numero na posição" + p);
        } else {
            System.out.println("numero nao consta no vetor");
        }

        //System.out.println("Digite uma matriz no min 3x3 : ");
    }

    //gera vetor com numeros aleatórios
    public static int[] geraVetor() {
        Random r = new Random();
        int[] vetor = new int[100];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(1000); //gera entre 0~999
        }
        return vetor;
    }

    public static int buscaBinaria(int v[], int x) {//buscaBinaria assume o vetor ordenado
        int i = 0;
        int f = v.length - 1;//tamanho do vetor -1, ultima posição do vetor
        while (i <= f) {
            int m = (i + f) / 2; // encontrando o meio do vetor (posição inicio - final /2)
            if (v[m] == x) {
                return m;
            }
            if (x < v[m]) {
                f = m - 1;
            } else {
                i = m + 1;
            }
        }
        return -1;
    }

    public static void imprimeVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }
        System.out.println();
    }
}
