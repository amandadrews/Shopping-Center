import java.util.ArrayList;

public class Loja {
  private String nome;
  private int quantidadeFuncionarios;
  private double salarioBaseFuncionario;
  private Endereco endereco;
  private Data dataFundacao;
  private ArrayList<Produto> estoqueProdutos = new ArrayList<>();

  public Loja(String nome, int quantidadeFuncionarios) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
  }

  public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(
      String nome,
      int quantidadeFuncionarios,
      Endereco endereco,
      Data dataFundacao,
      int maxProdutos) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  public Loja(
      String nome,
      int quantidadeFuncionarios,
      double salarioBaseFuncionario,
      Endereco endereco,
      Data dataFundacao,
      int maxProdutos) {
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    this.endereco = endereco;
    this.dataFundacao = dataFundacao;
  }

  // get e set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadeFuncionarios() {
    return quantidadeFuncionarios;
  }

  public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public double getSalarioBaseFuncionario() {
    return salarioBaseFuncionario;
  }

  public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
    this.salarioBaseFuncionario = salarioBaseFuncionario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Data getDataFundacao() {
    return dataFundacao;
  }

  public void setDataFundacao(Data dataFundacao) {
    this.dataFundacao = dataFundacao;
  }

  public ArrayList<Produto> getEstoqueProdutos() {
    return estoqueProdutos;
  }

  public void setEstoqueProdutos(ArrayList<Produto> estoqueProdutos) {
    this.estoqueProdutos = estoqueProdutos;
  }

  public double gastosComSalario() {
    if (salarioBaseFuncionario == -1) {
      System.out.print("ERRO! Não é possivel realizar o cálculo com salário negativo.");
      return -1;
    } else {
      double calculoSalario = quantidadeFuncionarios * salarioBaseFuncionario;
      return calculoSalario;
    }
  }

  public char tamanhoDaLoja() {
    if (quantidadeFuncionarios < 10) {
      return 'P';
    } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
      return 'M';
    } else {
      return 'G';
    }
  }

  public void imprimeProdutos() {
    for (int i = 0; i < estoqueProdutos.size(); i++) {
      System.out.println(estoqueProdutos.get(i));
    }
  }

  public boolean insereProduto(Produto produto) {
    boolean adicionou = estoqueProdutos.add(produto);

    if (adicionou) {
      System.out.println("Produto adicionado com sucesso!");
    }
    return adicionou;
  }

  public boolean removeProduto(String nome) {
    for (int i = 0; i < estoqueProdutos.size(); i++) {
      if (estoqueProdutos.get(i).getNome().equalsIgnoreCase(nome)) {
        estoqueProdutos.remove(i);
        System.out.println("Produto removido!");
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Nome da loja: "
        + nome
        + "\nQuantidade de funcionários: "
        + quantidadeFuncionarios
        + "\nSalário base dos funcionários: "
        + salarioBaseFuncionario
        + "\nEndereço da loja: "
        + endereco
        + "\nData de fundação: "
        + dataFundacao
        + "\nProdutos da loja: "
        + estoqueProdutos
        + "\n";
  }
}
