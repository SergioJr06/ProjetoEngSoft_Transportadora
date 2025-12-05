package com.transportadora.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testVeiculoCriadoComStatusDisponivel() {
 
        Veiculo vuc = new Veiculo("ABC-1234", "VUC", 3000.0);
        
        String statusAtual = vuc.getStatus();

   
        assertEquals("DISPONIVEL", statusAtual, 
                     "O veículo deve ser criado com o status 'DISPONIVEL'");
    }

    @Test
    public void testCapacidadeCargaCorreta() {
   
        double capacidadeEsperada = 15000.0;
        Veiculo caminhao = new Veiculo("DEF-5678", "TRUCK", capacidadeEsperada);
        
  
        double capacidadeReal = caminhao.getCapacidadeCarga();

      
        assertEquals(capacidadeEsperada, capacidadeReal, 0.001,
                     "A capacidade de carga deve ser a definida no construtor");
    }
}