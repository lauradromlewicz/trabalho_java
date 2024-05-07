package Controller;

import java.util.ArrayList;
import java.util.List;
import Models.Livro;


public class CadastroLivro {
    private List<Livro>livros;

   public CadastroLivro() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro liv){
        if(buscarLivro(liv.getTitulo()) == null){
            livros.add(liv);
        }
    }

    public Livro buscarLivro(String titulo){
        return livros.stream().filter(b -> b. getTitulo().equals(titulo)).findFirst().orElse(null);
    }

    public Livro buscarAutor(String autor){
        return livros.stream().filter(b -> b. getAutor().equals(autor)).findFirst().orElse(null);
    }

    public Livro buscarLivro(int id){
        return livros.stream().filter(b -> b. getId()==(id)).findFirst().orElse(null);
    }

    public void livros(Livro liv){
        if(buscarLivro(liv.getId()) == null || buscarLivro(liv.getTitulo()) == null) {
            livros.add(liv);
    }

    }

    public boolean verificarLivro(String titulo) {
        return livros.stream().anyMatch(li -> li.getTitulo().equals(titulo));
    }
    
}


