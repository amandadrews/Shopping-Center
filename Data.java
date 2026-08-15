public class Data {
  private int dia;
  private int mes;
  private int ano;

  public Data(int dia, int mes, int ano) {

    boolean valida = true;

    if (mes < 1 || mes > 12) {
      valida = false;
    } else {
      int maxDias;

      switch (mes) {
        case 2:
          if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            maxDias = 29;
          } else {
            maxDias = 28;
          }
          break;

        case 4:
        case 6:
        case 9:
        case 11:
          maxDias = 30;
          break;

        default:
          maxDias = 31;
      }

      if (dia < 1 || dia > maxDias) {
        valida = false;
      }

      if (valida) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
      } else {
        System.out.print("Data inválida! Reprogramando para 01/01/2000.");
        this.dia = 1;
        this.mes = 1;
        this.ano = 2000;
      }
    }
    }


  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public boolean verificaAnoBissexto() {
    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
      System.out.println("O ano é bissexto");
      return true;
    } else {
      System.out.println("O ano não é bissexto");
      return false;
    }
  } // verifica se o ano é bissexto

  @Override
  public String toString() {
    return "Dia: " + dia + " | Mês: " + mes + " | Ano: " + ano;
  }
}
