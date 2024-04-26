import java.util.ArrayList;
import java.util.List;

public class ListaJogos {

    private String nomeProprietario;
    private List<Jogo> listaJogos;

    public ListaJogos(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;

        listaJogos = new ArrayList<>();
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public void adicionarJogo(Jogo novoJogo) {

        listaJogos.add(novoJogo);
        System.out.println("\nJogo " + novoJogo.getTitulo() +
                " foi adicionado a lista de " + nomeProprietario);
    }

    public void mostrarTodosOsJogos() {

        System.out.println("\nLista de jogos de " + nomeProprietario);

        // percorrer a lista de jogos com um foreach
        for (Jogo jogoAtual : listaJogos) {

            // mostrar dados do jogoAtual da lista
            jogoAtual.mostrarDadosJogo();
        }

    }

}
