package banco;

public class ContaJuridica extends Conta {
	public ContaJuridica(int numero, double saldo) {
		super(numero, saldo);
	}
	
	@Override
	public double saldoMensal() {
		if (saldo < 5000) {
		return saldo - saldo * 0.02;
	} else {
		return saldo - saldo * 0.035;
	}
	}
}