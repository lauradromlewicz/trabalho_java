package Models.Super;

public abstract class Pessoa {
    private String nome;
    private int tele;
    
    public Pessoa(String nome, int tele) {
        this.nome = nome;
        this.tele = tele;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    @Override
    public abstract String toString();
    

}
  