public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Nova obra de arte:");

        String titulo = Console.lerString("Título da obra:");
        String artista = Console.lerString("Artista:");
        int anoCriacao = Console.lerInt("Ano de criação:");
        String tipoObra = Console.lerString("Tipo de obra (pintura, escultura fotografia):");
        String localizacao = Console.lerString("Localização no museu:");

        ObraArte obraArte = new ObraArte(titulo, artista, anoCriacao, tipoObra, localizacao);

        System.out.println("\nObra cadastrada:" + obraArte.exibirDados());

    }
}
