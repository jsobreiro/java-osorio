public class Livro {

    String titulo;
    String autor;
    int ano;

    public Livro() {

    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autot: " + autor);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println();
    }

}
