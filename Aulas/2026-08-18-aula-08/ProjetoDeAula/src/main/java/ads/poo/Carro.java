package ads.poo;

public class Carro {
    private int velocidadeAtual;
    private int velocidadeMax = 100;
    private int velocidadeMin = 0;

    public void acelerar(int incremento) {
        if (incremento < 1){
            return;
        }

        velocidadeAtual += incremento;

        if (velocidadeAtual > velocidadeMax){
           velocidadeAtual = velocidadeMax;
        }

    }

    public void frear(int decremento){
        if (decremento < 1){
            return;
        }

        velocidadeAtual -= decremento;

        if (velocidadeAtual < velocidadeMin){
            velocidadeAtual = velocidadeMin;
        }
    }

    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }

    public Carro() {}




}
