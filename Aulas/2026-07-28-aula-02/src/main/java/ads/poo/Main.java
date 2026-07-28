package ads.poo;

public class Main {
    static void main() {

        IO.println("Olá mundo");

        String nome = IO.readln("Entre com seu nome: ");

        int idade = Integer.parseInt(IO.readln("Informe a sua idade " + nome + ": "));

        char sexo = IO.readln("Informe o seu sexo (M/F): ").toUpperCase().charAt(0);

        if (sexo == 'M' && idade > 17){
            IO.println("Você deve apresentar seu certificado de reservista");
        }
    }
}
