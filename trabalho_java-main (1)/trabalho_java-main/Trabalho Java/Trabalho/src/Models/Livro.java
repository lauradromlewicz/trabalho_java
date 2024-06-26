package Models;

public class Livro implements Comparable<Livro> {
    private String autor;
    private String titulo;
    private int anoPublicacao;
    private int disponiveis;
    private int id;
    private int popularidade;
    
    public Livro(String autor, String titulo, int anoPublicacao, int disponiveis, int id) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponiveis = disponiveis;
        this.id = id;
        this.popularidade = 0;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getDisponiveis() {
        return disponiveis;
    }

    public void setDisponiveis(int disponiveis) {
        this.disponiveis = disponiveis;
    }

    public void adicionarExemplar() {
        this.disponiveis++;
    }

    public void removerExemplar() {
        this.disponiveis--;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public void incrementarPopularidade() {
        this.popularidade++;
    }

    
    @Override
    public int compareTo(Livro livro) {
        return Integer.compare(this.popularidade, livro.popularidade);
    }

  
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + ", disponiveis="
                + disponiveis + ", id=" + id + ", popularidade=" + popularidade + "]";
    }

}

