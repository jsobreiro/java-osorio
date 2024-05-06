public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor("Jason Sobreiro",
                "jasobreiro@up.edu.br",
                "Desenvolvimento de Software");

        Aluno aluno1 = new Aluno("Fulano Silva",
                "fulano@silva.com",
                1,
                "Manhã");

        // Chamada do método abstrato "falar"
        // implementado pelas subclasses:
        System.out.println(professor.falar());
        System.out.println(aluno1.falar());

        // Chamada do método "estudar" da interface "Acoes"
        // implementado pelas subclasses:
        System.out.println(professor.estudar());
        System.out.println(aluno1.estudar());

        // concurseiro:
        Concurseiro concurseiro = new Concurseiro();
        System.out.println(concurseiro.estudar());

    }
}
