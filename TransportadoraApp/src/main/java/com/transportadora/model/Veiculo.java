// Local: src/main/java/com/transportadora/model/Veiculo.java
package com.transportadora.model;

public class Veiculo {
    private String placa;
    private String tipo; 
    private double capacidadeCarga; 
    private String status; 

    
    public Veiculo(String placa, String tipo, double capacidadeCarga) {
        this.placa = placa;
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.status = "DISPONIVEL"; // Status inicial
    }


    public String getPlaca() {
        return placa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

  
}