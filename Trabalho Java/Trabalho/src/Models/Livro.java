package Models;


public class Livro implements Comparable{
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


    public void setDisponiveis() {
        this.disponiveis = this.disponiveis--;
    }

    public void setDevolver() {
        this.disponiveis = this.disponiveis++;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getPopularidade() {
        return popularidade;
    }


    public void setPopularidade() {
        this.popularidade = this.popularidade++;
    }




    @Override
    public String toString() {
        return "CadastroLivro [autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao
                + ", disponiveis=" + disponiveis + ", Id="+ id + ",  popularidade=" + popularidade+ "]";
    }
   
    @Override
    public int compareTo(Livro livro) {
        return Integer.compare(livro.popularidade, this.popularidade);
    }
    
}
