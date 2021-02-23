package listaexercicios;
//SCCANNER IMPORTA NA FUNCAO Q USA OU GLOBAL ?
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        //int v[] = {1, 2, 3, 4, 5};
        //imprimirVetor(v);
        criarVetor();
        criarVetor();
    }

    /*public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }*/

    public static void criarVetor() {
        int vetorEscolhido[]; // declarei um vetor
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o tamanho do seu vetor: ");
        int n = input.nextInt();
        vetorEscolhido = new int[n];// alocando espaço para o vetor

        for (int i = 0; i < vetorEscolhido.length; i++) {
            System.out.println("Informe o numero no indice " + i + ":");
            vetorEscolhido[i] = input.nextInt();
            System.out.println(Arrays.toString(vetorEscolhido));
        }
        //System.out.println(Arrays.toString(vetorEscolhido));
    }

}
