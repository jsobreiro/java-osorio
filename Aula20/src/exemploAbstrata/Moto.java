package exemploAbstrata;

public class Moto extends Veiculo {

    public Moto() {

    }

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public String acelerar() {
        return "Moto acelerou! Ran-dandan!";
    }

    @Override
    public String parar() {
        return "Moto parou!";
    }

    @Override
    public String toString() {

        return getClass() +
                super.toString();
    }

}
