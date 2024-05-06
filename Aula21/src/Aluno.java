public class Aluno extends Pessoa {

    private int periodoAtual;
    private String turno;

    public Aluno() {

    }

    public Aluno(String nome, String email, int periodoAtual, String turno) {
        super(nome, email);
        this.periodoAtual = periodoAtual;
        this.turno = turno;
    }

    public int getPeriodoAtual() {
        return periodoAtual;
    }

    public void setPeriodoAtual(int periodoAtual) {
        this.periodoAtual = periodoAtual;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nPeríodo atual: " + periodoAtual +
                "\nTurno em que estuda: " + turno;
    }

}
