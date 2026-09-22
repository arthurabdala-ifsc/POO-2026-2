package ads.poo;


import java.util.HashMap;
import java.util.function.BinaryOperator;

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
        boolean livroEncontrado = false;

        for (var e : livros.entrySet()){
            if (e.getValue().getAutor().equals(autor)){
                IO.println("ISBN: " + e.getKey() + " Titulo: " + e.getValue().getTitulo());
                livroEncontrado = true;
            }
        }

        if (!livroEncontrado){
            IO.println("Não existem livros cadastrados para o autor informado!");
        }
    }

    public void consultarLivroPorAno(){
        int ano = Integer.parseInt(IO.readln("Informe o ano: "));
        boolean livroEncontrado = false;

        for (var e : livros.entrySet()){
            if (e.getValue().getAnoPublicacao() == ano){
                IO.println("ISBN: " + e.getKey() + " Titulo: " + e.getValue().getTitulo());
                livroEncontrado = true;
            }
        }

        if (!livroEncontrado){
            IO.println("Não existem livros cadastrados para o autor informado!");
        }
    }

    public void atualizarLivro(){
        Livro livro = livros.get(obterIsbn());

        if (livro == null) {
            IO.println("Livro não encontrado!");
        } else {
            IO.println("Livro encontrado:\n ");
            IO.println(livro.toString());

            int atualizarAtributo = 0;
            do {
                IO.println("(1) Titulo");
                IO.println("(2) Autor");
                IO.println("(3) Ano de Publicação");
                IO.println("(4) Sair");
                IO.println("Informe o atributo que deseja atualizar: ");

                switch (atualizarAtributo){
                    case 1:
                        atualizarTitulo();
                        break;
                    case 4:
                        atualizarAtributo = 4;
                        break;
                    default:
                        IO.println("Opção inválida!!");
                        break;
                }
            } while (atualizarAtributo!=4);
        }
    }
    public void atualizarTitulo(){
        String titulo = IO.readln("Informe o titulo: ");

        for (var e : livros.entrySet()){

        }
    }

    public String obterIsbn(){
        String isbn = IO.readln("Informe o ISBN: ");
        return isbn;
    }



}
