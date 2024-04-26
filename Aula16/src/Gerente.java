public class Gerente extends Funcionario {

    private String nomeDoProjeto;

    public Gerente() {
    }

    public Gerente(int matricula, String nome, String nomeDoProjeto) {
        super(matricula, nome);
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nNome do projeto: " + nomeDoProjeto;
    }

}
