public class Contato {

    // Atributos
    private String nome;
    private String telefone;

    // Construtores
    // Padrão:
    public Contato() {
    }

    // Parametrizado
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {

        String txt = "Nome: " + nome + " (" + telefone + ")";

        return txt;
    }

}
