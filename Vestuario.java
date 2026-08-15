public class Vestuario extends Loja {

  private boolean produtosImportados;

  public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.produtosImportados = produtosImportados;
  }

  public boolean getProdutosImportados() {
    return produtosImportados;
  }

  public void setProdutosImportados(boolean produtosImportados) {
    this.produtosImportados = produtosImportados;
  }

  @Override
  public String toString() {
    return "Nome da loja: "
        + getNome()
        + "\nQuantidade de funcionários: "
        + getQuantidadeFuncionarios()
        + "\nSalário base dos funcionários: "
        + getSalarioBaseFuncionario()
        + "\nEndereço da loja: "
        + getEndereco()
        + "\nData de fundação: "
        + getDataFundacao()
        + "\nProdutos da loja: "
        + getEstoqueProdutos()
        + "\n Vende produtos importados: "
        + (produtosImportados ? "sim" : "não")
        + "\n";
  }
}
