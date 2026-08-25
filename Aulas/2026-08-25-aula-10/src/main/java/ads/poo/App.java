package ads.poo;


public class App {
    static void main() {

        Caneta canetaAzul = new Caneta("azul");
        Caneta canetaPreta = new Caneta("preta");
        Caneta canetaVermelha = new Caneta("vermelha");

        canetaAzul.getNivelTinta();

        IO.println(canetaPreta);

        IO.println("Foi consumido " + canetaVermelha.desenhar(1,1,2,2)  + " da caneta " + canetaVermelha.getCor());
        // Ajustar o consumo para ser apresentado com 2 casas decimais

    }
}
