
public class Principal {

    public static void main(String[] args) {

        // ex01();
        // ex02();
        // ex03();
        // ex04();
        ex05();
    }

    public static void ex01() {

        /*
         * Imagine uma pequena biblioteca pessoal, uma coleção que você começou
         * a construir com seus livros favoritos. No entanto, com o tempo e o
         * acúmulo de mais e mais livros, você percebe a necessidade de
         * organizar e acessar rapidamente as informações de cada um deles.
         */

        // resolução
        Livro l1 = new Livro();
        l1.titulo = "Livro 01";
        l1.autor = "Ze Jao";
        l1.ano = 2020;

        Livro l2 = new Livro("Livro 02", "Jao Ze", 2021);

        l1.exibirInfo();
        l2.exibirInfo();

    }

    public static void ex02() {

        Calculadora calc = new Calculadora();
        float n1;
        float n2;
        float result;

        System.out.println("Informe dois valores reais:");
        System.out.print("N1: ");
        n1 = Console.lerFloat();

        System.out.print("N2: ");
        n2 = Console.lerFloat();

        System.out.println("Resultados:");
        result = calc.somar(n1, n2);
        System.out.println("Soma: " + result);

        result = calc.diminuir(n1, n2);
        System.out.println("Subtração: " + result);

        result = calc.multiplicar(n1, n2);
        System.out.println("Multiplicação: " + result);

        result = calc.dividir(n1, n2);
        System.out.println("Divisão: " + result);

    }

    public static void ex03() {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1234);
        conta.setTitularConta("Fulano da Silva");
        conta.setSaldo(2500.45f);

        ContaBancaria conta2 = new ContaBancaria(1235,
                "Maria Silva", 3687.56f);

        // alterar titular da conta2:
        conta2.setTitularConta("Maria Souza");

        // mostrar dados da conta:
        System.out.println("Conta Nº: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitularConta());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        // mostrar dados da conta2:
        conta2.exbirDadosConta();

        // operações com as contas:
        // depositar e sacar valores na conta:
        conta.depositar(1750);
        conta.sacar(1923.40f);

        // sacar e depositar valores na conta2:
        conta2.sacar(3000);
        conta2.depositar(450);

    }

    public static void ex04() {

        Jogador player1 = new Jogador("Fulano", 100, 1);
        Jogador player2 = new Jogador("Beltrano", 200, 2);

        player1.exibirStatusJogador();
        player2.exibirStatusJogador();

        player1.aumentarPontuacao(100);
        player1.subirNivel();
        player1.aumentarPontuacao(50);

        player2.aumentarPontuacao(300);
        player2.subirNivel();
        player2.subirNivel();

    }

    public static void ex05() {

        Carro c1 = new Carro();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

    }

}