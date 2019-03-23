package banco;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor<=this.saldo) {
            this.saldo -= valor;
        }
    }
    
    public Conta transferir(Conta conta, double valor) {
        if (valor<=this.saldo) {
            this.saldo -= valor;
            conta.depositar(valor);
        }
        return conta;
    }
    
    public abstract double saldoMensal();
}
