package Controller;

import java.util.List;
import java.time.format.DateTimeFormatter;

public class Relatorio {

    public void generateReport(List<EmprestimoLivro> emprestimoLivros) {
        boolean atrasadosEncontrados = false;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (EmprestimoLivro e : emprestimoLivros) {
            if(e.atrasados()) {
                atrasadosEncontrados = true;
                System.out.println("Usuário: " + e.getUsuario().getNome());
                System.out.println("Livro: " + e.getLivros().getTitulo());
                System.out.println("Data de devolução: " + e.getDataDevolucao().format(formatter));
                System.out.println("Data de Empréstimo" + e.getDataEmprestimo().format(formatter));
            }
        }

        if (!atrasadosEncontrados) {
            System.out.println("Não há empréstimos atrasados.");
        }
    }
}
