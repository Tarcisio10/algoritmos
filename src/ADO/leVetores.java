/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author tbn
 */
public class leVetores {
    public static void main(String[] args) throws Exception {
        /*int[] v = leVetor("vetor.txt");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }*/
    }

    public static int[] leVetor(String nomeArquivo) throws Exception {
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader input = new BufferedReader(arquivo);
        // Le 2 linhas arquivo 1ªlinha(qtdLinhas) 
        String linha1 = input.readLine();
        //2ªlinha(qtdColunas)
        String linha2 = input.readLine();
        input.close();
        // transformando 1ª e 2ª linha em int
        int linha = Integer.parseInt(linha1);
        int coluna = Integer.parseInt(linha2);
        //criar matriz
        int [][] matriz = new int [linha][coluna];
        for (int i = 0; i < matriz[linha].length; i++) {
            //String [] matrizi = matriz[linha].split(" ");
            for (int j = 0; j < matriz[coluna].length; j++) {
                
            }
        }
        //criar vetor
        int[] vetor = new int[tam];
        //separar os dados da linha
        String[] dados = linha2.split(" ");//Monta vetor de string
        // armazenar os dados int no vetor 
        for (int i = 0; i < dados.length; i++) {//percorre o vetor de String
            vetor[i] = Integer.parseInt(dados[i]);// transformado e armazenando no vetor
        }
        return vetor;
    }
    
}
