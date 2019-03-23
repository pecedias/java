package banco;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, double saldo) {
		super(numero, saldo);
	}
	
	@Override
	public double saldoMensal() {
		return saldo + saldo * 0.05;
	}

}
