import java.util.ArrayList;

import exemploAbstrata.Carro;
import exemploAbstrata.Moto;
import exemploAbstrata.Veiculo;
import exemploInterface.Circulo;
import exemploInterface.Forma;
import exemploInterface.Quadrado;
import exemploInterface.Retangulo;

public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro("ABC-1234");
        Moto minhaMoto = new Moto("BAV-4321");

        System.out.println(meuCarro.acelerar());
        System.out.println(minhaMoto.acelerar());

        System.out.println("\n------------------\n");

        Quadrado meuQuadrado = new Quadrado(3.5f);
        Circulo meuCirculo = new Circulo(1.7f);
        Retangulo meuRetangulo = new Retangulo(3, 4.2f);
        // não é possível: Forma formaGenerica = new Forma();
        // pois "Forma" é uma interface, logo, naturalmente abstrata
        // mas é possivel: Forma circulo = new Circulo();
        // pois a classe Circulo implementa a interface "Forma"

        System.out.println("Área do quadrado: " + meuQuadrado.calcularArea());
        System.out.println("Área do círculo: " + meuCirculo.calcularArea());
        System.out.println("Área do retângulo: " + meuRetangulo.calcularArea());

        ArrayList<Forma> listaformas = new ArrayList<>();
        listaformas.add(meuCirculo);
        listaformas.add(meuQuadrado);
        listaformas.add(meuRetangulo);

        System.out.println("\nDesenhando formas:");
        for (Forma tempForma : listaformas) {
            System.out.println(tempForma.desenhar());
        }

    }

}
