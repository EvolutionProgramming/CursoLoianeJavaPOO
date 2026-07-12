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

            conta1.exibirOpcoes();
            comando = sc.nextInt();
            conta1.limparConsole();

            switch (comando) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = sc.nextDouble();
                    conta1.limparConsole();
                    if ((valorSaque > 0) && (valorSaque <= conta1.saldo)) {
                        System.out.println("---------------------------------");
                        System.out.println("VALOR DO SAQUE: " + valorSaque + "R$");
                        conta1.saldo = conta1.realizarSaque(conta1.saldo, valorSaque);
                        System.out.println("VALOR APÓS O SAQUE: " + conta1.saldo + "R$");
                        break;
                    } else if ((valorSaque <= 0) || (valorSaque > conta1.saldo)) {
                        System.out.println("Valor indisponível, tente outra vez!");
                        continue;
                    }
                case 3:
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = sc.nextDouble();
                    conta1.limparConsole();
                    System.out.println("---------------------------------");
                    System.out.println("VALOR DO DEPÓSITO: " + valorDeposito + "R$");
                    conta1.saldo = conta1.realizarDeposito(conta1.saldo, valorDeposito);
                    System.out.println("VALOR APÓS O DEPÓSITO: " + conta1.saldo + "R$");
                    break;
                case 4:
                    conta1.verificarChequeEspecial();
                    break;
                case 0:
                    conta1.finalizarSistema();
                    break;
                default:
                    conta1.informarComandoInvalido();
                    continue;

            }
        }
        sc.close();
    }
}
