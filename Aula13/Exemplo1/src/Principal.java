public class Principal {

    public static void main(String[] args) {

        Jogo j1 = new Jogo("The Last of US", "PS3");
        Jogo j2 = new Jogo("Chrono Trigger", "SNES");
        Jogo j3 = new Jogo("Mario 64", "Nintendo 64");
        Jogo j4 = new Jogo("Metal Gear: Solid", "PS1");

        Jogo j5 = new Jogo();
        j5.mostrarDadosJogo();

        j5.setTitulo("Teste");

        ListaJogos lista1 = new ListaJogos("Jason");
        lista1.adicionarJogo(j1);
        lista1.adicionarJogo(j2);
        lista1.adicionarJogo(j4);

        ListaJogos lista2 = new ListaJogos("Lucca");
        lista2.adicionarJogo(j4);
        lista2.adicionarJogo(j3);

        lista1.mostrarTodosOsJogos();
        lista2.mostrarTodosOsJogos();

    }

}