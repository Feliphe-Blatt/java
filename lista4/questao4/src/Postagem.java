public class Postagem {
    private int curtidas;
    private int comentarios;
    private int compartilhamentos;
    private int seguidores;

    public Postagem(int curtidas, int comentarios, int compartilhamentos, int seguidores) {
        setCurtidas(curtidas);
        setComentarios(comentarios);
        setCompartilhamentos(compartilhamentos);
        setSeguidores(seguidores);
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }

    public void setComentarios(int comentarios) {
        this.comentarios = comentarios;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public void setCompartilhamentos(int compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public double calcularEngajamento() {
        int interacoes = getCurtidas() + getComentarios() + getCompartilhamentos();
        if (getSeguidores() == 0) {
            return 0;
        }
        return (interacoes / (double) getSeguidores()) * 100;
    }

    public void exibirDetalhesPostagem() {
        System.out.printf("\nCurtidas: %d\n", getCurtidas());
        System.out.printf("Comentários: %d\n", getComentarios());
        System.out.printf("Compartilhamentos: %d\n", getCompartilhamentos());
        System.out.printf("Seguidores: %d\n", getSeguidores());
        System.out.printf("Engajamento: %.1f%%\n", calcularEngajamento());
    }
}
