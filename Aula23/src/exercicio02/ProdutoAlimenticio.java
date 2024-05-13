package exercicio02;

public class ProdutoAlimenticio extends Produto {

    private String dataExpiracao;

    public ProdutoAlimenticio(int id, String nomeProduto, int qtde, String dataExpiracao) {
        super(id, nomeProduto, qtde);
        this.dataExpiracao = dataExpiracao;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    @Override
    public void exibirItem() {

        System.out.println("\nId do produto: " + id);
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Data de expiração: " + dataExpiracao);
        System.out.println("Quantidade em estoque: " + qtde);

    }

}
