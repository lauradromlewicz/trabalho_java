package Controller;

import java.util.List;
import Models.Livro;

public class CadastroLivro {
    private List<Livro>livros;

    public Livro buscarLivro(String titulo){
        return livros.stream().filter(b -> b. getTitulo().equals(titulo)).findFirst().orElse(null);
    }

    public Livro buscarAutor(String autor){
        return livros.stream().filter(b -> b. getAutor().equals(autor)).findFirst().orElse(null);
    }

    public Livro buscarLivro(int id){
        return livros.stream().filter(b -> b. getId()==(id)).findFirst().orElse(null);
    }

    public void livros(Livro lv){
        if(buscarLivro(lv.getId()) == null || buscarLivro(lv.getTitulo()) == null) {
            livros.add(lv);
    }

    }

    public boolean verificarLivro(String titulo){
        for (Livro li : livros) {
            if (li.getTitulo().equals(titulo)) {
                return true;
            }
        }
        return false;
    }
}


