package Controller;

import java.util.List;

import Models.Livro;

public class LivrosEmprestados {
    private List <Livro> livrosEmprestados;

    public LivrosEmprestados() {
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "LivrosEmprestados [livrosEmprestados=" + livrosEmprestados + "]";
    }
}
