package Controller;

import java.util.List;

public class Atrasados {

    public void generateReport(List<EmprestimoLivro> emprestimoLivros) {
        for (EmprestimoLivro e : emprestimoLivros) {
            if(e.atrasados()) {
                System.out.println("Usuario: "+ e.getUsuario(). getNome());
                System.out.println("Livro: "+ e.getLivros(). getTitulo());
                System.out.println("Data de devolução: "+ e.getDataDevolucao());
                System.out.println();
            }

        }
    }
}
