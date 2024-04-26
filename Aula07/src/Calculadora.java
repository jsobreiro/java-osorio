public class Calculadora {

    public Calculadora() {

    }

    public float somar(float n1, float n2) {
        return n1 + n2;
    }

    public float diminuir(float n1, float n2) {
        return n1 - n2;
    }

    public float multiplicar(float n1, float n2) {
        return n1 * n2;
    }

    public float dividir(float n1, float n2) {
        if (n2 == 0) {
            return n1;
        }

        return n1 / n2;
    }

}
