package ads.poo.produtos;

import ads.poo.Dimensao;

public class Telefone extends Produto{
    protected String discador;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String discador) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.discador = discador;
    }


}
