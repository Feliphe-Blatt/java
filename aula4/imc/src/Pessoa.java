public class Pessoa {

    private double peso;
    private double altura;

    // Constructor
    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    // Calcular e retornar o IMC
    public String calcularIMC() {

        double imc = this.getPeso() / (this.getAltura() * this.getAltura());

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Classificação: Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Classificação: Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            classificacao = "Classificação: Sobrepeso";
        } else {
            classificacao = "Classificação: Obesidade";
        }
        return String.format("\nIMC: %.1f\n%s.\n", imc, classificacao);
    }
}
