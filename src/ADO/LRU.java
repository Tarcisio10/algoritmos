package ADO;

public class LRU implements AlgoritmoDeSubstituicao {
    private int quantidadeDePaginas;
    private int quantidadeDeFrames;
    private int[] paginas;
    private int[][] matriz;
    private int[] falhas;
    private int[] distancia;

    public LRU() {
        System.out.println("LRU");
    }

    @Override
    public void setPaginas(int[] paginas) {
        this.paginas = paginas;
    }

    @Override    
    public void setQuantidadeDePaginas(int quantidadeDePaginas) {
        this.quantidadeDePaginas = quantidadeDePaginas;
    }

    @Override
    public void setQuantidadeDeFrames(int quantidadeDeFrames) {
        this.quantidadeDeFrames = quantidadeDeFrames;
    }

    @Override
    public void iniciarFalhas() {
        for (int i = 0; i < quantidadeDePaginas; i++) {
            falhas[i] = 0;
        }
    }
}
