import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        salvarJogos();
        lerJogosDoArquivo();
        lerJogosDoArrayList();
    }

    private static void salvarJogos() {

        Jogo jogo1 = new Jogo(1, "The Last of Us", "Acao/Aventura");
        Jogo jogo2 = new Jogo(2, "Super Mario World", "Plataforma");
        Jogo jogo3 = new Jogo(3, "The Sims 4", "Simulacao");

        GerenciadorJogo.salvarJogo(jogo1);
        GerenciadorJogo.salvarJogo(jogo2);
        GerenciadorJogo.salvarJogo(jogo3);

        System.out.println("\n3 Jogos foram salvos no arquivo 'jogos.txt'");
    }

    private static void lerJogosDoArquivo() {

        System.out.println("\nJogos cadastrados no arquivo:");

        try {

            GerenciadorJogo.lerJogos();

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }

    private static void lerJogosDoArrayList() {

        System.out.println("\nJogos cadastrados:");

        try {

            for (Jogo tempJogo : GerenciadorJogo.getListaJogos()) {

                System.out.println(tempJogo);

            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}
