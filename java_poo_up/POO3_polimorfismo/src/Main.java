import empresa.Funcionario;
import empresa.FuncionarioMensalista;
import empresa.FuncionarioComissionado;
import empresa.FuncionarioPorPeca;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Funcionario[] funcionario = new Funcionario[5];
    	
    	funcionario[0] = new FuncionarioMensalista("Paulo", "Dias", 1000.0);
    	
    	funcionario[1] = new FuncionarioPorPeca("João", "Dickson", 850.0, 10.0, 30);
    	funcionario[2] = new FuncionarioPorPeca("Jhonny", "Course", 850.0, 10.0, 25);
    	
    	funcionario[3] = new FuncionarioComissionado("Antonio", "Macos", 2500.0, 15.0, 45);
    	funcionario[4] = new FuncionarioComissionado("Victor", "diCesar", 1999.0, 15.0, 28);
    
    	double soma = 0.0;
    	for (int i = 0; i < 5; i++) {
    		soma += funcionario[i].salario();
    	}
    	System.out.println("Soma total de todos os salários: " + soma);
    	
    	System.out.println();
    	
    	System.out.println("FOLHA DE PAGAMENTO:");
   	
    	for (int i = 0; i < 5; i++) {
    		funcionario[i].gerarRelatorio();
    	}
    }
    
}
