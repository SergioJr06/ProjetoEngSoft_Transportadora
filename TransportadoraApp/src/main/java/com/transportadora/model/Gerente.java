package com.transportadora.model;

public class Gerente extends Usuario {
    
    private String setor;

    public Gerente(String nome, String email, String senha, String endereco, String setor) {
        super(nome, email, senha, endereco);
        this.setor = setor;
    }

    public void gerenciarUsuarios() {
        System.out.println("Gerente " + this.getNome() + " está gerenciando usuários.");
    }

    public void emitirRelatorios() {
        System.out.println("Gerando relatórios do setor: " + this.setor);
    }
}