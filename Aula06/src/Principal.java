public class Principal {

    public static void main(String[] args) {

        // exPessoa();
        exPersonagem();

    }

    public static void exPessoa() {

        // Nova instância de Pessoa
        Pessoa p1 = new Pessoa();

        p1.nome = "Jason";
        p1.idade = 37;

        System.out.println("Pessoa p1:");
        System.out.println(p1.nome);
        System.out.println(p1.idade);

        // Nova instância de Pessoa, mas utilizando o
        // Construtor parametrizado
        Pessoa p2 = new Pessoa("Fulano", 45);

        System.out.println("\nPessoa p2:");
        System.out.println(p2.nome);
        System.out.println(p2.idade);

        // Nova instância de Pessoa
        Pessoa p3 = new Pessoa();

        // p3 aponta para o mesmo endereço de memória de p2:
        // (p2 e p3 são o MESMO objeto)
        p3 = p2;

        // Sendo o mesmo objeto, não importa se alterarmos
        // os nomes de ambos.
        p2.nome = "Cicrano";
        p3.nome = "Beltrano";

        // Na hora de exibir os nomes de p2 e p3, veremos que
        // ambos se chamam "Beltrano", pois foi a última
        // açteração feita para o nome de p3 (logo, p2 tbm)
        System.out.println("\nNome de p2: " + p2.nome);
        System.out.println("Nome de p3: " + p3.nome);

        // Nova instância de Pessoa, com os mesmos dados de p1:
        Pessoa p4 = new Pessoa(p1.nome, p1.idade);
        p4.idade = 27;

        System.out.println("\nPessoa p4:");
        System.out.println(p4.nome);
        System.out.println(p4.idade);

        // alterar nome de p4:
        p4.nome = "José";

        // comparando nomes de p1 e p4:
        System.out.println("\nNome de p1: " + p1.nome);
        System.out.println("Nome de p4: " + p4.nome);

    }

    public static void exPersonagem() {

        // Nova instância de personagem utilizando o construtor parametrizado
        Personagem p1 = new Personagem("Presto", "Mago", 85, 45);

        // apresentar personagem:
        p1.apresentar();

        // mostrar dados de p1:
        System.out.println("\nPersonagem 1:");
        p1.mostrarPersonagem();

        // Nova instância de personagem utilizando o construtor padrão
        Personagem p2 = new Personagem();
        p2.copiarPersonagem(p1);

        // alterar dados de p2
        p2.nome = "Hector";
        p2.classe = "Ranger";

        System.out.println("\nPersonagem 2:");
        p2.mostrarPersonagem();

        // nova instancia de Personagem
        Personagem p3 = new Personagem();
        System.out.println("\nCadastro do Personagem 3:");

        System.out.print("Nome: ");
        p3.nome = Console.lerString();

        System.out.print("Classe: ");
        p3.classe = Console.lerString();

        System.out.print("Pontos de Ataque: ");
        p3.atk = Console.letInt();

        System.out.print("Pontos de Defesa: ");
        p3.def = Console.letInt();

        System.out.println("\nPersonagem P3:");
        p3.mostrarPersonagem();

    }

}
