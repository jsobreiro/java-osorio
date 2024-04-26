import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula) {

        // percorrer a lista de funcionarios
        for (Funcionario temp : listaFuncionarios) {

            // verificar se a matricula recebida como paramento é igual
            // a matricula do funcionario atual (temp)
            if (temp.getMatricula() == matricula) {

                // se for verdade, retornamos o funcionario atual (temp)
                return temp;
            }

        }
        // se sair do laço, significa que não há funcionário com a matricula
        // igual ao valor do paramentro "matricula" recebido no método
        return null; // entao retornamos "nulo"

    }

    public static void excluir(Funcionario f) {
        listaFuncionarios.remove(f);
    }

}
