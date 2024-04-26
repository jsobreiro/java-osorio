public class Principal {

    public static void main(String[] args) {

        Heroi heroi1 = new Heroi("Josepher, o Grande",
                30, "Barbaro");

        Vilao vilao1 = new Vilao();
        Vilao vilao2 = new Vilao("Skull",
                20, 2);

        System.out.println("Herói 1:\n" + heroi1);
        System.out.println("\nVilão1 :\n" + vilao1);
        System.out.println("\nVilão2 :\n" + vilao2);

        /*
         * TODO:
         * Apagar as linhas acima de teste
         * Criar uma classe para cadastro de personagens (tanto heroi, quanto vilao)
         * Esta classe deverá conter um arraylist estático para armazenar objetos do
         * tipo Personagem.
         * Criar método para cadastrar personagem e, por enquanto, listar todos os
         * personagens.
         * Criar uma classe Sistema, com métodos para: exibir menu, veririficar opçoes e
         * executar o sistema.
         * Chamar o método executar, da classe Sistema, dentro do método main, desta
         * classe
         * Principal.
         * Use a aula 16 como base para resolução desta atividade
         */

    }

}
