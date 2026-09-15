package ads.poo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class App {
    static void main() {
//        Primeira parte da aula
//
//        ArrayList<String> lista = new ArrayList<>();
//
//        lista.add("POO");
//        lista.add("ADS");
//        lista.add("IFSC");
//        lista.add(1,"SJE");
//
//        IO.println(lista);
//
//        // for i
//        for (int i = 0; i < lista.size(); i++) {
//            IO.println(lista.get(i));
//        }
//
//        IO.println();
//
//        // for each
//        for (String e : lista) {
//            IO.println(e);
//        }
//
//        // for each do ArrayList
//        lista.forEach(e -> IO.println(e));
//        lista.forEach(e -> {
//            IO.println(e);
//        });
//        lista.forEach(IO::println);
//
//        lista.removeIf(e -> e.equals("ADS"));
//
//        Segunda parte da aula
//
//        ArrayList<Pessoa> agenda = new ArrayList<>();
//
//        agenda.add(new Pessoa("Juca", "juca@example.org"));
//        agenda.add(new Pessoa("Ana", "ana@example.org"));
//        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
//        agenda.add(new Pessoa("Juca", "juca@example.org"));
//
////        Pessoa p = new Pessoa("Juca", "juca@example");
//
////        agenda.remove(p);
//
//        agenda.removeIf(p -> p.getNome().equals("Juca"));
//
//        agenda.forEach(IO::println);
//
//        Terceira Parte

        HashSet<Pessoa> agenda = new HashSet<>();

        agenda.add(new Pessoa("Juca", "juca@example.org"));
        agenda.add(new Pessoa("Ana", "ana@example.org"));
        agenda.add(new Pessoa("Pedro", "pedro@example.org"));
        agenda.add(new Pessoa("Juca", "juca@example.org"));


        agenda.removeIf(p -> p.getNome().equals("Juca"));

        agenda.forEach(IO::println);
    }
}
