package ads.poo;


import java.util.HashMap;

public class App {

    private HashMap<String, Livro> livros = new HashMap<>();


    static void main(String[] args) {
        App app = new App();

    }

    public void cadastrar(){

        String isbn = obterIsbn();

        Boolean isbnJaCadastrado = livros.containsKey(isbn);

        if (isbnJaCadastrado == true){
            IO.println("O ISBN " + isbn + " já está cadastrado!");
            return;
        } else {
            String titulo = IO.readln("Informe o titulo do livro: ");
            String autor = IO.readln("Informe o autor do livro: ");
            int anoPublicacao = Integer.parseInt(IO.readln("Informe o ano de publicação do livro: "));

            livros.put(isbn, new Livro(isbn,titulo,autor,anoPublicacao));
        }

    }

    public void listarTodos(){
        livros.forEach((isbn, livro)->{
            IO.println("ISBN: " + isbn + " Titulo: " + livro.getTitulo());
        });
    }

    public void consultarLivroPorIsbn(){
        Livro livro = livros.get(obterIsbn());
        if (livro == null) {
            IO.println("Livro não encontrado!");
        } else {
            IO.println(livro.toString());
        }
    }

    public void consultarLivroPorAutor(){
        String autor = IO.readln("Informe o autor: ");

        livros.forEach((isbn, l)->{
            if (l.getAutor().equals(autor)){
                IO.println("ISBN: " + isbn + " Titulo: " + l.getTitulo());
            }
        });
    }

    public String obterIsbn(){
        String isbn = IO.readln("Informe o ISBN: ");
        return isbn;
    }



}
