package ads.poo;

public class Pessoa {
    private static int iteradorId = 0;
    private int id;
    private String nome;
    private String email;

    public Pessoa(String nome,String email) {
        this.nome = nome;
        this.email = email;
        this.id = ++iteradorId;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Id: " + id + "\nNome: " + nome + "\nEmail: " + email;
    }
}
