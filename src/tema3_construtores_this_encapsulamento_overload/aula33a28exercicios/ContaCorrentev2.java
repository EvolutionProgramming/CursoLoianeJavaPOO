package tema3_construtores_this_encapsulamento_overload.aula33a28exercicios;

public class ContaCorrentev2 {
    private int id;
    private double saldo;
    private double limite;
    private boolean contaEspecial;

    public ContaCorrentev2() {
        this.id = 1;
        this.saldo = 1000;
        this.limite = 12000;
        this.contaEspecial = false;
    }

    public boolean realizarSaque(double valorSaque) {
        if (valorSaque <= 0 || valorSaque > (this.saldo + this.limite)) {
            return false;
        }

        if (valorSaque <= this.saldo) {
            // operação normal
            this.saldo -= valorSaque;
        } else {
            // se o o saldo não cobre, gasta o saldo e o usa o restante do limite
            double restante = valorSaque - this.saldo;
            this.saldo = 0;
            this.limite -= restante;
        }

        return true;
    }

    public boolean realizarDeposito(double valorDeposito) {
        if (valorDeposito <= 0) {
            return false;
        }

        double limiteMaximo = 12000.0; // Teto do limite contratado

        if (this.limite < limiteMaximo) {
            double limiteGasto = limiteMaximo - this.limite;

            if (valorDeposito <= limiteGasto) {

                this.limite += valorDeposito;
            } else {

                this.limite = limiteMaximo;
                this.saldo += (valorDeposito - limiteGasto);
            }
        } else {
            // Se o limite já estiver cheio, o depósito vai direto para o saldo
            this.saldo += valorDeposito;
        }

        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }
}


