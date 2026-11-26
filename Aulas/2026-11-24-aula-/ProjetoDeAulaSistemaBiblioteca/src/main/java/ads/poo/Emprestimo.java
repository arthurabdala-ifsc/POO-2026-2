package ads.poo;

import ads.poo.exception.LimiteEmprestimosAtingidoException;
import ads.poo.exception.LivroJaEmprestadoException;

public interface Emprestimo {
    public boolean cadatrarEmprestimo(Usuario usuario, Livro livro) throws LivroJaEmprestadoException, LimiteEmprestimosAtingidoException;

    Situacao getSituacao();
}
