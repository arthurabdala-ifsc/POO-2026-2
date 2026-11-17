package ads.poo;


import java.util.ArrayList;

public class App {
    static void main() {
        // Crie 3 disciplinas e imprima apenas as disciplnas que tem aula na Terça

        ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

        listaDisciplinas.add(new Disciplina("POO", new DiaDaSemana[]{DiaDaSemana.TERÇA,DiaDaSemana.QUARTA}));
        listaDisciplinas.add(new Disciplina("SEG", new DiaDaSemana[]{DiaDaSemana.TERÇA,DiaDaSemana.QUARTA}));
        listaDisciplinas.add(new Disciplina("COE", new DiaDaSemana[]{DiaDaSemana.QUINTA}));


    }
}
