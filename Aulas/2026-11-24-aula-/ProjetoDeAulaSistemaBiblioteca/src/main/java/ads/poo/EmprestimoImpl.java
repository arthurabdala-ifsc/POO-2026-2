package ads.poo;

import ads.poo.exception.LimiteEmprestimosAtingidoException;
import ads.poo.exception.LivroJaEmprestadoException;

import java.time.LocalDate;

public class EmprestimoImpl implements Emprestimo{
    private static int contadorId = 0;

    private static final int LIMITE_EMPRESTIMOS_ATIVOS_POR_USUARIO = 3;

    private int idEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private Situacao situacao;

    private EmprestimoImpl(Usuario usuario, Livro livro){
        this.idEmprestimo = ++contadorId;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.situacao = Situacao.ATIVO;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    private boolean validaEmprestimo(Usuario usuario, Livro livro) throws LivroJaEmprestadoException, LimiteEmprestimosAtingidoException {
        if (usuario.getEmprestimosAtivosDoUsuario().size() > LIMITE_EMPRESTIMOS_ATIVOS_POR_USUARIO) {
            throw new LimiteEmprestimosAtingidoException("O usuário " + usuario + " atingiu o limite 3 de emprestimos ativos! Emprestimos ativos: " + usuario.getEmprestimosAtivosDoUsuario().size());
        }
        return false;
    }

    @Override
    public boolean cadatrarEmprestimo(Usuario usuario, Livro livro) throws LivroJaEmprestadoException, LimiteEmprestimosAtingidoException {
        if (validaEmprestimo(usuario, livro)){
            new EmprestimoImpl(usuario,livro);
        }
        return false;
    }
}
