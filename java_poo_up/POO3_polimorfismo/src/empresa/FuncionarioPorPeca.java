package empresa;

public class FuncionarioPorPeca extends Funcionario implements Pagamento {	
	private double lucro_peca;
	private int pecas_produzidas;
	
	public FuncionarioPorPeca(String nome, String sobrenome, double salario_base, double lucro_peca, int pecas_produzidas) {
		super(nome, sobrenome, salario_base);
		this.lucro_peca = lucro_peca;
		this.pecas_produzidas = pecas_produzidas;
	}
	
	@Override
	public double salario() {
		return salario_base + lucro_peca * pecas_produzidas;
	}
	
	@Override
	public void gerarRelatorio() {
		System.out.println("Nome completo: " + nomeCompleto() + " - Salario total: " + salario() + " - Peças produzidas: " + pecas_produzidas + " [POR PEÇA]");
	}
}
