package ads.poo;


public class App {
    private Pessoa[] banco = new Pessoa[100];
    private int iteradorBanco = 0;

    public void menu(){
        int opcao;

        do {
            IO.println("\nMenu================");
            IO.println("1 - Cadastrar;");
            IO.println("2 - Listar todas as pessoas cadastradas;");
            IO.println("3 - Imprimir dados de uma pessoa;");
            IO.println("4 - Sair;");
            IO.println("====================");

            opcao = Integer.parseInt(IO.readln("Informe a opção desejada: "));

            switch (opcao){
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listarTodasPessoas();
                    break;
                case 3:
                    imprimirDadosPessoa();
                    break;
                case 4:
                    break;
                default:
                    IO.println("Opção Inválida!! Tente novamente");
                    break;
            }

        } while (opcao != 4);
    }

    private void cadastrar(){
        String nome = IO.readln("\nInforme o nome da pessoa: ");
        String email = IO.readln("Informe o email da pessoa: ");
        banco[iteradorBanco] = new Pessoa(nome, email);
        iteradorBanco++;
    }

    private void listarTodasPessoas(){
        String x = "|-----------------------------------------------------------------------|";
        IO.println(x);
        String sh = String.format("| %3s | %30s | %30s |", "Id", "Nome", "Email");
        IO.println(sh);
        IO.println(x);
        for (int i = 0; i < iteradorBanco; i++) {
            Pessoa p = banco[i];
            String s = String.format("| %3d | %30s | %30s |", p.getId(), p.getNome(), p.getEmail());
            IO.println(s);
            IO.println(x);
        }
    }

    private void imprimirDadosPessoa(){
        String nomeBusca = IO.readln("\nInforme o nome da pessoa: ");
        IO.println();

        for (int i = 0; i < iteradorBanco; i++) {
            Pessoa p = banco[i];
            if (p.getNome().equals(nomeBusca)){
                IO.println(p.toString());
                break;
            }
        }
    }


    static void main() {
        App app = new App();

        IO.println("Bem vindo ao seu sistema de cadastros!!");
        app.menu();
        IO.println("Programa finalizado!!");

    }
}
