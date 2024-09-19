import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    Produto produto = new Produto(123456, "Alho", "1kg", "roxo", 1.5 , 15);
    
    produto.exibirInfo();
    
    // Vender no débito
    // System.out.printf("\nDigite a quantidade que deseja vender no Débito: ");
    // int quantidade = scanner.nextInt();
    // scanner.nextLine();
    // produto.vender(quantidade, "débito", produto.getValor() * quantidade, 1);
    
    // Vender em espécie
    // System.out.printf("\nDigite a quantidade que deseja vender em Espécie: ");
    // int quantidade = scanner.nextInt();
    // scanner.nextLine();
    // System.out.printf("Digite o valor recebido: ");
    // double valorRecebido = scanner.nextDouble();
    // scanner.nextLine();
    // produto.vender(quantidade, "espécie", valorRecebido, 1);
    
    // Vender no crédito
    System.out.printf("\nDigite a quantidade que deseja vender no Crédito: ");
    int quantidade = scanner.nextInt();
    scanner.nextLine();
    System.out.printf("Digite o número de parcelas: ");
    int parcelas = scanner.nextInt();
    scanner.nextLine();
    
    produto.vender(quantidade, "crédito", produto.getValor() * quantidade, parcelas);
    
    scanner.close();
  }
}