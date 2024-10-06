import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Scanner tecladoString = new Scanner(System.in);
    
    System.out.print("\nDigite o nome do aluno: ");
    String nome = tecladoString.nextLine();
    
    System.out.print("Digite a nota 1: ");
    double nota1 = teclado.nextDouble();
    
    System.out.print("Digite a nota 2: ");
    double nota2 = teclado.nextDouble();
    
    System.out.print("Digite a nota 3: ");
    double nota3 = teclado.nextDouble();
    
    Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
    aluno.exibirDetalhesAluno();
    
    teclado.close();
  }
}