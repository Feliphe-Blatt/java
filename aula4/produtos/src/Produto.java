public class Produto {
  
  // Atributos privados
  private int codigo;
  private String nome;
  private String tamanhoPeso;
  private String cor;
  private double valor;
  private int quantidadeEstoque;
  
  // Construtor
  public Produto(int codigo, String nome, String tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
    setCodigo(codigo);
    setNome(nome);
    setTamanhoPeso(tamanhoPeso);
    setCor(cor);
    setValor(valor);
    setQuantidadeEstoque(quantidadeEstoque);
  }
  
  // Métodos de acesso
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTamanhoPeso() {
    return tamanhoPeso;
  }
  public void setTamanhoPeso(String tamanhoPeso) {
    this.tamanhoPeso = tamanhoPeso;
  }
  
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }
  
  public int getQuantidadeEstoque() {
    return quantidadeEstoque;
  }
  public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
  }
  
  // Método para exibir informações do produto
  public void exibirInfo() {
    System.out.printf("\nCódigo: %d\nNome: %s\nTamanho/Peso: %s\nCor: %s\nValor: R$ %.2f\nQuantidade em estoque: %d\n", getCodigo(), getNome(), getTamanhoPeso(), getCor(), getValor(), getQuantidadeEstoque());
  }
  
  // venda de produtos
  // Com opções de pagamento
  // Pix, espécie, transferência ou débito: 5% de desconto
  // Caso seja em espécie, informar o valor recebido e o troco se houver
  // Crédito: parcelar em até 3x sem juros, acima de 3x com juros de 5%, podendo ser parcelado em até 10x
  public void vender(int quantidade, String formaPagamento, double valorRecebido, int parcelas) {
    if (quantidade > quantidadeEstoque) {
      System.out.println("Quantidade insuficiente em estoque.");
      return;
    }
    
    if (parcelas <= 0) {
      System.out.println("Número de parcelas inválido. Deve ser maior que zero.");
      return;
    }
    
    double valorTotal = this.getValor() * quantidade;
    double desconto = 0;
    double valorFinal = 0;
    double troco = 0;
    
    if (formaPagamento.equalsIgnoreCase("Pix") ||
        formaPagamento.equalsIgnoreCase("Transferência") ||
        formaPagamento.equalsIgnoreCase("Débito") ||
        formaPagamento.equalsIgnoreCase("Espécie")) {
      desconto = valorTotal * 0.05;
      valorFinal = valorTotal - desconto;
      
      if (formaPagamento.equalsIgnoreCase("Espécie")) {
        if (valorRecebido < valorFinal) {
          System.out.println("Valor recebido insuficiente.");
          return;
        }
        troco = valorRecebido - valorFinal;
      }
      
    }else if (formaPagamento.equalsIgnoreCase("Crédito")) {
      double valorParcela;
      double juros = 0;
      
      if (parcelas > 3) {
        juros = valorTotal * 0.05;
      }
      
      valorFinal = valorTotal + juros;
      
      if (valorFinal > 0) {
        System.out.printf("\nValor total antes dos juros: R$ %.2f\n", valorTotal);
        System.out.printf("\nJuros: R$ %.2f\n", juros);
        
        if (parcelas > 10) {
          parcelas = 10;
        }
        
        valorParcela = valorFinal / parcelas;
        
        System.out.printf("\nValor da parcela: R$ %.2f\n", valorParcela);
      }
    }
    
    if (valorFinal > 0) {
      System.out.printf("\nDesconto: R$ %.2f\n", desconto);
      System.out.printf("\nValor final: R$ %.2f\n", valorFinal);
      
      if (troco > 0) {
        System.out.printf("Troco: R$ %.2f\n", troco);
      }
    }
  }
}