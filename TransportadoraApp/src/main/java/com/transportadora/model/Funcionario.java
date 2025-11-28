package com.transportadora.model;

public class Funcionario extends Usuario {
    
    private String cargo;

    public Funcionario(String nome, String email, String senha, String endereco, String cargo) {
        super(nome, email, senha, endereco);
        this.cargo = cargo;
    }

    public void gerenciarFrota() {
        // Essa logica vai ser implementada por outro integrante
        System.out.println("Funcionário " + this.getNome() + " acessou o gerenciamento de frota.");
    }

    public String getCargo() {
        return cargo;
    }
}