package aula33a28exercicios;

import java.util.Scanner;

public class ContaCorrentev2Teste {
    public static void main(String[] args) {
        ContaCorrentev2 conta1 = new ContaCorrentev2();
        Scanner sc = new Scanner(System.in);

        int comando;

        do {

            exibirOpcoes();
            comando = sc.nextInt();
            limparConsole();
            // essa variável é para validar se o saque ou deposito foram permitidos no switch abaixo
            boolean sucesso;

            switch (comando) {
                case 1:
                    consultarSaldo(conta1);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = sc.nextDouble();
                    limparConsole();

                    sucesso = conta1.realizarSaque(valorSaque);

                    if (sucesso) {
                        exibirSucessoSaque(conta1, valorSaque);

                    } else {
                        System.out.println("Não foi possível realizar o saque. Valor indisponível ou inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = sc.nextDouble();
                    limparConsole();

                    sucesso = conta1.realizarDeposito(valorDeposito);
                    if (sucesso) {
                        exibirSucessoDeposito(conta1, valorDeposito);

                    } else {
                        System.out.println("Não foi possível realizar o depósito. Valor inválido!");
                    }
                    break;
                case 4:
                    verificarChequeEspecial(conta1);
                    break;
                case 0:
                    finalizarSistema();
                    break;
                default:
                    informarComandoInvalido();

            }
        } while (comando != 0);
        sc.close();
    }

    private static void exibirOpcoes() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma opção para prosseguir:");
        System.out.println();
        System.out.println("Digite 1 para consultar saldo");
        System.out.println("Digite 2 para realizar saque");
        System.out.println("Digite 3 para realizar deposito");
        System.out.println("Digite 4 para verificar cheque especial");
        System.out.println("Digite 0 para sair");
    }

    private static void exibirSucessoSaque(ContaCorrentev2 conta, double valorSaque) {
        System.out.println("---------------------------------");
        System.out.println("SAQUE REALIZADO COM SUCESSO!");
        System.out.println("VALOR DO SAQUE: " + valorSaque + "R$");
        System.out.println("NOVO SALDO: " + conta.getSaldo() + "R$");

    }

    private static void exibirSucessoDeposito(ContaCorrentev2 conta, double valorDeposito) {
        System.out.println("---------------------------------");
        System.out.println("DEPÓSITO REALIZADO COM SUCESSO!");
        System.out.println("VALOR DO DEPÓSITO: " + valorDeposito + "R$");
        System.out.println("VALOR APÓS O DEPÓSITO: " + conta.getSaldo() + "R$");

    }

    private static void consultarSaldo(ContaCorrentev2 conta) {
        System.out.println("SEU SALDO É DE: " + conta.getSaldo() + "R$");
    }

    private static void verificarChequeEspecial(ContaCorrentev2 conta) {
        if (conta.isContaEspecial()) {
            System.out.println("SUA CONTA É DO TIPO ESPECIAL.");
        } else {
            System.out.println("SUA CONTA NÃO É DO TIPO ESPECIAL.");
        }
    }

    private static void finalizarSistema() {
        System.out.println("SISTEMA FINALIZANDO...");
    }

    private static void informarComandoInvalido() {
        System.out.println("DIGITE UM COMANDO VÁLIDO!:");
        System.out.println();
    }

    private static void limparConsole() {
        // Imprime 50 linhas em branco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
