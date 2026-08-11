package ads.poo;


import java.util.Random;

public class App {
    static void main() {
        Random sorteio = new Random();
        int numSorteado = sorteio.nextInt(1,100);
        int tentativas = 0;
        int numInformado;
        do {
            numInformado = Integer.parseInt(IO.readln("Informe um numero: "));
            tentativas++;
            if (numSorteado > numInformado){
                IO.println("O numero sorteado é maior que " + numInformado);
            } else if (numSorteado < numInformado) {
                IO.println("O numero sorteado é menor que " + numInformado);
            }
        } while (numInformado != numSorteado);

        IO.println("Parabéns, você acertou!");
        IO.println("Foram necessárias " + tentativas + " tentativas");
    }
}
