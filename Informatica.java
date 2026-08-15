public class Informatica extends Loja{
    private double seguroEletronicos;

  public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos) {
        super (nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos=seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

      @Override
        public String toString (){
            return "Nome da loja: " +getNome()+ "\nQuantidade de funcionários: " +getQuantidadeFuncionarios()+ "\nSalário base dos funcionários: " +getSalarioBaseFuncionario()+ "\nEndereço da loja: " +getEndereco()+ "\nData de fundação: " +getDataFundacao()+
                    "\nProdutos da loja: " +getEstoqueProdutos()+ "\n Valor do seguro de eletrônicos: " +seguroEletronicos + "\n";
    }
}
