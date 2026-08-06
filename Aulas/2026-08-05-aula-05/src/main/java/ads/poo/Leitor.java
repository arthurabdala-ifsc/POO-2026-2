package ads.poo;

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()){
            double media = 0.0;
            String linha = leitor.nextLine();
            String[] campos = linha.split(",");

            for (int i = 1; i < campos.length; i++) {
                media += Double.parseDouble(campos[i]);
            }
            media /= (campos.length - 1);
            media = Math.round(media);



            IO.println("A media de " + campos[0] + " foi: " + media);

            if (media >= 6){
                IO.println(campos[0] + " foi aprovado!!");
            } else {
                IO.println(campos[0] + " foi reprovado!!");
            }

            IO.println();
        }

        leitor.close();
    }


}
