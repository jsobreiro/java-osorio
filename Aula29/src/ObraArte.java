public class ObraArte {

    private String titulo;
    private String artista;
    private int anoCriacao;
    private String tipoObra;
    private String localizacao;

    public ObraArte() {
    }

    public ObraArte(String titulo, String artista, int anoCriacao, String tipoObra, String localizacao) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoCriacao = anoCriacao;
        this.tipoObra = tipoObra;
        this.localizacao = localizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", artista=" + artista + ", anoCriacao=" + anoCriacao + ", tipoObra="
                + tipoObra + ", localizacao=" + localizacao;
    }

    public void fromString(String linha) {

        String[] partes = linha.split(", ");

        titulo = partes[0].split("=")[1];
        artista = partes[1].split("=")[1];
        anoCriacao = Integer.parseInt(partes[2].split("=")[1]);
        tipoObra = partes[3].split("=")[1];
        localizacao = partes[4].split("=")[1];

    }

    public String exibirDados() {
        return "\nTítulo: " + titulo +
                "\nArtista: " + artista +
                "\nAno de criação: " + anoCriacao +
                "\nTipo de obra: " + tipoObra +
                "\nLocalização no museu: " + localizacao;
    }

}
