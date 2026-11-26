package ads.poo;


import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    static void main() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Emprestimo> historico = new ArrayList<>();

        usuarios.add(new Usuario("123456789","Joãozinho", LocalDate.of(2000,12, 25)));
        usuarios.add(new Usuario("987456321","Mariazinha", LocalDate.of(2007,10, 13)));
        usuarios.add(new Usuario("456321987","Roberto", LocalDate.of(2010,7, 20)));

        livros.add(new Livro("123456","Caçadores de Bruxas","autor1",LocalDate.of(1989,5, 16)));
        livros.add(new Livro("987654","O Outro Livro","outroAutor",LocalDate.of(1996,7, 21)));
        livros.add(new Livro("654123","Pequeno Principe","principe",LocalDate.of(2009,11, 25)));


    }
}
