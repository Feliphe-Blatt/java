public final class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public Disciplina(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public void cadastrarProfessor(Professor professor){
        this.professor = professor;
    }
}
