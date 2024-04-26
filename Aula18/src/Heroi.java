public class Heroi extends Personagem {

    private String classe;

    public Heroi() {

    }

    public Heroi(String nome, int ptsVida, String classe) {
        super(nome, ptsVida);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {

        return super.toString() + "\nClasse: " + classe;
    }

}
