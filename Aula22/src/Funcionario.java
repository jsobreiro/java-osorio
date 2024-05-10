public class Funcionario extends Pessoa {

    private float valorHora;
    private float horasTrab;
    private float salarioBruto;

    public void setValorHora(float valorHora) throws Exception {

        if (valorHora <= 0) {

            throw new Exception("Valor da hora deve ser maior que zero!");
        }

        this.valorHora = valorHora;
    }

    public void setHorasTrab(float horasTrab) throws Exception {

        if (horasTrab <= 0) {

            throw new Exception("Horas trabalhadas devem ser maiores que zero!");
        }

        this.horasTrab = horasTrab;
    }

    public void calcularSalario() {
        salarioBruto = valorHora * horasTrab;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

}
