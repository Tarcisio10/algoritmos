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
public class leMatriz {
    public static void main(String[] args) throws Exception {
        int[] m = leVetor("matriz.txt");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
            }
            
        }
    }

    public static int[] leVetor(String nomeArquivo) throws Exception {
        FileReader arquivo = new FileReader(nomeArquivo);
        BufferedReader input = new BufferedReader(arquivo);
        // Le 2 linhas arquivo 1ªlinha(qtdNumeros) 2ªlinha(os numeros separados por espaço)
        String linha1 = input.readLine();
        //String linha2 = input.readLine();
        String linha2 = input.readLine();
        //Sempre q terminar de ler fecha o arquivo
        input.close();
        // transformando String p/ inteiro
        int tam = Integer.parseInt(linha1);
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
