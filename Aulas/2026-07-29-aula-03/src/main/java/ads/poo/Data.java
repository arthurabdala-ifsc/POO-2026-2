package ads.poo;

public class Data {
    // Faça um programa que o usuário deve informar
    // - Sigla da disciplina
    // - Os dias da semana que tem aula dessa disciplina
    //
    // Por fim, imprima:
    //    Na disciplina ****** você tem aula nos seguintes dias:
    //    seg
    //    qua
    //    sex

    public Data(){
    }

    public void executar(){
        String disciplina = IO.readln("Informe a sigla da disciplina: ");

        String[] dias = new String[5];

        System.out.println("Informe os dias da semana que tem a disciplina " + disciplina + ": ");
        System.out.println("Informe nao para encerrar");

        boolean encerrar = false;

        do {
            for (String dia : dias) {
               dia = IO.readln("- ").toLowerCase();

               switch (dia){
                   case "seg","ter","qua","qui","sex":
                       break;
                   default:
               }

               if (dia.equals("nao")){
                    encerrar = true;
                }
            }
        } while (!encerrar);
    }



}
