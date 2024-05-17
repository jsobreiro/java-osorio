import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

}
