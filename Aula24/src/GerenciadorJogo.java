import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorJogo {

    private static final String ARQUIVO = "jogos.txt";

    public static void salvarJogo(Jogo jogo) {

        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write(jogo + "\n");

        } catch (IOException e) {
            System.out.println("Houve um erro ao criar ou acessar o arquivo " + ARQUIVO);
        }

    }

    public static void lerJogos() throws IOException {

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                System.out.println(linha);

            }

        }

    }

    public static ArrayList<Jogo> getListaJogos() throws IOException, Exception {

        ArrayList<Jogo> listaJogos = new ArrayList<>();

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                String[] dadosJogo = linha.split(", ");

                Jogo jogo = new Jogo(Integer.parseInt(dadosJogo[0]),
                        dadosJogo[1],
                        dadosJogo[2]);

                listaJogos.add(jogo);
            }
        }

        if (listaJogos.isEmpty()) {

            throw new Exception("\nNão há jogos cadastrados!");
        }

        return listaJogos;

    }

}
