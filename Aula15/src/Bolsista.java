public class Bolsista extends Aluno {

    private String tipoDeBolsa;

    public Bolsista() {

    }

    public Bolsista(String nome, String email, String rgm, String tipoDeBolsa) {
        super(nome, email, rgm);
        this.tipoDeBolsa = tipoDeBolsa;
    }

    public String getTipoDeBolsa() {
        return tipoDeBolsa;
    }

    public void setTipoDeBolsa(String tipoDeBolsa) {
        this.tipoDeBolsa = tipoDeBolsa;
    }

    @Override
    public String toString() {

        String txt = super.toString() +
                "\nTipo de bolsa: " + tipoDeBolsa;

        return txt;
    }

}
