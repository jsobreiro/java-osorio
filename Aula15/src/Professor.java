public class Professor extends Pessoa {

    private String matricula;

    public Professor() {

    }

    public Professor(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String txt = super.toString() +
                "\nMatrícula: " + matricula;
        return txt;
    }

}
