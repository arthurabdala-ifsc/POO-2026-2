package ads.poo;


import java.util.Locale;

public class App {
    static void main() {
        int dia = Integer.parseInt(IO.readln("Entre com o dia: "));

        if (dia < 1 || dia > 31){
            IO.println("Dia inválido");
            return;
        }

        String mes = IO.readln("Entre com o mes: ").toLowerCase();

        switch (mes){
            case "janeiro", "fevereiro":
                IO.println("Verao");
                break;
            case "abril", "maio":
                IO.println("Outono");
                break;
            case "julho", "agosto":
                IO.println("Inverno");
                break;
            case "outubro", "novembro":
                IO.println("Primavera");
                break;
            case "março":
                if (dia < 20){
                    IO.println("Verao");
                } else {
                    IO.println("Outono");
                }
                break;
            case "junho":
                if (dia < 22){
                    IO.println("Outono");
                } else {
                    IO.println("Inverno");
                }
            case "setembro":
                if (dia < 23){
                    IO.println("Inverno");
                } else {
                    IO.println("Primavera");
                }
                break;
            case "dezembro":
                if (dia < 22){
                    IO.println("Primavera");
                } else {
                    IO.println("Verao");
                }
                break;
            default:
                IO.println("Mes inválido!");
        }
    }
}
