package Controller;

import java.util.ArrayList;
import java.util.List;
import Models.Livro;

public class LivrosEmprestados {
    private List<Livro> livrosEmprestados;

    public LivrosEmprestados() {
        this.livrosEmprestados = new ArrayList<>();
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "LivrosEmprestados [livrosEmprestados=" + livrosEmprestados + "]";
    }
}
