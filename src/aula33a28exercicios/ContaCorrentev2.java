package aula33a28exercicios;

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
        if (valorSaque <= 0) {
            return false;
        } else if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public boolean realizarDeposito(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            return true;
        }
        return false;
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


