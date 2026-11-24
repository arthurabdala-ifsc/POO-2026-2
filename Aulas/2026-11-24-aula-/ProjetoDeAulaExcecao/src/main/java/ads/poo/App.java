package ads.poo;


import ads.poo.exception.SaldoInsuficienteException;

import java.time.LocalDate;

public class App {
    static void main() {
        Conta conta = new Conta(new Pessoa("69197955078","João Vitor", LocalDate.of(2005,12,20)));

        try {
            conta.saque(50);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e);
        }
    }
}
