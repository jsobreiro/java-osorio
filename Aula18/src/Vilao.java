public class Vilao extends Personagem {

    private int nivel;

    public Vilao() {
        setNome("Slime");
        setPtsVida(1);
        nivel = 1;
    }

    public Vilao(String nome, int ptsVida, int nivel) {
        super(nome, ptsVida);
        this.nivel = nivel;
        setPtsVida(ptsVida * nivel);
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {

        return super.toString() + "\nNível: " + nivel;
    }

}
