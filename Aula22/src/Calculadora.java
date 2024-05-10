public class Calculadora {

    public static int somarPositivos(int n1, int n2) throws Exception {

        // Regra para lançar a exceção:
        if (n1 < 0 || n2 < 0) {

            // se a condição for verdadeira, a exceção abaixo será lançada
            // contendo a mensagem personalizada dentro dos parênteses:
            throw new Exception("Os valores DEVEM ser positivos!");
            // IMPORTANTE: Quando uma exceção é lançada, o método é encerrado
        }

        // Se nenhuma exceção foi lançada, retornamos a soma dos valores
        return n1 + n2;

    }

}
