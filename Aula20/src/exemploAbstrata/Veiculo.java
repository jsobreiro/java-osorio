package exemploAbstrata;

public abstract class Veiculo {

    private String placa;

    public Veiculo() {

    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {

        return "\nPlaca: " + placa;
    }

    // Método abstrato: escrevemos apenas sua assinatura
    public abstract String acelerar();

    public abstract String parar();

}
