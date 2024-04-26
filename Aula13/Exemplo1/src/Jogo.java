public class Jogo {

    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    public Jogo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void mostrarDadosJogo() {
        System.out.println("\nTítulo do jogo: " + titulo);
        System.out.println("Plataforma: " + plataforma);
    }

}
