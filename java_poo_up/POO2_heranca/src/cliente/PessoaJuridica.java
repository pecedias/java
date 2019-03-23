package cliente;

public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }
    
    public boolean validarCNPJ() {
        return false;
    }
    
    @Override
    public boolean valido() {
    	if (cnpj.length() == 14 && cnpj.matches("[0-9]+")) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
}
