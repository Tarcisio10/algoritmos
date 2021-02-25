package listaexercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        criarVetor();
    }

    public static void comparaVetor() {
        int v1[], v2[], v3[];
        Scanner input = new Scanner(System.in);  
    }

    public static void criarVetor() {
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
    
    public static void laco(int va[], int vb[]) {
        int v3[]= new int [(va - vb)];

        Scanner input = new Scanner(System.in);
        System.out.println("Informe quantos vetores quer criar: ");
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            criarVetor() ;        
        }
    }

}
