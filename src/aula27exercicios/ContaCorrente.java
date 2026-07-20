package aula27exercicios;

public class ContaCorrente {
    int id;
    double saldo;
    double limite;
    boolean contaEspecial;

    boolean realizarSaque(double valorSaque) {
        if (valorSaque <= 0) {
            return false;
        } else if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    boolean realizarDeposito(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            return true;
        }
        return false;
    }

}


