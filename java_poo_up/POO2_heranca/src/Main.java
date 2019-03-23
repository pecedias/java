import cliente.Pessoa;
import cliente.PessoaFisica;
import cliente.PessoaJuridica;
import banco.ContaPoupanca;
import banco.ContaCorrente;
import banco.ContaJuridica;

public class Main {

    public static void main(String[] args) {
    	PessoaFisica pf1 = new PessoaFisica("Paulo", "09607563961");   	
    	
    	PessoaJuridica pj1 = new PessoaJuridica("Paulo Ltd", "06969986006942");   	
    	
    	System.out.println();
    	
        ContaPoupanca cp1 = new ContaPoupanca(123, 5000.0);      
        pf1.addConta(cp1);
        
        ContaCorrente cc1 = new ContaCorrente(456, 5000.0);
        pf1.addConta(cc1);
         
        ContaJuridica cj1 = new ContaJuridica(789, 5000.0);
        pj1.addConta(cj1);    
       
	    System.out.println("Nome PF: " + pf1.getNome());
	    System.out.println("Nome PJ: " + pj1.getNome());
	    System.out.println("Validar CPF: " + pf1.valido());
	    System.out.println("Validar CNPJ: " + pj1.valido());
	    System.out.println("Saldo Poupança: " + cp1.saldoMensal());
	    System.out.println("Saldo Corrente: " + cc1.saldoMensal());
	    System.out.println("Saldo Jurídica: " + cj1.saldoMensal());        
    }
    
}
