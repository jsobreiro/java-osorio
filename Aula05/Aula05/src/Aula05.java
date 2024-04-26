public class Aula05 {

    public static void main(String[] args) {

        // Declaração de novo objeto do tipo Aluno
        Aluno a1 = new Aluno();
        // armazenar dados no a1
        a1.nome = "Jason Sobreiro";
        a1.curso = "ADS";
        a1.turno = "Manhã";
        a1.campus = "Osório";

        System.out.println("Dados do Aluno A1:");
        System.out.println("Nome: " + a1.nome + "\n" +
                "Curso: " + a1.curso + "\n" +
                "Turno: " + a1.turno + "\n" +
                "Campus: " + a1.campus);

        // Criar segundo aluno
        Aluno a2 = new Aluno();

        System.out.println("\nCadastro do Aluno A2:");

        System.out.print("Informe o nome do aluno: ");
        a2.nome = Console.lerString();
        System.out.print("Curso: ");
        a2.curso = Console.lerString();
        System.out.print("Turno: ");
        a2.turno = Console.lerString();
        System.out.print("Campus: ");
        a2.campus = Console.lerString();

        System.out.println("\nDados do Aluno A2:");
        System.out.println(a2.toString());

        // Instanciando aluno a3
        Aluno a3 = new Aluno("Fulano", "ADS", "Noite", "Osório");
        System.out.println("\nDados do Aluno A3:");
        System.out.println(a3.toString());
    }

}
