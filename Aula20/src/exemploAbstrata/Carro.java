package exemploAbstrata;

public class Carro extends Veiculo {

    public Carro() {

    }

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public String acelerar() {
        return "Carro acelerou! Vruummmm!";
    }

    @Override
    public String parar() {
        return "Carro parou";
    }

    @Override
    public String toString() {

        return getClass() +
                super.toString();
    }

}
