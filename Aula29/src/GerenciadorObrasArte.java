import java.util.ArrayList;

public abstract class GerenciadorObrasArte {

    private static ArrayList<ObraArte> listaObras = new ArrayList<>();

    public static void salvarObra(ObraArte obra) {
        listaObras.add(obra);
    }

    public static ArrayList<ObraArte> getListaObras() {
        return listaObras;
    }

    public static ObraArte buscarObra(String titulo) throws Exception {

        for (ObraArte tempObraArte : listaObras) {

            if (tempObraArte.getTitulo().contains(titulo)) {
                return tempObraArte;
            }

        }

        throw new Exception("\nObra de arte não localizada!");

    }

    public static void excluirObra(ObraArte obra) {
        listaObras.remove(obra);
    }

    public static void verificarListaVazia() throws Exception {

        if (listaObras.isEmpty()) {
            throw new Exception("\nATENÇÃO: Não há obras cadastradas");
        }
    }

}
