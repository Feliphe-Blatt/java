public class Aluno extends Pessoa {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (getNota1() + getNota2() + getNota3()) / 3;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public void exibirDetalhesAluno() {
        // utilizando printf para formatar a saída
        System.out.printf("\nNome: %s\n", getNome());
        System.out.printf("Nota 1: %.1f\n", getNota1());
        System.out.printf("Nota 2: %.1f\n", getNota2());
        System.out.printf("Nota 3: %.1f\n", getNota3());
        System.out.printf("Média: %.1f\n", calcularMedia());
        System.out.printf("Situação: %s\n", verificarAprovacao());
    }
}
