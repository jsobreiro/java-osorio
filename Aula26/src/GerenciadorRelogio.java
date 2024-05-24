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

                Relogio tempRelogio = new Relogio();

                tempRelogio.fromString(linha);

                listaRelogios.add(tempRelogio);

            }

        }

        if (listaRelogios.isEmpty()) {

            throw new Exception("ATENÇÃO: Não há relógios cadastrados.");
        }

        return listaRelogios;

    }

    public static Relogio buscarRelogio(int codigo) throws Exception {

        ArrayList<Relogio> listaRelogio = lerArquivo();

        for (Relogio tempRelogio : listaRelogio) {

            if (tempRelogio.getCodigo() == codigo) {

                return tempRelogio;
            }
        }

        throw new Exception("\nRelógio com o código " + codigo + " não localizado");

    }

    public static void apagarRelogio(int codigo) throws Exception {

        // chama o método que lê o arquivo e retorna um arraly list com os objetos
        ArrayList<Relogio> listaOriginal = lerArquivo();
        // cria um novo array list
        ArrayList<Relogio> novaLista = new ArrayList<>();

        // percorrer a lista original
        for (Relogio tempRelogio : listaOriginal) {

            // se o objeto atual da lista original tiver um código DIFERENTE
            // do codigo recebido via parametro
            if (tempRelogio.getCodigo() != codigo) {
                // adicionamos o objeto atual na nova lista
                novaLista.add(tempRelogio);
            }
        }

        // se as duas listas tiverem o mesmo tamanho, elas são iguais.
        // OU SEJA, não foi encontrada na lista original nenhum relógio que
        // contenha o código recebido via parametro
        if (listaOriginal.size() == novaLista.size()) {

            // Lança uma exceção neste caso
            throw new Exception("\nRelógio com o código " + codigo + " não localizado");
        }

        // sobrescrever o arquivo com os dados da nova lista
        try (FileWriter fWriter = new FileWriter(ARQUIVO);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            // percorrer a nova lista
            for (Relogio tempRelogio : novaLista) {

                // gravar linha a linha com os objetos presentes na lista
                bWriter.write(tempRelogio.toString() + "\n");

            }

        }

    }

}
