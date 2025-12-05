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
    
    public double calcularFrete(String cepDestino) {
    
    
    final double DISTANCIA_VIAGEM_KM = 450.0; // Quantidade de KM
    final double TARIFA_FIXA = 150.0;       // Taxa inicial por pedido
    final double CUSTO_POR_KM = 0.85;       // Custo de 85 centavos por KM
    final double CUSTO_POR_PESO_KG = 0.40;  // Custo de 40 centavos por KG
    
    // 1. Cálculo do Custo por Distância
    double custoDistancia = DISTANCIA_VIAGEM_KM * CUSTO_POR_KM;
    
    // 2. Cálculo do Custo por Peso
    // (O atributo 'this.peso' é o peso do pedido atual na classe Pedido)
    double custoPeso = this.peso * CUSTO_POR_PESO_KG; 
    
  
    double freteTotal = TARIFA_FIXA + custoDistancia + custoPeso;
    
    return freteTotal;
}
    
}