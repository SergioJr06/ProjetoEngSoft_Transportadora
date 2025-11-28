package com.transportadora.model;

public class Cliente extends Usuario {
    
    // o construtorrepassa os dados a classe pai
    public Cliente(String nome, String email, String senha, String endereco) {
        super(nome, email, senha, endereco);
    }

    // metodo do cliente
    public void cadastrarPedido() {
        // Essa logica vai ser implementada por outro integrante
        System.out.println("Cliente " + this.getNome() + " iniciou um novo pedido.");
    }

    public String consultarRastreio(String codigo) {
        // Essa logica vai ser implementada por outro integrante
        return "Status do rastreio " + codigo + ": Em Trânsito (Simulação)";
    }
}