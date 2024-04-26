public class Jogador {

    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador() {

    }

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void exibirStatusJogador() {
        System.out.println("\nJogador: " + nome);
        System.out.println("Pontuação atual: " + pontuacao);
        System.out.println("Nível atual: " + nivel + "\n");
    }

    public void aumentarPontuacao(int valor) {
        System.out.println("Pontos adicionados: " + valor + " para " + nome);
        pontuacao += valor;
        exibirStatusJogador();
    }

    public void subirNivel() {
        System.out.println(nome + " subiu de nível!");
        nivel++;
        exibirStatusJogador();
    }

}
