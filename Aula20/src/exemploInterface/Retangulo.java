package exemploInterface;

public class Retangulo implements Forma {

    private float base;
    private float altura;

    public Retangulo() {

    }

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String desenhar() {
        return "Desenhei um retângulo com " +
                base + " de base por " + altura + " de altura";
    }

    @Override
    public float calcularArea() {

        return base * altura;
    }

}
