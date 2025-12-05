package com.transportadora.model.test;

import com.transportadora.model.Pedido;
import com.transportadora.model.Veiculo;
import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {

    //Testa a Regra de Carga RD001 (excesso)
    @Test
    public void testValidarPeso_ExcessoDeCarga() {
        // 1. Configura Veículo (VUC) com limite de 3000 kg
        Veiculo vuc = new Veiculo("VUC-3000", "VUC", 3000.0, false);
        
        // 2. Configura Pedido com peso excedente (3100 kg)
        Pedido pedidoExcedente = new Pedido();
        pedidoExcedente.setPeso(3100.0);
        pedidoExcedente.setVeiculo(vuc); 

        // 3. A validação DEVE retornar FALSE (o sistema deve impedir)
        boolean resultadoValidacao = pedidoExcedente.validarPeso();
        
        // Verifica se o resultado é "FALSE"
        assertFalse("RD001 falhou. O sistema permitiu uma carga que excede o limite (3100kg > 3000kg).",
        resultadoValidacao);
    }
    
    //  Testa a Regra de Carga RD001 (sucesso)
    @Test
    public void testValidarPeso_CargaPermitida() {
        Veiculo caminhao = new Veiculo("CAM-6000", "Toco", 6000.0, false);
        Pedido pedidoOK = new Pedido();
        pedidoOK.setPeso(5999.0);
        pedidoOK.setVeiculo(caminhao);
        
        // A validação DEVE retornar TRUE
        assertTrue("RD001 falhou. O sistema rejeitou uma carga dentro do limite.",
        pedidoOK.validarPeso());
    }
}