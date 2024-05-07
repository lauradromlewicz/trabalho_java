package Controller;

import java.util.ArrayList;
import java.util.List;
import Models.Usuario;

public class CadastroUsuario {
    private List<Usuario> usuarios;

    public CadastroUsuario(List<Usuario> usuarios) {
        if (usuarios != null) {
            this.usuarios = usuarios;
        } else {
            this.usuarios = new ArrayList<>();
        }
    }

    public Usuario buscarUsuario(String nome){
        return usuarios.stream().filter(u -> u.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void adicionarUsuario(Usuario usu){
        if(buscarUsuario(usu.getNome()) == null){
            usuarios.add(usu);
        }
    }

    public void removerUsuario(Usuario usu){
        usuarios.removeIf(u -> u.getNome().equals(usu.getNome()));
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "CadastroUsuario [usuarios=" + usuarios + "]";
    }
}