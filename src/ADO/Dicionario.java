package ADO;

/*
Entrega do Trabalho 2- Algoritmos e Programação II
Nós,
Tarcisio Blois
Matheus Neres.
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou
prejudicar outros. 
 */
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author tbn -Ler arquivo txt -Liste todas as diferentes palavras que existem
 * em um arquivo texto. -Para cada palavra lida no arquivo texto deve feita a
 * busca no dicionário (usando a busca binária), caso a> dicionário a palavra
 * lida deve ser descartada, caso contrário a palavra deverá > (vetor) de forma
 * ordenada
 */
public class Dicionario {

    public static void main(String[] args) throws Exception { //joga as exceções ao inves de tratar
        FileReader arquivo = new FileReader("dic.txt"); //passa o nome do arquivo com o conteudo
        BufferedReader input = new BufferedReader(arquivo); //consume todas as linhas do arquivo
        String linha;
        while ((linha = input.readLine()) != null) {//qndo retorna null acabou o conteudo
            String[] valorComSplit = linha.split(" "); //Uso do split sem o LIMIT*/
            for (String s : valorComSplit) {
                System.out.println(s.compareTo(s)== 0 ? true : false);
                System.out.println(s);
            }
        }
        input.close();//fecha o buffer e o arquivo

    }
}
