public class Funcionario {

    double matricula;
    String nome;
    double salarioBruto;
    double salarioLiquido;

    // Setters
    void setMatricula(double matricula) {
        this.matricula = matricula;
    }
    void setNome(String nome) {
        this.nome = nome;
    }
    void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    // Getters
    double getMatricula() {
        return matricula;
    }
    String getNome() {
        return nome;
    }
    double getSalarioBruto() {
        return salarioBruto;
    }
    double getSalarioLiquido() {
        return salarioLiquido;
    }

    // Constructor
    Funcionario(double m, String n, double s){
        this.setMatricula(m);
        this.setNome(n);
        this.setSalarioBruto(s);
        this.setSalarioLiquido(s - (s * 0.15));
    }

    void exibir(){
        System.out.printf("\nMatrícula: %.0f\n", getMatricula());
        System.out.printf("\nNome do colaborador: %s\n", getNome());
        System.out.printf("\nSalário bruto: R$ %.2f\n", getSalarioBruto());
        System.out.printf("\nSalário líquido descontado: R$ %.2f\n", getSalarioLiquido());
    }
}
