public final class Coordenador extends Pessoa implements Remuneravel {

    public Coordenador(String nome, String emailAcademico) {
        super(nome, emailAcademico);
    }

    @Override
    public String toString(){
        return "Coordenador:\n" + "Nome: " + this.getNome() + "\nEmail Acadêmico: " + this.getEmailAcademico();
    }

    @Override
    public double calcularSalario() {
        return 10000;
    }

    @Override
    public double aplicarBonus() {
        return 5000;
    }
}
