public class Emprestimo {
    private double valorEmprestimo;
    private double taxaJuros;
    private int tempo;

    public Emprestimo(double valorEmprestimo, double taxaJuros, int tempo) {
        setValorEmprestimo(valorEmprestimo);
        setTaxaJuros(taxaJuros);
        setTempo(tempo);
    }

    // Getters e Setters
    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
  
  // Método para calcular juros
  public double calcularJuros() {
    if (getTempo() <= 5) {
      return 0;
    }
    return getValorEmprestimo() * (getTempo() - 5) * (getTaxaJuros() / 100);
  }
}