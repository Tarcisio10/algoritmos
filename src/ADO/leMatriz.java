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
        int[][] m = leVetor("matriz.txt");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
            }
            
        }
    }

    public static int[][] leVetor(String nomeArquivo) throws Exception {
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
        int[][] matriz = new int[linha][coluna];
        //separar os dados dos espaços da linha
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                String[][] dados = matriz.split(" ");//Monta matriz de string
            }
        }
        
        // armazenar os dados int no vetor 
        for (int i = 0; i < dados.length; i++) {//percorre o vetor de String
            vetor[i] = Integer.parseInt(dados[i]);// transformado e armazenando no vetor
        }
        return vetor;
    }
}
