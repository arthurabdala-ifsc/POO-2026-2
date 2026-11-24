package ads.poo;

import ads.poo.exception.SaldoInsuficienteException;

public class Conta {
    private int idConta;
    private Pessoa pessoa;
    private double saldo;
    private double valor;

    public Conta(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente! Você tem R$ " + this.saldo);
        } else {
            this.saldo -= valor;
        }
    }
}
