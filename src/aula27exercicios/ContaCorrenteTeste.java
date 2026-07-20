package aula27exercicios;

import java.util.Scanner;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        Scanner sc = new Scanner(System.in);

        conta1.id = 1;
        conta1.saldo = 1000;
        conta1.limite = 12000;
        conta1.contaEspecial = false;
        int comando = 1;

        while (comando != 0) {

            exibirOpcoes();
            comando = sc.nextInt();
            limparConsole();
            // essa variável é para validar se o saque ou deposito foram permitidos no switch abaixo
            boolean sucesso;

            switch (comando) {
                case 1:
                    consultarSaldo(conta1.saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = sc.nextDouble();
                    limparConsole();

                    sucesso = conta1.realizarSaque(valorSaque);

                    if (sucesso) {
                        System.out.println("---------------------------------");
                        System.out.println("SAQUE REALIZADO COM SUCESSO!");
                        System.out.println("VALOR DO SAQUE: " + valorSaque + "R$");
                        System.out.println("NOVO SALDO: " + conta1.saldo + "R$");
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
                        System.out.println("---------------------------------");
                        System.out.println("VALOR DO DEPÓSITO: " + valorDeposito + "R$");
                        System.out.println("VALOR APÓS O DEPÓSITO: " + conta1.saldo + "R$");
                    } else {
                        System.out.println("Não foi possível realizar o depósito. Valor inválido!");
                    }
                    break;
                case 4:
                    verificarChequeEspecial(conta1.contaEspecial);
                    break;
                case 0:
                    finalizarSistema();
                    break;
                default:
                    informarComandoInvalido();
                    continue;

            }
        }
        sc.close();
    }

    static void exibirOpcoes() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma opção para prosseguir:");
        System.out.println();
        System.out.println("Digite 1 para consultar saldo");
        System.out.println("Digite 2 para realizar saque");
        System.out.println("Digite 3 para realizar deposito");
        System.out.println("Digite 4 para verificar cheque especial");
        System.out.println("Digite 0 para sair");
    }

    static void consultarSaldo(double saldo) {
        System.out.println("SEU SALDO É DE: " + saldo + "R$");
    }

    static void verificarChequeEspecial(boolean chequeEspecial) {
        if (chequeEspecial) {
            System.out.println("SUA CONTA É DO TIPO ESPECIAL.");
        } else {
            System.out.println("SUA CONTA NÃO É DO TIPO ESPECIAL.");
        }
    }

    static void finalizarSistema() {
        System.out.println("SISTEMA FINALIZANDO...");
        System.exit(0);
    }

    static void informarComandoInvalido() {
        System.out.println("DIGITE UM COMANDO VÁLIDO!:");
        System.out.println();
    }

    static void limparConsole() {
        // Imprime 50 linhas em branco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
