package Models;

import Models.Super.Pessoa;

public class Usuario extends Pessoa {
    private String endereco;
    private String email;
  
    public Usuario(String nome, int tele, String endereco, String email) {
        super(nome, tele);
        this.endereco = endereco;
        this.email = email;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Usuario [nome = " + super.getNome() + ", telefone = " + super.getTele() + ", endereco=" + endereco + ", email=" + email + "]";
    }
    
}
