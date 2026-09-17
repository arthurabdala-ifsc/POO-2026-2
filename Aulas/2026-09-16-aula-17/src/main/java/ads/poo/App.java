package ads.poo;


import java.util.HashMap;
import java.util.Map;

public class App {
    static void main() {

//        (chave, valor) mapeamento da chave para o valor
//        chave é o índice para chegar no valor
//        chave é unica na coleção

        HashMap<String,String> mapa = new HashMap<>();

        mapa.put("123","Juca");
        mapa.put("456","Ana");
        mapa.put("789","Pedro");

        String nome = mapa.get("456");
        if (nome == null) {
            IO.println("Não encontrado");
        } else{
            IO.println(nome);
        }

        mapa.forEach((chave, valor)->{
            IO.println("chave: " + chave + ", valor: " + valor);
        });

        for (var elemento : mapa.entrySet()){
            IO.println("chave: " + elemento.getKey());
            IO.println("valor: " + elemento.getValue());
        }

        mapa.remove("456"); // remoção pela chave

        mapa.values().removeIf(e->e.equals("Juca")); // remove todos com o valor igual Juca

    }
}
