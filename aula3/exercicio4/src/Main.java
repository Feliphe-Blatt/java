public class Main {
    public static void main(String[] args) {

        double salario = 2500;
        double descontado;

        if (salario <= 900) {
            System.out.printf("%nO salário está ISENTO de desconto e será R$ %.2f!%n", salario);

        } else if (salario > 900 && salario <= 1500) {

            descontado = salario - (salario * 0.05);
            System.out.printf("%nO salário tem desconto de 5%% e será R$ %.2f!%n", descontado);

        } else if (salario > 1500 && salario <= 2500) {

            descontado = salario - (salario * 0.10);
            System.out.printf("%nO salário tem desconto de 10%% e será R$ %.2f!%n", descontado);

        } else {
            descontado = salario - (salario * 0.20);
            System.out.printf("%nO salário tem desconto de 20%% e será R$ %.2f!%n", descontado);
        }
    }
}
