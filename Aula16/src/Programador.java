public class Programador extends Funcionario {

    private String linguagens;

    public Programador() {
    }

    public Programador(int matricula, String nome, String linguagens) {
        super(matricula, nome);
        this.linguagens = linguagens;
    }

    public String getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String linguagens) {
        this.linguagens = linguagens;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nLinguagens que domina: " + linguagens;
    }

}
