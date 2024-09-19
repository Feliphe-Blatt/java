public class Main {
    public static void main(String[] args) {
        
        Emprestimo emprestimo = new Emprestimo(1000, 5, 10);
        
        double juros = emprestimo.calcularJuros();
        
        System.out.printf("\nJuros: %.2f\n", juros);
    }
}