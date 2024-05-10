public class App {
    public static void main(String[] args) throws Exception {

        // exemplo01();
        // exemplo02();
        exemplo03();

    }

    private static void exemplo01() {

        System.out.print("Informe um valor inteiro: ");
        int valor = Console.lerInt();

        System.out.print("Informe outro valor inteiro: ");
        int valor2 = Console.lerInt();

        try {
            int result = Calculadora.somarPositivos(valor, valor2);
            System.out.println("Soma dos valores inteiros: " + result);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("\nO programa foi finalziado...");
        }
    }

    private static void exemplo02() {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        try {
            p1.setNome("João");
            p2.setNome("Maria");

            System.out.println("Nome de p1: " + p1.getNome());
            System.out.println("Nome de p2: " + p2.getNome());

        } catch (NullPointerException e) {

            System.out.println("Não é possivel editar o nome de objetos nulos");
        }

    }

    private static void exemplo03() {

        Funcionario func = new Funcionario();

        System.out.println("Nome do funcionário: ");
        String nome = Console.lerString();
        func.setNome(nome);

        float valorHora = 0;
        float horasTrab = 0;

        while (true) {
            try {

                System.out.println("Valor da hra: R$ ");
                valorHora = Console.lerFloat();
                func.setValorHora(valorHora);

                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

        while (true) {

            try {

                System.out.println("Horas trabalhadas: ");
                horasTrab = Console.lerFloat();
                func.setHorasTrab(horasTrab);
                break;

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

        func.calcularSalario();

        System.out.println("O salário do funcionário " + func.getNome() +
                " é R$: " + func.getSalarioBruto());

    }

}
