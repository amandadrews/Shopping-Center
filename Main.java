import java.util.Scanner;
import java.util.ArrayList;

public static void main() {
  Data hoje = new Data(20, 10, 2023);

  Scanner teclado = new Scanner(System.in);
  int opcao;

  System.out.print("Digite o nome do shopping: ");
  String nome = teclado.nextLine();
  System.out.println("-Preencha com o endereço do shopping- ");
  System.out.print("Rua: ");
  String nomeDaRua = teclado.nextLine();
  System.out.print("Número: ");
  String numero = teclado.nextLine();
  System.out.print("Cidade: ");
  String cidade = teclado.nextLine();
  System.out.print("Estado: ");
  String estado = teclado.nextLine();
  System.out.print("Pais: ");
  String pais = teclado.nextLine();
  System.out.print("CEP: ");
  String cep = teclado.nextLine();
  System.out.print("Complemento: ");
  String complemento = teclado.nextLine();

  Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
  Shopping shopping = new Shopping(nome, endereco, 19);

  do {
    System.out.println();
    System.out.println(" -- SELECIONE --");
    System.out.println(
        " 1- Criar uma loja"
            + "\n 2- Criar um produto"
            + "\n 3- Remover uma loja"
            + "\n 4- Remover um produto"
            + "\n 5- Exibir informações sobre o shopping"
            + "\n 6- Exibir informações sobre lojas"
            + "\n 7- Exibir informações sobre produtos"
            + "\n 8- SAIR");

    System.out.println();
    System.out.print("Digite a opção desejada: ");
    opcao = teclado.nextInt();
    System.out.println();

    if (opcao < 1 || opcao > 8) {
      System.out.print("-ERRO!-" + "\nOpção inválida!");
      System.out.println();
    }

    switch (opcao) {
      case 1: // criar loja
        teclado.nextLine();

        System.out.print(
            "Selecione o TIPO de loja a ser criada (Cosmético, Vestuário, Bijuteria, Alimentação ou Informática): ");
        String tipoLoja = teclado.nextLine();

        if (tipoLoja.equalsIgnoreCase("Cosmético") || tipoLoja.equalsIgnoreCase("Cosmetico")) {
          System.out.println("Tipo de loja selecionado: Cosmético");
          System.out.print("\nDigite o nome da loja a ser criada: ");
          String nomeDaLoja = teclado.nextLine();

          System.out.print("Digite a quantidade de funcionários que a loja possui: ");
          int quantidadeDeFuncionarios = teclado.nextInt();

          System.out.print("Digite o salário base dos funcionários: ");
          double salarioBaseFuncionario = teclado.nextDouble();

          teclado.nextLine();

          System.out.print("Digite o endereço da loja: ");
          String enderecoLoja = teclado.nextLine();

          System.out.println("-Preencha a data de fundação da loja-");
          System.out.print("Dia: ");
          int diaFundacao = teclado.nextInt();
          System.out.print("Mês: ");
          int mesFundacao = teclado.nextInt();
          System.out.print("Ano: ");
          int anoFundacao = teclado.nextInt();

          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          System.out.print("Digite a taxa de comercialização: ");
          double taxaComercializacao = teclado.nextDouble();

          Loja novaLoja =
              new Cosmetico(
                  nomeDaLoja,
                  quantidadeDeFuncionarios,
                  salarioBaseFuncionario,
                  endereco,
                  dataFundacao,
                  taxaComercializacao);
          shopping.insereLoja(novaLoja);

        } else if (tipoLoja.equalsIgnoreCase("Vestuario")
            || tipoLoja.equalsIgnoreCase("Vestuário")) {
          System.out.println("Tipo de loja selecionado: Vestuário");
          System.out.print("\nDigite o nome da loja a ser criada: ");
          String nomeDaLoja = teclado.nextLine();

          System.out.print("Digite a quantidade de funcionários que a loja possui: ");
          int quantidadeDeFuncionarios = teclado.nextInt();

          System.out.print("Digite o salário base dos funcionários: ");
          double salarioBaseFuncionario = teclado.nextDouble();

          teclado.nextLine();

          System.out.print("Digite o endereço da loja: ");
          String enderecoLoja = teclado.nextLine();

          System.out.println("-Preencha a data de fundação da loja-");
          System.out.print("Dia: ");
          int diaFundacao = teclado.nextInt();
          System.out.print("Mês: ");
          int mesFundacao = teclado.nextInt();
          System.out.print("Ano: ");
          int anoFundacao = teclado.nextInt();

          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          teclado.nextLine();

          System.out.print("A loja vende produto importado? (Sim/Não) ");
          String respostaImportado = teclado.nextLine();

          boolean importado = respostaImportado.equalsIgnoreCase("sim");

          Loja novaLoja =
              new Vestuario(
                  nomeDaLoja,
                  quantidadeDeFuncionarios,
                  salarioBaseFuncionario,
                  endereco,
                  dataFundacao,
                  importado);
          shopping.insereLoja(novaLoja);

        } else if (tipoLoja.equalsIgnoreCase("Bijuteria")) {
          System.out.println("Tipo de loja selecionado: Bijuteria");
          System.out.print("\nDigite o nome da loja a ser criada: ");
          String nomeDaLoja = teclado.nextLine();

          System.out.print("Digite a quantidade de funcionários que a loja possui: ");
          int quantidadeDeFuncionarios = teclado.nextInt();

          System.out.print("Digite o salário base dos funcionários: ");
          double salarioBaseFuncionario = teclado.nextDouble();

          teclado.nextLine();

          System.out.print("Digite o endereço da loja: ");
          String enderecoLoja = teclado.nextLine();

          System.out.println("-Preencha a data de fundação da loja-");
          System.out.print("Dia: ");
          int diaFundacao = teclado.nextInt();
          System.out.print("Mês: ");
          int mesFundacao = teclado.nextInt();
          System.out.print("Ano: ");
          int anoFundacao = teclado.nextInt();

          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          System.out.print("Digite a meta de vendas da loja R$: ");
          double metaVendas = teclado.nextDouble();

          Loja novaLoja =
              new Bijuteria(
                  nomeDaLoja,
                  quantidadeDeFuncionarios,
                  salarioBaseFuncionario,
                  endereco,
                  dataFundacao,
                  metaVendas);
          shopping.insereLoja(novaLoja);

        } else if (tipoLoja.equalsIgnoreCase("Alimentacao")
            || tipoLoja.equalsIgnoreCase("Alimentação")
            || tipoLoja.equalsIgnoreCase("Alimentaçao")) {
          System.out.println("Tipo de loja selecionado: Alimentação");
          System.out.print("\nDigite o nome da loja a ser criada: ");
          String nomeDaLoja = teclado.nextLine();

          System.out.print("Digite a quantidade de funcionários que a loja possui: ");
          int quantidadeDeFuncionarios = teclado.nextInt();

          System.out.print("Digite o salário base dos funcionários: ");
          double salarioBaseFuncionario = teclado.nextDouble();

          teclado.nextLine();

          System.out.print("Digite o endereço da loja: ");
          String enderecoLoja = teclado.nextLine();

          System.out.println("-Preencha a data de fundação da loja-");
          System.out.print("Dia: ");
          int diaFundacao = teclado.nextInt();
          System.out.print("Mês: ");
          int mesFundacao = teclado.nextInt();
          System.out.print("Ano: ");
          int anoFundacao = teclado.nextInt();

          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          teclado.nextLine();
          System.out.println("Preencha com a data do alvará:");
          System.out.print("Dia: ");
          int diaAlvara = teclado.nextInt();
          System.out.print("Mês: ");
          int mesAlvara = teclado.nextInt();
          System.out.print("Ano: ");
          int anoAlvara = teclado.nextInt();

          Data dataAlvara = new Data(diaAlvara, mesAlvara, anoAlvara);

          Loja novaLoja =
              new Alimentacao(
                  nomeDaLoja,
                  quantidadeDeFuncionarios,
                  salarioBaseFuncionario,
                  endereco,
                  dataFundacao,
                  dataAlvara);
          shopping.insereLoja(novaLoja);

        } else if (tipoLoja.equalsIgnoreCase("Informatica")
            || tipoLoja.equalsIgnoreCase("Informática")) {
          System.out.println("Tipo de loja selecionado: Informática");
          System.out.print("\nDigite o nome da loja a ser criada: ");
          String nomeDaLoja = teclado.nextLine();

          System.out.print("Digite a quantidade de funcionários que a loja possui: ");
          int quantidadeDeFuncionarios = teclado.nextInt();

          System.out.print("Digite o salário base dos funcionários: ");
          double salarioBaseFuncionario = teclado.nextDouble();

          teclado.nextLine();

          System.out.print("Digite o endereço da loja: ");
          String enderecoLoja = teclado.nextLine();

          System.out.println("-Preencha a data de fundação da loja-");
          System.out.print("Dia: ");
          int diaFundacao = teclado.nextInt();
          System.out.print("Mês: ");
          int mesFundacao = teclado.nextInt();
          System.out.print("Ano: ");
          int anoFundacao = teclado.nextInt();

          Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

          System.out.print("Qual o valor do seguro dos eletrônicos da loja R$: ");
          double seguroEletronicos = teclado.nextDouble();

          Loja novaLoja =
              new Informatica(
                  nomeDaLoja,
                  quantidadeDeFuncionarios,
                  salarioBaseFuncionario,
                  endereco,
                  dataFundacao,
                  seguroEletronicos);
          shopping.insereLoja(novaLoja);
        }

        break;

      case 2: // criar produto
        teclado.nextLine();

        System.out.print("Escolha o nome da loja em que deseja cadastrar o produto: ");
        String nomeLoja = teclado.nextLine();

        Loja loja = shopping.buscarLoja(nomeLoja);

        if (loja != null) {
          System.out.print("Digite o nome do produto a ser cadastrado: ");
          String nomeDoProduto = teclado.nextLine();
          System.out.print("Digite o preço do produto: ");
          double preco = teclado.nextDouble();
          teclado.nextLine();
          System.out.print("O produto possui data de validade? ");
          String respostaValidade = teclado.nextLine();

          if (respostaValidade.equalsIgnoreCase("sim")) {
            System.out.println("-Preencha a data de validade-");
            System.out.print("Dia: ");
            int dia = teclado.nextInt();
            System.out.print("Mês: ");
            int mes = teclado.nextInt();
            System.out.print("Ano: ");
            int ano = teclado.nextInt();
            teclado.nextLine();

            Data dataValidade = new Data(dia, mes, ano);
            Produto produto = new Produto(nomeDoProduto, preco, dataValidade);

            loja.insereProduto(produto);

            if (produto.estaVencido(hoje)) {
              System.out.println();
              System.out.print("Produto na validade!");
              System.out.println();
            } else {
              System.out.println();
              System.out.print("Produto vencido.");
              System.out.println();
            }
          } else {
            Produto produto = new Produto(nomeDoProduto, preco);

            loja.insereProduto(produto);
          }

          break;

        } else {
          System.out.println();
          System.out.print("ERRO! Loja não existe.");
          System.out.println();
        }
        break;

      case 3: // rempover loja
        teclado.nextLine();
        System.out.print("Digite o nome da loja a ser removida: ");
        String lojaRemover = teclado.nextLine();
        shopping.removeLoja(lojaRemover);
        System.out.println();
        break;

      case 4: // remover produto
        teclado.nextLine();
        System.out.println();
        System.out.print("Digite o nome da loja ao qual o produto a ser removido pertende: ");
        String nomeLojaProduto = teclado.nextLine();
        Loja lojaRemoverProduto = shopping.buscarLoja(nomeLojaProduto);
        if (lojaRemoverProduto != null) {
          System.out.print("Digite o nome do produto a ser removido: ");
          String produtoRemover = teclado.nextLine();
          lojaRemoverProduto.removeProduto(produtoRemover);
          System.out.println();
        } else {
          System.out.print("ERRO! Não foi possivel realizar esta ação: produto inexistente.");
        }
        break;

      case 5: // exibir informçãoes sobre shopping
        teclado.nextLine();

        int opcaoCaseCinco = 0;
        do {
          System.out.println();
          System.out.print(
              "Selecione a informação que deseja sobre o shopping:"
                  + "\n 1_ Exibir endereço do shopping"
                  + "\n 2- Exibir todas as lojas do shopping"
                  + "\n 3- Exibir quantidade de lojas por tipo"
                  + "\n 4- Exibir loja de informática do shopping com seguro mais caro"
                  + "\n 5- Voltar");

          System.out.println();
          System.out.print("Digite a opção desejada: ");
          opcaoCaseCinco = teclado.nextInt();
          System.out.println();

          switch (opcaoCaseCinco) {
            case 1:
              teclado.nextLine();
              System.out.print(endereco);
              System.out.println();
              break;

            case 2: // exibir todas as lojas
              for (Loja l : shopping.getLojas()) {
                if (l != null) {
                  System.out.print(l);
                  System.out.println();
                }
              }
              break;

            case 3: // exibir quantidade de lojas por tipo
              teclado.nextLine();
              System.out.print(
                  "Digite o tipo de loja que deseja verificar a quantidade (Cosmético, Vestuário, Bijuteria, Alimentação ou Informática): ");
              String lojaPorTipo = teclado.nextLine();

              int qntLojaTipo = shopping.quantidadeLojasPorTipo(lojaPorTipo);
              if (qntLojaTipo == -1) {
                System.out.print("ERRO! Tipo inválido.");
              } else {
                System.out.print("Quantidade de lojas do tipo " + lojaPorTipo + ": " + qntLojaTipo);
              }

              System.out.println();
              break;

            case 4: // exibir loja com seguro mais caro
              teclado.nextLine();
              Informatica maisCara = shopping.lojaSeguroMaisCaro();

              if (maisCara != null) {
                System.out.print("Loja de informática com seguro mais caro: " + maisCara.getNome());
              } else {
                System.out.print("Nenhuma loja de informática foi encontrada.");
              }

              System.out.println();
              break;

            case 5: // sair
              System.out.print("Voltando..");
              System.out.println();
              break;

            default:
              System.out.print("-ERRO!-" + "\nOpção inválida!");
              System.out.println();
          }

        } while (opcaoCaseCinco != 5);

        break;

      case 6:
        teclado.nextLine();
        int opcaoCaseSeis = 0;

        do {
          System.out.println();
          System.out.print(
              "Selecione a informação que deseja sobre as lojas"
                  + "\n 1_ Verificar tamanho de loja"
                  + "\n 2- Verificar gasto com salário"
                  + "\n 3- Verificar produtos da loja"
                  + "\n 4- Voltar");

          System.out.println();
          System.out.print("Digite a opção desejada: ");
          opcaoCaseSeis = teclado.nextInt();
          System.out.println();

          switch (opcaoCaseSeis) {
            case 1: // verificar tamanho de loja
              teclado.nextLine();
              System.out.print("Digite o nome da loja que deseja verificar o tamanho: ");
              String lojaVerificaTamanho = teclado.nextLine();
              Loja tamanhoLoja = shopping.buscarLoja(lojaVerificaTamanho);
              if (tamanhoLoja != null) {
                System.out.print("Tamanho da loja: " + tamanhoLoja.tamanhoDaLoja());
                System.out.println();
              } else {
                System.out.print("Não foi possível verificar o tamanho da loja.");
                System.out.println();
              }

              break;

            case 2: // verificar gasto c salario
              teclado.nextLine();
              System.out.print(
                  "Digite o nome da loja que deseja verificar os gastos com salário: ");
              String lojaVerificaGastoSalario = teclado.nextLine();

              Loja gastoSalario = shopping.buscarLoja(lojaVerificaGastoSalario);

              if (gastoSalario != null) {
                System.out.print("Gasto com salário R$: " + gastoSalario.gastosComSalario());
                System.out.println();
              } else {
                System.out.print("Erro! Não é possivel realizar o cálculo.");
                System.out.println();
              }

              break;

            case 3: // verificar produtos de loja
              teclado.nextLine();
              System.out.print("Digite o nome da loja que deseja verificar seus produtos: ");
              String lojaProdutos = teclado.nextLine();
              Loja lojaVerificaProdutos = shopping.buscarLoja(lojaProdutos);

              if (lojaVerificaProdutos != null) {
                lojaVerificaProdutos.imprimeProdutos();
                System.out.println();
              } else {
                System.out.print("ERRO! Loja não encontrada");
                System.out.println();
              }

              break;

            case 4:
              System.out.print("Voltando...");
              System.out.println();
              break;

            default:
              System.out.print("-ERRO!-" + "\nOpção inválida!");
              System.out.println();
          }

        } while (opcaoCaseSeis != 4);

        break;

      case 7: // exibir info produto
        teclado.nextLine();
        System.out.println();
        System.out.print("Digite o nome do produto que deseja verificar as informações: ");
        String produtoVerificarInfo = teclado.nextLine();
        System.out.println();
        boolean achou = false;

        for (Loja l : shopping.getLojas()) {
          if (l != null) {
            for (int i = 0; i < l.getEstoqueProdutos().size(); i++) {
              if (l.getEstoqueProdutos().get(i).getNome().equalsIgnoreCase(produtoVerificarInfo)) {
                System.out.print(l.getEstoqueProdutos().get(i));
                System.out.print ("Produto removido!")
                achou = true;
              }
            }
          }
        }

        if (achou != true) {
          System.out.print("Produto não encontrado.");
        }
        break;
    } // fecha switch do menu

  } while (opcao != 8); // fecha do do menu principal
} // fecha main
