public abstract class Pessoa {
    protected String nome;
    protected String emailAcademico;

    public Pessoa(String nome, String emailAcademico) {
        setNome(nome);
        setEmailAcademico(emailAcademico);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailAcademico() {
        return emailAcademico;
    }
    public void setEmailAcademico(String emailAcademico) {
        this.emailAcademico = emailAcademico;
    }

    public abstract String toString();
}
