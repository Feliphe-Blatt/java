public final class Professor extends Pessoa implements Remuneravel {
    private String titulacao;
    private String areaDePesquisa;
    public Cargo cargo;

    public Professor(String nome, String emailAcademico, String titulacao, String areaDePesquisa){
        super(nome, emailAcademico);
        setTitulacao(titulacao);
        setAreaDePesquisa(areaDePesquisa);
        setCargo(Cargo.PROFESSOR);
    }

    ///////////////////////////////////////////////////
    // Getters and Setters
    ///////////////////////////////////////////////////

    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }
    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    @Override
    public String toString(){
        return "Professor:\n" + "Nome: " + this.getNome() + "\nEmail Acadêmico: " + this.getEmailAcademico() + "\nTitulação: " + this.getTitulacao() + "\nÁrea de Pesquisa: " + this.getAreaDePesquisa();
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
