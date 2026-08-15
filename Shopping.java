import java.util.ArrayList;

public class Shopping {

  private String nome;
  private Endereco endereco;
  private Loja[] lojas;

  public Shopping(String nome, Endereco endereco, int maxLojas) {
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja[maxLojas];
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Loja[] getLojas() {
    return lojas;
  }

  public void setLojas(Loja[] lojas) {
    this.lojas = lojas;
  }

  public boolean insereLoja(Loja loja) {
    for (int i = 0; i < lojas.length; i++) {
      if (lojas[i] == null) {
        lojas[i] = loja;
        System.out.println();
        System.out.print("Loja adicionada com sucesso!");
        System.out.println();

        return true;
      }
    }
    System.out.print("Erro! Não é possível adicionar a loja. Número de lojas excedido.");
    return false;
  }

  public boolean removeLoja(String nome) {
    for (int i = 0; i < lojas.length; i++) {
      if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
        lojas[i] = null;
        System.out.println();
        System.out.println("Loja removida!");
        System.out.println();
        return true;
      }
    }
    return false;
  }

  public Loja buscarLoja(String nome) {
    for (Loja l : lojas)
      if (l != null && l.getNome().equalsIgnoreCase(nome)) {
        return l;
      }
    return null;
  }

  public int quantidadeLojasPorTipo(String tipoLoja) {

    if (!tipoLoja.equalsIgnoreCase("Cosmetico") && !tipoLoja.equalsIgnoreCase("Cosmético")
            && !tipoLoja.equalsIgnoreCase("Vestuario") && !tipoLoja.equalsIgnoreCase("Vestuário")
            && !tipoLoja.equalsIgnoreCase("Bijuteria")
            && !tipoLoja.equalsIgnoreCase("Alimentacao") && !tipoLoja.equalsIgnoreCase("Alimentação") && !tipoLoja.equalsIgnoreCase("Alimentaçao")
            && !tipoLoja.equalsIgnoreCase("Informatica") && !tipoLoja.equalsIgnoreCase("Informática")) {
      return -1;
    }

    int contador = 0;

    for (Loja loja : lojas) {
      if (loja != null) {
        if ((tipoLoja.equalsIgnoreCase("Cosmetico") || tipoLoja.equalsIgnoreCase("Cosmético")) && loja instanceof Cosmetico) {
          contador++;
        } else if ((tipoLoja.equalsIgnoreCase("Vestuario") || tipoLoja.equalsIgnoreCase("Vestuário")) && loja instanceof Vestuario) {
          contador++;
        } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
          contador++;
        } else if ((tipoLoja.equalsIgnoreCase("Alimentacao") || tipoLoja.equalsIgnoreCase("Alimentação")) && loja instanceof Alimentacao) {
          contador++;
        } else if ((tipoLoja.equalsIgnoreCase("Informatica") || tipoLoja.equalsIgnoreCase("Informática")) && loja instanceof Informatica) {
          contador++;
        }
      }
    }

    return contador;
  }

  public Informatica lojaSeguroMaisCaro() {
    Informatica maior = null;
    double maiorSeguro = -1;

    for (Loja loja : lojas) {
      if (loja instanceof Informatica) {
        Informatica i = (Informatica) loja;

        if (i.getSeguroEletronicos() > maiorSeguro) {
          maiorSeguro = i.getSeguroEletronicos();
          maior = i;
        }
      }
    }
    return maior;
  }
}
