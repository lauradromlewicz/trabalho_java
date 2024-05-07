package Controller;

import java.time.LocalDate;
import Models.Livro;
import Models.Usuario;

public class EmprestimoLivro {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataEfetiva;
    private Usuario usuario;
    private Livro livro;

    public boolean realizarEmprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Usuario usuario, Livro livro, LivrosEmprestados livrosEmprestados) {
        
        if (livro.getDisponiveis() > 0) {
            this.dataEmprestimo = dataEmprestimo;
            this.dataDevolucao = dataDevolucao;
            this.usuario = usuario;
            this.livro = livro;

            
            livro.removerExemplar();
            
            livro.incrementarPopularidade();
           
            livrosEmprestados.adicionarLivro(livro);

            return true; 
        } else {
            return false; 
        }
    }

    public boolean atrasados() {
        LocalDate currentDate = LocalDate.now();
        return dataDevolucao.isBefore(currentDate);
    }

    public String devolucao(LocalDate data) {
        setDataEfetiva(data);
        livro.adicionarExemplar(); 
        return "O livro foi devolvido \n";
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataEfetiva() {
        return dataEfetiva;
    }

    public void setDataEfetiva(LocalDate dataEfetiva) {
        this.dataEfetiva = dataEfetiva;
    }

    public Livro getLivros() {
        return livro;
    }

    public void setLivros(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "EmprestimoLivro [dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao
                + ", dataEfetiva=" + dataEfetiva + ", usuario=" + usuario + ", livro=" + livro + "]";
    }
}
