public class ContaPoupanca extends Conta {
  
  private double selic;
  
  
  public ContaPoupanca(String titular, double selic) {
    super(titular);
    setSelic(selic);
  }
  
  
  public double getSelic() {
    return selic;
  }
  
  public void setSelic(double selic) {
    this.selic = selic;
  }
  
  
  public void calcularRendimento() {
    
    double rendimento;
    
    if (getSelic() > 8.5) {
      rendimento = 0.005 * getSaldo();
    } else {
      rendimento = 0.007 * getSelic() * getSaldo();
    }
    
    System.out.printf("Rendimento: R$ %.2f\n", rendimento);
  }
  
  @Override
  public void exibirDados() {
    System.out.printf("Conta Poupança\nTitular: %s\nSaldo: R$ %.2f\n", getTitular(), getSaldo());
  }
}