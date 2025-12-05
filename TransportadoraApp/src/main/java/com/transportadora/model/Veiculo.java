package com.transportadora.model;

public class Veiculo {
    
    private String placa;
    private String tipo;
    private double capacidadeCarga; // Necessário para a validação RD001 
    private boolean emManutencao;

  

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    
    public Veiculo(String placa, String tipo, double capacidadeCarga, boolean emManutencao) {
        this.placa = placa;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.emManutencao = emManutencao;
    }
}