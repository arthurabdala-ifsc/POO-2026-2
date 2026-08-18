package ads.poo;

public class Carro {
    private int velocidadeAtual;
    private int velocidadeMax = 100;
    private int velocidadeMin = 0;

    public void acelerar(int incremento) {
        if (incremento > 0) {
            if ((velocidadeAtual + incremento) > velocidadeMax) {
                velocidadeAtual = velocidadeMax;
            } else {
                velocidadeAtual += incremento;
            }
        }
    }

    public void frear(int decremento){
        if (decremento > 0) {
            if ((velocidadeAtual - decremento) < velocidadeMin) {
                velocidadeAtual = velocidadeMin;
            } else {
                velocidadeAtual -= decremento;
            }
        }
    }

    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

    public Carro() {}




}
