public class Smartphone extends Produto {

    private int ligacoes = 0;

    public Smartphone(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public int getLigacoes() {
        return ligacoes;
    }
    public void setLigacoes(int ligacoes) {
        this.ligacoes = ligacoes;
    }

    public void fazerLigacao() {
        ligacoes++;
        System.out.println("\nFazendo ligação...");
    }

    @Override
    public boolean venderProduto(int quantidade) {
        if (super.venderProduto(quantidade)) {
            System.out.println("Smartphone vendido com sucesso!");
            return true;
        }
        return false;
    }
}