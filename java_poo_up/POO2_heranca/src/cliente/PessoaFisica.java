package cliente;

public class PessoaFisica extends Pessoa {
    
    private String cpf;
    
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }
    
    public boolean validarCPF() {
        return false;        
    }
    
    @Override
    public boolean valido() {
    	if (cpf.length() == 11 && cpf.matches("[0-9]+")) {
    		return true;
    	} else { 
    		return false;
    	}
    }
    
}
