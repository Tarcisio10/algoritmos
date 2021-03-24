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
public class LeArquivo {

    public static void main(String[] args) throws Exception {
        FileReader arquivo = new FileReader("exemplo.txt");
        BufferedReader input = new BufferedReader(arquivo);
        //consume todas as linhas do arquivo
        String linha;
        while ((linha = input.readLine()) != null) {
            System.out.println(linha);
        }
        input.close();

    }
    
}
