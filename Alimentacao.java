public class Alimentacao extends Loja {
  private Data dataAlvara;

  public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara) {
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.dataAlvara = dataAlvara;
  }

  public Data getDataAlvara() {
    return dataAlvara;
  }

  public void setDataAlvara(Data dataAlvara) {
    this.dataAlvara = dataAlvara;
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
        + "\n Data do alvará: "
        + dataAlvara
        + "\n";
  }
}
