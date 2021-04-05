/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author tbn
 */
public class CentroGravidade {

    public static void main(String[] args) throws Exception {
        int linha, coluna; //Armazenha linha e coluna informadas no txt
        int linhaMarcada = 0; //Armazena a linha do centro de gravidade
        int colunaMarcada = 0; //Armazena a coluna do centro de gravidade
        int indice = 2; //Indice do vetor de doubles, descontados os valores informados para a linha e a coluna
        double[] valoresDouble; //Armazena os valores convertidos de String para double
        double[] somatorioLinha; //Armazena as somas de cada linha
        double[] somatorioColuna; //Armazena as somas de cada coluna
        double linhaMaior; //Linha do centro de gravidade
        double colunaMaior; //Coluna do centro de gravidade
        double[][] dadosTabulados; //Armazena os valores em formato matricial
        String dados; //Armazena os valores de todas as linhas lidas
        String linhaLida; //Armazena cada linha lida
        String[] valoresString; //Armazena os valores da String dados

        FileReader leitorArquivo = new FileReader("matriz2.txt"); //Lê o arquivo de texto
        BufferedReader buffer = new BufferedReader(leitorArquivo);

        linhaLida = buffer.readLine(); //Lê uma linha
        dados = linhaLida; //Coloca a linha lida na String dados

        while (linhaLida != null) {
            linhaLida = buffer.readLine();
            dados += linhaLida; //Concatena a primeira linha lida com as demais
        }
        leitorArquivo.close(); //Fecha o FileReader

        valoresString = dados.split(" ");//Separa os valores da String dados com base em espaços
        valoresDouble = new double[valoresString.length - 1]; //Determina o tamanho do vetor 

        //Converte double e adiciona cada valor de do vetor de Strings valoresString em valoresDouble
        for (int i = 0; i < (valoresDouble.length); i++) {
            valoresDouble[i] = Double.parseDouble(valoresString[i]);
        }

        linha = (int) valoresDouble[0]; //Obtém o valor da linha informada no txt
        coluna = (int) valoresDouble[1]; //Obtém o valor da coluna informada no txt

        dadosTabulados = new double[linha][coluna]; //Define o tamanho da matriz dadosTabulados
        somatorioLinha = new double[linha]; //Define o tamanho da matriz somatorioLinha
        somatorioColuna = new double[coluna]; //Define o tamanho da matriz somatorioColuna

        System.out.println("\nDados lidos e convertidos para double");
        for (int i = 0; i < valoresDouble.length; i++) {
            System.out.print(valoresDouble[i] + "\n");
        }

        //Passando os dados do vetor valoresDouble para  a matriz dadosTabulados
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                dadosTabulados[i][j] = valoresDouble[indice++];
            }
        }

        linhaMaior = dadosTabulados[0][0];
        colunaMaior = dadosTabulados[0][0];

        //Obtém a linha e a coluna de maior peso, bem como o índice da linha e da coluna
        for (int i = 0; i < somatorioLinha.length; i++) {
            if (linhaMaior < somatorioLinha[i]) {
                linhaMaior = somatorioLinha[i];
                linhaMarcada = i;
            }

            if (colunaMaior < somatorioColuna[i]) {
                colunaMaior = somatorioColuna[i];
                colunaMarcada = i;
            }
        }

        System.out.println("\nLinha de maior peso: " + linhaMaior + " -  Coluna de maior peso: " + colunaMaior);
        System.out.println("\nCentro de gravidade = [" + linhaMarcada + "," + colunaMarcada + "]");
    }
}
