public class Personagem {

    // Atributos
    String nome;
    String classe;
    int atk;
    int def;

    // Construtores
    public Personagem() {
    }

    public Personagem(String nome, String classe, int atk, int def) {
        // "this." faz referência ao atributo.
        // É importante para que o programa consiga diferenciar variável de
        // atributo.
        this.nome = nome;
        this.classe = classe;
        this.atk = atk;
        this.def = def;
    }

    // Métodos próprios
    public void copiarPersonagem(Personagem p) {
        this.nome = p.nome;
        this.classe = p.classe;
        this.atk = p.atk;
        this.def = p.def;
    }

    public void mostrarPersonagem() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Ataque: " + this.atk);
        System.out.println("Defesa: " + this.def);
    }

    public void apresentar() {
        System.out.println("Meu nome é " + nome);
    }

}
