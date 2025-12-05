// Local: src/main/java/com/transportadora/model/Rota.java
package com.transportadora.model;

public class Rota {
    private String origem;
    private String destino;
    private double tempoEstimadoHoras; 
    private Veiculo veiculoDesignado;


    public Rota(String origem, String destino, double tempoEstimadoHoras) {
        this.origem = origem;
        this.destino = destino;
        this.tempoEstimadoHoras = tempoEstimadoHoras;
    }


    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getTempoEstimadoHoras() {
        return tempoEstimadoHoras;
    }

    public Veiculo getVeiculoDesignado() {
        return veiculoDesignado;
    }

    public void designarVeiculo(Veiculo veiculo) {
        this.veiculoDesignado = veiculo;
    }
}