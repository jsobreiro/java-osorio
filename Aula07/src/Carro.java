public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private float velocidadeAtual;

    public Carro() {
        marca = "Volkswagen";
        modelo = "Fusca";
        ano = 1966;
        velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {

        if (velocidadeAtual == 80) {
            System.out.println(marca + " " +
                    modelo + " está na velocidade máxima!");
            return;
        }

        velocidadeAtual += 10;
        System.out.println(marca + " " +
                modelo + " está andando a " +
                velocidadeAtual + "Km/h");

    }

    public void frear() {

        if (velocidadeAtual == 0) {
            System.out.println(marca + " " +
                    modelo + " está parado!");
            return;
        }

        velocidadeAtual -= 10;
        System.out.println(marca + " " +
                modelo + " diminui sua velocidade para " +
                velocidadeAtual + "Km/h");
    }

}
