package empresa;

public class FuncionarioMensalista extends Funcionario implements Pagamento {
	public FuncionarioMensalista(String nome, String sobrenome, double salario_base) {
		super(nome, sobrenome, salario_base);
	}
	
	@Override 
	public double salario() {
		return salario_base * 5;
	}
	
	@Override
    public void gerarRelatorio() {
    	System.out.println("Nome completo: " + nomeCompleto() + " - Salario total: " + salario() + " [MENSALISTA]");
    }
}
