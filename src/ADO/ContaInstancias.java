/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 *
 * @author tbn
 */
public class ContaInstancias {

    private int tamanho;
    private static int conta = 0; //IMPRIME A CONTAGEM DE 4 VALORES
    //private int conta = 0; //IMPRIME A CONTAGEM DE 1 VALOR

    public ContaInstancias() {
        conta++;
        System.out.println("Valor = " + conta);
    }

    public static void main(String[] args) {
        ContaInstancias c = new ContaInstancias();

        ContaInstancias dois = new ContaInstancias();
        ContaInstancias tres = new ContaInstancias();
        ContaInstancias quatro = new ContaInstancias();
    }
}
