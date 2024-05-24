import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorRelogio {

    private static final String ARQUIVO = "relogios.txt";

    public static void salvarRelogio(Relogio relogio) throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write(relogio.toString() + "\n");

        }

    }

    public static ArrayList<Relogio> lerArquivo() throws IOException, Exception {

        ArrayList<Relogio> listaRelogios = new ArrayList<>();

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                String[] dados = linha.split(", ");

                Relogio tempRelogio = new Relogio(
                        Integer.parseInt(dados[0].split("=")[1]),
                        dados[1].split("=")[1],
                        dados[2].split("=")[1],
                        dados[3].split("=")[1]);

                listaRelogios.add(tempRelogio);

            }

        }

        if (listaRelogios.isEmpty()) {

            throw new Exception("ATENÇÃO: Não há relógios cadastrados.");
        }

        return listaRelogios;

    }

}
