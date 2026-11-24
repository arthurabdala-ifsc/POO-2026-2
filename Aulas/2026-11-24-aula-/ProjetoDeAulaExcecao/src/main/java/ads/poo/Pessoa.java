package ads.poo;

import java.time.LocalDate;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String cpf, String nome, LocalDate dataNasc) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
}
