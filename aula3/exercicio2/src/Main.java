//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int teste = 33;
        int compara = 33;

        if(teste < compara){
            System.out.printf("%nO número %d é menor que %d!%n", teste, compara);

        } else if (teste > compara) {
            System.out.printf("%nO número %d é maior que %d!%n", teste, compara);

        }else{
            System.out.printf("%nO número %d é igual a %d!%n", teste, compara);

        }
    }
}