package ads.poo.produtos;

import ads.poo.Dimensao;

public class SemFio extends Telefone {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, String discador, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, dimensao, discador);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append("frequencia=").append(frequencia);
        sb.append(", canais=").append(canais);
        sb.append(", distanciaOperacao=").append(distanciaOperacao);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
