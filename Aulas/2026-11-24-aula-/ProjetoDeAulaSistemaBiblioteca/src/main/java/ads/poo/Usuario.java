package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario{
    private String cpf;
    private String nome;
    private LocalDate dataNasc;
    private ArrayList<Emprestimo> emprestimosDoUsuario;

    public Usuario(String cpf, String nome, LocalDate dataNasc) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public ArrayList<Emprestimo> getEmprestimosDoUsuario() {
        return emprestimosDoUsuario;
    }

    public ArrayList<Emprestimo> getEmprestimosAtivosDoUsuario() {
        ArrayList<Emprestimo> emprestimoAtivo = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimosDoUsuario){
            if (emprestimo.getSituacao() == Situacao.ATIVO){
                emprestimoAtivo.add(emprestimo);
            }
        }
        return emprestimoAtivo;
    }

    @Override
    public String toString() {
        return nome;
    }
}
