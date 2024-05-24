public class Relogio {

    private int codigo;
    private String marca;
    private String nome;
    private String tipo;

    public Relogio() {
    }

    public Relogio(int codigo, String marca, String nome, String tipo) {
        this.codigo = codigo;
        this.marca = marca;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override // servirá principalmente para gravar dados no arquivo
    public String toString() {
        return "Código=" + codigo +
                ", Marca=" + marca +
                ", Nome=" + nome +
                ", Tipo=" + tipo;
    }

    // Basicamente um toString "reformulado".
    // Será usado para mostrar dados do relógio em várias linhas
    public String exibirDados() {
        return "Código: " + codigo + "\n" +
                "Marca: " + marca + "\n" +
                "Nome: " + nome + "\n" +
                "Tipo de display: " + tipo;
    }

    public void fromString(String linha) {

        String[] partes = linha.split(", ");

        codigo = Integer.parseInt(partes[0].split("=")[1]);
        marca = partes[1].split("=")[1];
        nome = partes[2].split("=")[1];
        tipo = partes[3].split("=")[1];

    }

}
