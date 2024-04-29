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

    public static boolean verificarHeroisNaLista() {

        for (Personagem tempPersonagem : listaPersonagens) {

            if (tempPersonagem instanceof Heroi) {
                return true;
            }

        }

        return false;
    }

    public static boolean verificarViloesNaLista() {

        for (Personagem tempPersonagem : listaPersonagens) {

            if (tempPersonagem instanceof Vilao) {
                return true;
            }

        }

        return false;
    }

}
