import java.util.Scanner;

import Models.Livro;
import Models.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanf = new Scanner(System.in);
        
        Usuario usua1= new Usuario("Marcos", 4198453-3566, "Rua Ola", "Marcos123@gmail.com");
        Usuario usua2 = new Usuario("Marcela", 4198453-3564, "Rua Oi", "Marcela1234@gmail.com");
        Usuario usua3 = new Usuario("Fernanda", 4198453-3567, "Rua Teste", "Fernanda12345@gmail.com");
        Usuario usua4 = new Usuario("Jéssica", 4198453-3569, "Rua Boa", "Jéssica123456@gmail.com");

        Livro liv1 = new Livro("João", "Pequeno Principe", 2000, 10, 3456);
        Livro liv2 = new Livro("José", "A culpa é das Estrelas", 2014, 5, 3452);
        Livro liv3 = new Livro("Martha", "Diário de um banana", 2012, 8, 3211);
        Livro liv4 = new Livro("Roger", "Divergente", 2010, 3, 9867);

    }
}
