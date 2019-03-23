package banco;

public class ContaCorrente extends Conta {
	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}
	
	@Override
	public double saldoMensal() {
		return saldo - saldo * 0.01;
	}
}
