package ads.poo;


public class App {
    static void main() {
        Carro fusca = new Carro();

        fusca.acelerar(150);

        IO.println(fusca.obterVelocidadeAtual());

        fusca.frear(10);

        IO.println(fusca.obterVelocidadeAtual());
    }
}
