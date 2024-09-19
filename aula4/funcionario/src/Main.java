import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String saida;
        Scanner tecladoDouble = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);

        do {

            Funcionario funfa = new Funcionario(202412345, "Feliphe Bla", 1500);

            funfa.exibir();

            System.out.printf("\nDigite 's' e 'enter' para sair:\n->");
            saida = tecladoString.nextLine();
        }while (!(saida.equals("s")));
    }
}