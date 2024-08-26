//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int nota1 = 0;
        int nota2 = 30;
        int nota3 = 80;

        double media = (nota1+nota2+nota3)/3;

        if (media >= 70){
            System.out.printf("%nMedia: %.1f.%nO aluno está APROVADO!%n", media);

        } else if ((media < 70) && (media >= 40)) {
            System.out.printf("%nMedia: %.1f.%nO aluno está na FINAL!%n", media);

        }else{
            System.out.printf("%nMedia: %.1f.%nO aluno está REPROVADO!%n", media);
        }
    }
}