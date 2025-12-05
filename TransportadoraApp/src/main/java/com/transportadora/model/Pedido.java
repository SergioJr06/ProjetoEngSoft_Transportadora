package com.transportadora.model;

public class Pedido {

    private int id;
    private double peso;
    private double valorTotal;
    private String status;
    private Veiculo veiculo; // Associação para validar RD001 
    
  

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    // Implementação da Regra de Carga RD001 
    // Retorna true se o peso do pedido for MENOR ou IGUAL à capacidade do veículo
    public boolean validarPeso() {
        if (this.veiculo == null) {
            // Se não há veículo, a validação não pode ser feita.
            return false; 
        }
        // Compara o peso do pedido com a capacidade de carga do veículo 
        return this.peso <= this.veiculo.getCapacidadeCarga();
    }
    
}