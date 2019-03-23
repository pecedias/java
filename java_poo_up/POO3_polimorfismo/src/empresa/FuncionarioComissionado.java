package empresa;

public class FuncionarioComissionado extends Funcionario implements Pagamento {
	private double comissao;
	private int qtd_vendas;
	
	public FuncionarioComissionado(String nome, String sobrenome, double salario_base, double comissao, int qtd_vendas) {
		super(nome, sobrenome, salario_base);
		this.comissao = comissao;
		this.qtd_vendas = qtd_vendas;
	}
	
	@Override 
	public double salario() {
		return salario_base + comissao * qtd_vendas;
	}
	
	@Override
	public void gerarRelatorio() {
		System.out.println("Nome completo: " + nomeCompleto() + " - Salário total: " + salario() + " - Qtd vendas:" + qtd_vendas + " [COMISSIONADO]");
	}
}
