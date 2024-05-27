import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class GerenciadorRelogio {

    private static final String ARQUIVO = "relogios.txt";
    private static ArrayList<Relogio> listaRelogios = new ArrayList<>();

    public static void salvarRelogio(Relogio relogio) throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write(relogio.toString() + "\n");

        }

    }

    public static ArrayList<Relogio> getListaRelogios() throws Exception {

        verirficarListaVazia();
        return listaRelogios;
    }

    public static void lerArquivo() throws IOException {

        listaRelogios.clear();

        try (FileReader fReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(fReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                Relogio tempRelogio = new Relogio();

                tempRelogio.fromString(linha);

                listaRelogios.add(tempRelogio);

            }

        }

    }

    private static void verirficarListaVazia() throws Exception {

        if (listaRelogios.isEmpty()) {

            throw new Exception("\nATENÇÃO: Não há relógios cadastrados");
        }
    }

    public static Relogio buscarRelogio(int codigo) throws Exception {

        verirficarListaVazia();

        for (Relogio tempRelogio : listaRelogios) {

            if (tempRelogio.getCodigo() == codigo) {

                return tempRelogio;
            }
        }

        throw new Exception("\nRelógio com o código " + codigo + " não localizado");

    }

    private static void atualizarArquivo() throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            for (Relogio tempRelogio : listaRelogios) {

                bWriter.write(tempRelogio.toString() + "\n");
            }

        }

    }

    public static void apagarRelogio(int codigo) throws Exception {

        verirficarListaVazia();

        boolean encontrou = false;

        for (Relogio tempRelogio : listaRelogios) {

            if (tempRelogio.getCodigo() == codigo) {

                listaRelogios.remove(tempRelogio);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {

            // Lança uma exceção neste caso
            throw new Exception("\nRelógio com o código " + codigo + " não localizado");
        }

        atualizarArquivo();

    }

    public static void atualizarRelogio(Relogio relogio) throws Exception {

        verirficarListaVazia();

        for (Relogio tempRelogio : listaRelogios) {

            if (tempRelogio.getCodigo() == relogio.getCodigo()) {

                tempRelogio = relogio;
            }

        }

        atualizarArquivo();

    }

    public static void apagarTodos() throws IOException, Exception {

        verirficarListaVazia();

        try (FileWriter fWriter = new FileWriter(ARQUIVO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write("");
            listaRelogios.clear();
        }

        atualizarArquivo();

    }

}
