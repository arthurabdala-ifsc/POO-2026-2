package ads.poo;

public class Caneta {
    private double nivelTinta;
    private String cor;

    private final double CONSUMO = 0.01;
    private final double MENOS_UM = -1;

    public Caneta(String cor){
        this.cor = cor;
        this.nivelTinta = 100.0;
    }

    public double getNivelTinta(){
        return this.nivelTinta;
    }

    public String getCor() {
        return cor;
    }

    // metodo desenhar que recebe as coordenadas inicial e final
    // se houver tinta suficiente, debite o consumo e retorne qual foi o consumo
    // se não houver tinta suficiente, retorne -1

    public double desenhar(double ponto1X, double ponto1Y, double ponto2X, double ponto2Y){
        double consumoTinta = tintaUtilizada(this.nivelTinta,ponto1X,ponto1Y,ponto2X,ponto2Y);

        if (consumoTinta < 0){
            return MENOS_UM;
        } else {
            double nivelTintaAtual = this.nivelTinta;
            this.nivelTinta -= consumoTinta;

            return consumoTinta;

        }
    }

    private double tintaUtilizada(double nivelTinta, double ponto1X, double ponto1Y, double ponto2X, double ponto2Y){
        double distancia = Math.sqrt(Math.pow((ponto2X - ponto1X), 2) + Math.pow((ponto2Y - ponto1Y), 2));

        if (distancia > nivelTinta){
            return MENOS_UM;
        } else {
            return distancia * CONSUMO;
        }
    }

    @Override
    public String toString() {
        return "Cor: " + this.cor + "\nNivel Tinta: " + this.nivelTinta;
    }
}
