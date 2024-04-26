public class Aluno {
    // atributos de aluno
    String nome;
    String curso;
    String turno;
    String campus;

    // construtores
    public Aluno() {
        nome = "Fulano";
    }

    public Aluno(String nome, String curso, String turno, String campus) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.campus = campus;
    }

    @Override
    public String toString() {
        String txt = "Nome: " + nome + "\n" +
                "Curso: " + curso + "\n" +
                "Turno: " + turno + "\n" +
                "Campus: " + campus;
        return txt;
    }

}
