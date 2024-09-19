import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a distância percorrida (km): ");
        double distancia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o tempo de espera (minutos): ");
        int tempoEspera = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a tarifa base (R$): ");
        double tarifaBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o fator de demanda (1.0 = normal, 1.5 = pico): ");
        double fatorDemanda = scanner.nextDouble();
        scanner.nextLine();

        Corrida corrida = new Corrida(distancia, tempoEspera, tarifaBase, fatorDemanda);
        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}