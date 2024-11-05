import java.util.Scanner;+


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Coordenador");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("\nDigite o nome do aluno:");
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Digite o email acadêmico do aluno:");
                    String emailAcademicoAluno = scanner.nextLine();
                    System.out.println("Digite a nota 1 do aluno:");
                    double nota1 = scanner.nextDouble();
                    System.out.println("Digite a nota 2 do aluno:");
                    double nota2 = scanner.nextDouble();
                    System.out.println("Digite a nota 3 do aluno:");
                    double nota3 = scanner.nextDouble();

                    Pessoa aluno = new Aluno(nomeAluno, nota1, nota2, nota3);

                    System.out.println(aluno.toString());
                    break;
                case 2:
                    System.out.println("\nDigite o nome do professor:");
                    String nomeProfessor = scanner.nextLine();
                    System.out.println("Digite o email acadêmico do professor:");
                    String emailAcademicoProfessor = scanner.nextLine();
                    System.out.println("Digite a titulação do professor:");
                    String titulacao = scanner.nextLine();
                    System.out.println("Digite a área de pesquisa do professor:");
                    String areaDePesquisa = scanner.nextLine();

                    Professor professor = new Professor(nomeProfessor, emailAcademicoProfessor, titulacao, areaDePesquisa);

                    System.out.println(professor.toString());
                    break;
                case 3:
                    System.out.println("\nDigite o nome do coordenador:");
                    String nomeCoordenador = scanner.nextLine();
                    System.out.println("Digite o email acadêmico do coordenador:");
                    String emailAcademicoCoordenador = scanner.nextLine();

                    Coordenador coordenador = new Coordenador(nomeCoordenador, emailAcademicoCoordenador);

                    System.out.println(coordenador.toString());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }
}