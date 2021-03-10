/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tbn
 */
public class LRU {

    private int qtdePaginas;
    private int qtdeframes;
    int[] paginas;
    int[][] matriz;
    int[] falhas;
    int[] distancia;

    public LRU() {
        System.out.println("LRU");
    }

    public void setPaginas(int[] paginas) {
        this.paginas = paginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public void setQtdeframes(int atdeframes) {
        this.qtdeframes = qtdeframes;
    }

    public void iniciarFalhas() {
        for (int i = 0; i < qtdePaginas; i++) {
            falhas[i] = 0;
        }
    }
}
