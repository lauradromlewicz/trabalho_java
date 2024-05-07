import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Relatorio;
import Controller.CadastroLivro;
import Controller.CadastroUsuario;
import Controller.EmprestimoLivro;
import Models.Livro;
import Models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        int opcao;
        Scanner scanf = new Scanner(System.in);
        CadastroLivro lLivro = new CadastroLivro();
        CadastroUsuario lUsuario = new CadastroUsuario(new ArrayList<>()); // Inicialize o cadastro de usuário com uma lista vazia
        EmprestimoLivro lEmprestimo = new EmprestimoLivro();
        Relatorio relatorio = new Relatorio(); // Instancie a classe Relatorio

        // Usuários
        Usuario usua1= new Usuario("Marcos", "4198453-3566", "Rua Ola", "Marcos123@gmail.com");
        Usuario usua2 = new Usuario("Marcela", "4198453-3564", "Rua Oi", "Marcela1234@gmail.com");
        Usuario usua3 = new Usuario("Fernanda", "4198453-3567", "Rua Teste", "Fernanda12345@gmail.com");
        Usuario usua4 = new Usuario("Jéssica", "4198453-3569", "Rua Boa", "Jessica123456@gmail.com");
        
        // Adicionar usuários ao cadastro
        lUsuario.adicionarUsuario(usua1);
        lUsuario.adicionarUsuario(usua2);
        lUsuario.adicionarUsuario(usua3);
        lUsuario.adicionarUsuario(usua4);

        // Livros
        Livro liv1 = new Livro("João", "Pequeno Principe", 2000, 10, 3456);
        Livro liv2 = new Livro("José", "A culpa é das Estrelas", 2014, 5, 3452);
        Livro liv3 = new Livro("Martha", "Diário de um banana", 2012, 8, 3211);
        Livro liv4 = new Livro("Roger", "Divergente", 2010, 3, 9867);

        // Adicionar livros ao cadastro
        lLivro.adicionarLivro(liv1);
        lLivro.adicionarLivro(liv2);
        lLivro.adicionarLivro(liv3);
        lLivro.adicionarLivro(liv4);

        do {
            System.out.println("Seja bem-vindo a Biblioteca da Laura! - Menu:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Realizar Devolução");
            System.out.println("5. Gerar Relatório");
            System.out.println("6. Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = scanf.nextInt();
            scanf.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String title = scanf.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String aut = scanf.nextLine();
                    System.out.println("Digite o ano de publicação do livro:");
                    int ano = scanf.nextInt();
                    System.out.println("Digite a quantidade de exemplares disponíveis:");
                    int disponiveis = scanf.nextInt();
                    System.out.println("Digite o ID do livro:");
                    int id = scanf.nextInt();
                    
                    Livro livroNovo = new Livro(aut, title, ano, disponiveis, id);
                    lLivro.adicionarLivro(livroNovo);
                    break;
                case 2:
                    System.out.println("Digite o nome do usuário:");
                    String nm = scanf.nextLine();
                    System.out.println("Digite o telefone:");
                    String tele = scanf.nextLine();
                    System.out.println("Digite o endereço:");
                    String endereco = scanf.nextLine();
                    System.out.println("Digite o email:");
                    String email = scanf.nextLine();

                    Usuario novoUsuario = new Usuario(nm, tele, endereco, email); // Correção aqui: use "nm" em vez de "nome"
                    lUsuario.adicionarUsuario(novoUsuario);
                    break;
                case 3:
                    System.out.println("Digite o título do livro a ser emprestado:");
                    String tituloLivro = scanf.nextLine();
                    Livro livroEmprestimo = lLivro.buscarLivro(tituloLivro);
                    if (livroEmprestimo != null && livroEmprestimo.getDisponiveis() > 0) {
                        System.out.println("Digite o nome do usuário que está pegando emprestado:");
                        String nomeUsuario = scanf.nextLine();
                        Usuario usuarioEmprestimo = lUsuario.buscarUsuario(nomeUsuario);
                        if (usuarioEmprestimo != null) {
                            LocalDate dataEmprestimo = LocalDate.now();
                            LocalDate dataDevolucao = dataEmprestimo.plusDays(7); // Prazo de devolução de 7 dias
                            lEmprestimo.realizarEmprestimo(dataEmprestimo, dataDevolucao, usuarioEmprestimo, livroEmprestimo, lLivro);
                            System.out.println("Empréstimo realizado com sucesso!");
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                    } else {
                        System.out.println("Livro não encontrado ou não disponível para empréstimo.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o título do livro a ser devolvido:");
                    String tituloDevolucao = scanf.nextLine();
                    Livro livroDevolucao = lLivro.buscarLivro(tituloDevolucao);
                    if (livroDevolucao != null) {
                        System.out.println("Digite o nome do usuário que está devolvendo:");
                        String nomeUsuarioDevolucao = scanf.nextLine();
                        Usuario usuarioDevolucao = lUsuario.buscarUsuario(nomeUsuarioDevolucao);
                        if (usuarioDevolucao != null) {
                            boolean devolucaoRealizada = lEmprestimo.realizarDevolucao(usuarioDevolucao, livroDevolucao);
                            if (devolucaoRealizada) {
                                System.out.println("Devolução realizada com sucesso!");
                            } else {
                                System.out.println("O usuário não possui empréstimo desse livro.");
                            }
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Gerar Relatório:");
                    System.out.println("1. Livros Emprestados");
                    System.out.println("2. Usuários com Atrasos");
                    System.out.println("3. Livros Mais Populares");
                    System.out.print("Escolha a opção desejada: ");
                    int relatorioOpcao = scanf.nextInt();
                    switch (relatorioOpcao) {
                        case 1:
                            relatorio.gerarRelatorioLivrosEmprestados(lLivro.getLivrosEmprestados());
                            break;
                        case 2:
                            relatorio.gerarRelatorioUsuariosAtrasados(lEmprestimo.getUsuariosAtrasados());
                            break;
                        case 3:
                            relatorio.gerarRelatorioLivrosMaisPopulares(lLivro.getLivrosMaisPopulares());
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanf.close();
    }
}
