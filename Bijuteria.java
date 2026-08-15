public class Bijuteria extends Loja {
  private double metaVendas;

  public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.metaVendas = metaVendas;
  }

  public double getMetaVendas() {
    return metaVendas;
  }

  public void setMetaVendas(double metaVendas) {
    this.metaVendas = metaVendas;
  }

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
        + "\n Meta de vendas: "
        + metaVendas
        + "\n";
  }
}
