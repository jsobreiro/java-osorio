import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ObraPersistencia {

    private static final String ARQUIVO = "obras-arte.txt";

    public static void salvarNoArquivo() throws IOException {

        ArrayList<ObraArte> listaObras = GerenciadorObrasArte.getListaObras();

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (ObraArte tempObra : listaObras) {

                bWriter.write(tempObra.toString() + "\n");

            }

        }

    }

    public static void lerDoArquivo() throws IOException {

        ArrayList<ObraArte> listaObras = GerenciadorObrasArte.getListaObras();
        listaObras.clear();

        try (FileReader frReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                ObraArte tempObra = new ObraArte();

                tempObra.fromString(linha);

                GerenciadorObrasArte.salvarObra(tempObra);

            }

        }

    }

    public static void criarArquivoSeNaoExistir() {

        try {
            File arquivo = new File(ARQUIVO);

            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

        } catch (IOException exception) {

            exception.printStackTrace();
        }

    }

}
