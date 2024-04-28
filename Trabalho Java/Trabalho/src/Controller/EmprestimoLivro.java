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


    public EmprestimoLivro(LocalDate dataEmprestimo, LocalDate dataDevolucao, String nome, int id, CadastroUsuario usuario, CadastroLivro livros, LivrosEmprestados livrosEmprestados) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        if (livros.buscarLivro(id).getDisponiveis() > 0){
            this.livro = livros.buscarLivro(id);
            livros.buscarLivro(id).setDisponiveis();
            livros.buscarLivro(id).setPopularidade();
            livrosEmprestados.getLivrosEmprestados().add(livro);
        }
        this.usuario = usuario.buscarUsuario(nome); }
        
    
        public boolean atrasados(){
            LocalDate currentDate = LocalDate.now();
            return dataDevolucao.isBefore(currentDate);
        }
        

    public String devolucao(LocalDate data){
        setDataEfetiva(data);
        livro.setDevolver();

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

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuarios(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "EmprestimoLivro [dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao
                + ", dataEfetiva=" + dataEfetiva + ", usuario=" + usuario + ", livro=" + livro + "]";
    }
}
