public class Cosmetico extends Loja {
  private double taxaComercializacao;

  public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.taxaComercializacao = taxaComercializacao;
  }

  public double getTaxaComercializacao() {
    return taxaComercializacao;
  }

  public void setTaxaComercializacao(double taxaComercializacao) {
    this.taxaComercializacao = taxaComercializacao;
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
        + "\n Taxa de comercialização: "
        + taxaComercializacao
        + "\n";
  }
}
