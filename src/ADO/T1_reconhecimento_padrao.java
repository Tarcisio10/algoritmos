/*
Nós,
Matheus Neres  
Tarcisio Blois
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos à equipe e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
 */
package ADO;

import java.io.BufferedReader;
import java.io.FileReader;


public class T1_reconhecimento_padrao {

    //manipula e lê os dados via arquivo texto
    public static void main(String[] args) throws Exception { //joga as exceções ao inves de tratar

        FileReader arquivo = new FileReader("matriz2.txt");//passa o nome do arquivo com o conteudo
        BufferedReader input = new BufferedReader(arquivo);

        String linha1 = input.readLine();
        String tamanhoMatriz = linha1;
        String linha2 = input.readLine();
        String dados = linha2;
        while (linha2 != null) {//qndo retorna null acabou o conteudo
            linha2 = input.readLine();
            dados += linha2;
        }
        input.close(); //fecha o buffer e o arquivo
        String[] valoresString; //Armazena os valores da String dados
        valoresString = dados.split(" ");
        double[] dadosDouble; //Armazena os valores convertidos de String para double
        dadosDouble = new double[valoresString.length - 1]; //Determina o tamanho do vetor dadosDouble
        for (int i = 0; i < dadosDouble.length; i++) {
            dadosDouble[i] = Double.parseDouble(valoresString[i]);
        }
        int linha, coluna;
        linha = (int) dadosDouble[0]; //Obtém o valor da linha informada no txt
        coluna = (int) dadosDouble[1]; //Obtém o valor da coluna informada no txt

        double[][] matrizDados; //Cria matriz q vai receber os valores 
        double[] somaDasLinhas; //Cria vetor p/ armazenar as somas de cada linha
        double[] somaDasColunas; //Cria vetor p/ armazenar as somas de cada coluna
        matrizDados = new double[linha][coluna]; //REcebe o tamanho que vai ser a matriz 
        somaDasLinhas = new double[linha]; //Define o tamanho da matriz somaDasLinhas
        somaDasColunas = new double[coluna]; //Define o tamanho da matriz somaDasColunas

        System.out.println("\nConvertendo os dados p/ double:");
        for (int i = 0; i < dadosDouble.length; i++) {
            System.out.print(dadosDouble[i] + "\n");
        }

        /*String[] tamanhoMatriz = linha1.split(" ");
        int[] vetor = {Integer.parseInt(linha1)};
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        String[] dadosMatriz = linha2.split(" ");
        for (int i = 0; i < dadosMatriz.length; i++) {
            dadosMatriz[i] = Integer.parseInt();
        }*/
        
        //Passando os dados do vetor dadosDouble para a matriz matrizDados
        int indice = 2;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matrizDados[i][j] = dadosDouble[indice++];
            }
        }

        System.out.println("\nImprimindo os dados na forma de matriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matrizDados[linha][coluna] + " ");
            }
            System.out.println("");
        }

        double linhaGravidade = 0; //Valor da linha que correspondente ao centro de gravidade
        double colunaGravidade = 0;//Valor da coluna correspondente ao centro de gravidade
        /*linhaMaior = matrizDados[][];
        colunaMaior = matrizDados[0][0];*/

        //Imprime linha e coluna de maior peso com os respectivos indices
        int linhaMarcada = 0;
        int colunaMarcada = 0;
        for (int i = 0; i < somaDasLinhas.length; i++) {
            if (linhaGravidade < somaDasLinhas[i]) {
                linhaGravidade = somaDasLinhas[i];
                linhaMarcada = i;
            }

            if (colunaGravidade < somaDasColunas[i]) {
                colunaGravidade = somaDasColunas[i];
                colunaMarcada = i;
            }
        }

        System.out.println("\nCentro de gravidade = [" + linhaMarcada + "," + colunaMarcada + "]");

    }

}
