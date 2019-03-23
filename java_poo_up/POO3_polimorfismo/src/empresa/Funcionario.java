package empresa;

public abstract class Funcionario implements Pagamento {
    protected String nome;
    protected String sobrenome;
    protected double salario_base;
    protected int ano_experiencia;

    public Funcionario(String nome, String sobrenome, double salario_base) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_base = salario_base;
    }
    
    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
    
    public abstract double salario();
    
	@Override
    public void gerarRelatorio() {
    	
    }
}