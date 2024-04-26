import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {

    private static List<Carro> listaCarros = new ArrayList<>();

    public static void estacionarCarro(Carro carro) {
        listaCarros.add(carro);
        System.out.println("Carro " + carro.getModelo() + "( " +
                carro.getPlaca() + ") está estacionado");
    }

    public static void mostrarCarrosEstacionados() {

        if (listaCarros.size() == 0) {
            System.out.println("\nNão há carros estacionados");
            return;
        }

        System.out.println("\nCarros Estacionados:");

        for (Carro carroTemp : listaCarros) {

            carroTemp.mostrarDadosCarro();

        }

    }

    public static void liberarCarro(String placa) {

        for (Carro tempCarro : listaCarros) {

            if (tempCarro.getPlaca().equals(placa)) {

                listaCarros.remove(tempCarro);
                System.out.println("\nCarro " + tempCarro.getModelo() +
                        " (" + tempCarro.getPlaca() + ") foi liberado");
                return;
            }
        }

        System.out.println("\nO carro com a placa " + placa +
                " não se encontra neste estacionamento");

    }

}
