public class Televisao extends Produto {

    private int[] canais = {2, 4, 5, 7, 9, 11, 13, 22, 33, 44, 55, 66, 77, 88, 99};

    public Televisao(String nome, int estoque, double preco) {
        super(nome, estoque, preco);
    }

    public int[] getCanais() {
        return this.canais;
    }

    public void mostrarCanais() {
        System.out.println("\nCanais disponíveis:");
        for (int canal : getCanais()) {
            System.out.printf("Canal: %d\n", canal);
        }
        System.out.println();
    }

    public void acessarCanal(int canal) {
        boolean canalDisponivel = false;
        for (int c : getCanais()) {
            if (c == canal) {
                canalDisponivel = true;
                break;
            }
        }
        if (canalDisponivel) {
            System.out.println("Acessando canal " + canal);
        } else {
            System.out.printf("Canal %d não disponível\n", canal);
        }
    }

    @Override
    public boolean venderProduto(int quantidade) {
        if (super.venderProduto(quantidade)) {
            System.out.println("Televisão vendida com sucesso!");
            return true;
        }
        return false;
    }
}