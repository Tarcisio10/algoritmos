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
public class T1_reconhecimento_padrao {

    //manipula e lê dados via arquivo texto
    public static void main(String[] args) throws Exception { //joga as exceções ao inves de tratar
        FileReader arquivo = new FileReader("exemplo.txt"); //passa o nome do arquivo com o conteudo
        BufferedReader input = new BufferedReader(arquivo);
        //consume todas as linhas do arquivo
        String linha;
        while ((linha = input.readLine()) != null) {//qndo retorna null acabou o conteudo
            System.out.println(linha);//imprime o resultado das linhas
        }
        input.close();//fecha o buffer e o arquivo

    }
    //manipulando vetores 
    

}
