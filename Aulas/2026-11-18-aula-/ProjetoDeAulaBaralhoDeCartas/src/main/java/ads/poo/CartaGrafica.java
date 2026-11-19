package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{
    private String imagem;
    private double posicaoX;
    private double posicaoY;

    public CartaGrafica(Naipe naipe, Valor valor, double posicaoX, double posicaoY) {
        super(naipe, valor);
        this.imagem =  valor.IDENTIFICADOR + naipe.IDENTIFICADOR + ".png";
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public double getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(double posicaoX) {
        this.posicaoX = posicaoX;
    }

    public double getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(double posicaoY) {
        this.posicaoY = posicaoY;
    }

    public void desenhar(Draw draw){
        draw.picture(this.posicaoX, this.posicaoY, "cartas/"+this.imagem);
    }
}
