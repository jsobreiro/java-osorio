import java.util.ArrayList;

public class Cadastro {

    private static ArrayList<Personagem> listaPersonagens = new ArrayList<>();

    public static void cadastrarPersonagem(Personagem personagem) {
        listaPersonagens.add(personagem);
    }

    public static ArrayList<Personagem> listarPersonagens() {
        return listaPersonagens;
    }

    public static boolean verificarListaVazia() {

        return listaPersonagens.isEmpty();
    }

}
