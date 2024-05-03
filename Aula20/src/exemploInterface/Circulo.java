package exemploInterface;

public class Circulo implements Forma {

    private float raio;

    public Circulo() {

    }

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenhei um círculo com " + raio + " de raio!";
    }

    @Override
    public float calcularArea() {

        return 3.14f * (raio * raio);
    }

}
