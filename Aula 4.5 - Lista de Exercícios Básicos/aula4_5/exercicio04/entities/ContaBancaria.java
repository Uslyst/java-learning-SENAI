package aula4_5.exercicio04.entities;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return String.format("\nTitular '%s' \nSaldo: %.2f, \nConta: %d", titular, saldo, numeroConta);
    }

    public void depositar(double qnt) {
        if (qnt < 0) {
            return;
        }

        saldo += qnt;
    }

    public double sacar(double qnt) {
        if(qnt > saldo) 
            return -1;
        saldo -= qnt;

        return qnt;
    }

}
