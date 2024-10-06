public class Produto {

  protected String nome;
  protected int estoque;
  protected double preco;

  public Produto(String nome, int estoque, double preco) {
    this.setNome(nome);
    this.setEstoque(estoque);
    this.setPreco(preco);
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getEstoque() {
    return estoque;
  }
  public void setEstoque(int estoque) {
    this.estoque = estoque;
  }
  public double getPreco() {
    return preco;
  }
  public void setPreco(double preco) {
    this.preco = preco;
  }

  // Método para vender produto
  public boolean venderProduto(int quantidade) {
    if (estoque >= quantidade) {
      estoque -= quantidade;
      System.out.println("Venda realizada com sucesso!");
      return true;
    } else {
      System.out.println("Estoque insuficiente para realizar a venda.");
      return false;
    }
  }
}