public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Fulano", "fulano@gmail.com");

        System.out.println();
        System.out.println(p1.toString());

        Aluno a1 = new Aluno("Cicrano",
                "cicrano@gmail.com",
                "12345678");

        System.out.println(a1.toString());

        p1.setNome("Beltrano");
        a1.setNome("Citriano");

        a1.setRgm("87654321");
        // Pessoa não possui rgm. Logo, a linha abaixo não pode
        // ser executada:
        // p1.seRgm("87654321");

        Professor pr1 = new Professor("Jason",
                "jasobreiro@up.edu.br",
                "996655");

        System.out.println(pr1.toString());

        Bolsista b1 = new Bolsista("Zezinho",
                "ze@zinho.com",
                "98746512",
                "Integral");

        System.out.println(b1.toString());

    }

}
