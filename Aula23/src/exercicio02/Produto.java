package exercicio02;

public abstract class Produto implements Estoque {

    protected int id;
    protected String nomeProduto;
    protected int qtde;

    public Produto(int id, String nomeProduto, int qtde) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.qtde = qtde;
    }

    @Override
    public void adicionarItem(int qtde) throws Exception {

        if (qtde <= 0) {

            throw new Exception("\nQuantidade deve ser maior que zero!");
        }

        this.qtde += qtde;

        System.out.println(qtde + " item(ns) adicionado(s) ao estoque de " + nomeProduto);

    }

    @Override
    public void removerItem(int qtde) throws Exception {

        if (qtde > this.qtde) {

            throw new Exception("\nQuantidade não pode ser maior que " + this.qtde);
        }

        this.qtde -= qtde;

        System.out.println(qtde + " item(ns) removido(s) do estoque de " + nomeProduto);

    }

    public abstract void exibirItem();

}
