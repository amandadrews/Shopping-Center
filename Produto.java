public class Produto {
  private String nome;
  private double preco;
  private Data dataValidade;

  public Produto(String nome, double preco, Data dataValidade) {
    this.nome = nome;
    this.preco = preco;
    this.dataValidade = dataValidade;
  }

  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  // get e set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Data getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
  }

  public boolean estaVencido(Data hoje) {

    if (dataValidade == null) {
      return false;
    }
    
    if (dataValidade.getAno() < hoje.getAno()) {
      return true;
    }

    if (dataValidade.getAno() == hoje.getAno() && dataValidade.getMes() < hoje.getMes()) {
      return true;
    }

    if (dataValidade.getAno() == hoje.getAno()
        && dataValidade.getMes() == hoje.getMes()
        && dataValidade.getDia() < hoje.getDia()) {
      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "Nome do produto: "
        + nome
        + " | Preço R$: "
        + preco
        + " | Data de validade: "
        + dataValidade;
  }
}
