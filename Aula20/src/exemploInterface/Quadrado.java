package exemploInterface;

public class Quadrado implements Forma {

    private float lado;

    public Quadrado() {

    }

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String desenhar() {
        return "Desenhei um quadrado com " + lado + " de lado";
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

}
