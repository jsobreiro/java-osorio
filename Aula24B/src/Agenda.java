import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Agenda {

    private static final String ARQUIVO = "agenda.txt";

    public static void salvarContato(Contato contato) throws IOException {

        try (FileWriter fWriter = new FileWriter(ARQUIVO, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter)) {

            bWriter.write(contato + "\n");
        }

    }

    public static ArrayList<Contato> lerAgenda() throws IOException, Exception {

        ArrayList<Contato> agenda = new ArrayList<>();

        try (FileReader frReader = new FileReader(ARQUIVO);
                BufferedReader bReader = new BufferedReader(frReader)) {

            String linha;

            while ((linha = bReader.readLine()) != null) {

                String[] dados = linha.split(", ");
                Contato c = new Contato(
                        Integer.parseInt(dados[0]),
                        dados[1],
                        dados[2]);

                agenda.add(c);
            }

        }

        if (agenda.isEmpty()) {

            throw new Exception("Não há contatos salvos na agenda.");
        }

        return agenda;

    }

    public static Contato buscarContato(int codigo) throws Exception {

        ArrayList<Contato> agenda = lerAgenda();

        for (Contato tempContato : agenda) {

            if (tempContato.getCodigo() == codigo) {

                return tempContato;
            }
        }

        throw new Exception("Contato com o código " + codigo + " não encontrado!");

    }

}
