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

        // Pessoa pode ser um Aluno:
        Pessoa p1 = new Aluno();
        // Pessoa pode ser um Professor:
        Pessoa p2 = new Professor();
        // Pessoa pode ser nulo:
        Pessoa p3 = null;
        // Mas não é possível instanciar um objeto do tipo Pessoa:
        // Pessoa p4 = new Pessoa();

    }
}
