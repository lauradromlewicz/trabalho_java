package Controller;

import java.util.List;

import Models.Usuario;

public class CadastroUsuario {
    private List<Usuario> usuarios;

    public Usuario buscarUsuario(String nome){
        return usuarios.stream().filter(u -> u.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void adicionarUsuario(Usuario us){
        if(buscarUsuario(us.getNome()) == null){
            usuarios.add(us);
        }
    }

    public void removerUsuario(Usuario us){
        if(buscarUsuario(us.getNome()) == us){
            usuarios.remove(us);
        }
    }
   
    public CadastroUsuario(List<Usuario> usuarios) {
        this.usuarios = usuarios;
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
