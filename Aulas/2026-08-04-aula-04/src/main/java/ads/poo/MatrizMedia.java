package ads.poo;

import java.util.Arrays;

public class MatrizMedia {

    public MatrizMedia() {
    }

    public static void menu() {
        double[][] matrizNotas = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizNotas[i][j] = Double.parseDouble(IO.readln("Informe a nota " + (j + 1) + " do aluno " + (i + 1) + ": "));
                if (j == 1){
                    matrizNotas[i][j+1] = matrizNotas[i][j-1] + matrizNotas[i][j-1] / (matrizNotas.length - 1);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                IO.print(String.format("%d ", matrizNotas[i][j]));
            }
            IO.println();
        }
    }
}