public class App {
    public static void main(String[] args) throws Exception {

        ObraArte obra1 = new ObraArte("Pintura Famosa", "Fulano de tal", 2020, "Pintura", "Galeria Principal");
        ObraArte obra2 = new ObraArte("Fotografia X", "Cicrano de Tal", 1999, "Fotografia", "Salão de Fotos");
        ObraArte obra3 = new ObraArte("Escultura épica", "Sr Escultor", 1755, "Escultura", "Hall Principal");

        GerenciadorObrasArte.salvarObra(obra1);
        GerenciadorObrasArte.salvarObra(obra2);
        GerenciadorObrasArte.salvarObra(obra3);

        System.out.println("\nProcurar a obra 'bolinho':");

        try {
            ObraArte busca1 = GerenciadorObrasArte.buscarObra("bolinho");
            System.out.println(busca1.exibirDados());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("\nProcurar a obra 'Famosa':");

        try {
            ObraArte busca2 = GerenciadorObrasArte.buscarObra("Famosa");
            System.out.println(busca2.exibirDados());

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        System.out.println("\nTentar apagar obra que contenha a letra 'X'");

        try {

            ObraArte busca3 = GerenciadorObrasArte.buscarObra("X");
            GerenciadorObrasArte.excluirObra(busca3);
            System.out.println("Obra de arte " + busca3.getTitulo() + " excluído com sucesso");

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }

        System.out.println("\nObras cadastradas:");

        for (ObraArte tempObra : GerenciadorObrasArte.getListaObras()) {

            System.out.println(tempObra.exibirDados());
        }

    }
}
