package cliente;

import java.util.ArrayList;
import java.util.List;

import banco.Conta;

public abstract class Pessoa {
    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addConta(Conta conta) {
    	contas.add(conta);
    }
    
    public abstract boolean valido();
}