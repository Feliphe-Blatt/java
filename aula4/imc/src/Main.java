import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoDouble = new Scanner(System.in);

        // Solicita os valores do usuário
        System.out.print("\nDigite o peso (kg): ");
        double peso = tecladoDouble.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = tecladoDouble.nextDouble();

        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa(peso, altura);

        // Calcula e exibe o IMC
        System.out.printf(pessoa.calcularIMC());

        tecladoDouble.close();
    }
}