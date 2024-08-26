//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int horas = 40;
        int valorDaHora = 15;

        double salario = horas * valorDaHora;

        System.out.printf("%nO salário de %d horas é R$ %.2f!%n", horas, salario);
    }
}