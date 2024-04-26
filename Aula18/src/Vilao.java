public class Vilao extends Personagem {

    private int nivel;

    public Vilao() {

    }

    public Vilao(String nome, int ptsVida, int nivel) {
        super(nome, ptsVida);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {

        return super.toString() + "Nível: " + nivel;
    }

}
