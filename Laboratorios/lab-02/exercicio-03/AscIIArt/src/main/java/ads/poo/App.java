package ads.poo;

import java.util.Locale;

public class App {
    static void main(){
        String formato;
        int tamanho = Integer.parseInt(IO.readln("Informe o tamanho do " + formato + ": "));
        int tamanhoMinimo;
        boolean entradasValidas = false;

        do {
            formato = IO.readln("Informe o formato (triangulo, losangulo, retangulo): ").toLowerCase();
        } while (entradasValidas == false);

        switch (formato){
            case "triangulo":
                tamanhoMinimo = 2;
        }



    }
}
