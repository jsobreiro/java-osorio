import exemploAbstrata.Carro;
import exemploAbstrata.Moto;

public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("ABC-1234");
        Moto minhaMoto = new Moto("BAV-4321");

        System.out.println(meuCarro.acelerar());
        System.out.println(minhaMoto.acelerar());
    }

}
