package aula27exercicios;

public class ContaCorrente {
    int id;
    double saldo;
    double limite;
    boolean contaEspecial;

    void consultarSaldo() {
        System.out.println("SEU SALDO É DE: " + saldo + "R$");
    }

    void verificarChequeEspecial() {
        if (contaEspecial == true) {
            System.out.println("SUA CONTA É DO TIPO ESPECIAL.");
        } else {
            System.out.println("SUA CONTA NÃO É DO TIPO ESPECIAL.");
        }
    }

    void exibirOpcoes() {
        System.out.println("---------------------------------");
        System.out.println("Escolha uma opção para prosseguir:");
        System.out.println();
        System.out.println("Digite 1 para consultar saldo");
        System.out.println("Digite 2 para realizar saque");
        System.out.println("Digite 3 para realizar deposito");
        System.out.println("Digite 4 para verificar cheque especial");
        System.out.println("Digite 0 para sair");
    }

    void finalizarSistema() {
        System.out.println("SISTEMA FINALIZANDO...");
        System.exit(0);
    }

    void informarComandoInvalido() {
        System.out.println("DIGITE UM COMANDO VÁLIDO!:");
        System.out.println();
    }

    void limparConsole() {
        // Imprime 50 linhas em branco
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    double realizarSaque(double saldo, double valorSaque) {
        return saldo - valorSaque;
    }

    double realizarDeposito(double saldo, double valorDeposito) {
        return saldo + valorDeposito;
    }

}


