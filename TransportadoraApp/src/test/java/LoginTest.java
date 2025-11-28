package com.transportadora.model;
// JUNIT
import org.junit.Test;
import static org.junit.Assert.*;
import com.transportadora.util.CriptografiaUtil; 

/**
 * Classe de Testes para verificar Autenticação (RNF002).
 */
public class LoginTest {

    public LoginTest() {
    }

    @Test
    public void testeLoginSucesso() {
        System.out.println("Executando teste: Login com Sucesso...");
        
        // 1. Criar Cliente (Senha vai ser criptografada automaticamente)
        Cliente cliente = new Cliente(
            "Cliente Teste", 
            "novo.cliente@teste.com", 
            "Senha@Forte123", 
            "Rua das Flores, 123"
        );

        // 2. Tentar logar
        boolean resultado = cliente.login("novo.cliente@teste.com", "Senha@Forte123");

        // 3. Verificar
        assertTrue("O usuário deveria logar com a senha correta", resultado);
    }

    @Test
    public void testeLoginFalhaSenhaIncorreta() {
        System.out.println("Executando teste: Falha de Login...");
        
        Cliente cliente = new Cliente(
            "Cliente Teste", 
            "novo.cliente@teste.com", 
            "Senha@Forte123", 
            "Rua das Flores, 123"
        );

        boolean resultado = cliente.login("novo.cliente@teste.com", "senhaerrada");

        assertFalse("O usuário NÃO deveria logar com senha errada", resultado);
    }
    
    @Test
    public void testeCriptografiaArmazenada() {
        System.out.println("Executando teste: Verificação RSA...");
        
        String senhaPlana = "Segredo123";
        // Vamos usar a classe utilitária direto para testar se ela criptografa e descriptografa igual
        String cifrada = CriptografiaUtil.criptografar(senhaPlana);
        String decifrada = CriptografiaUtil.descriptografar(cifrada);
        
        assertNotNull("A criptografia não pode retornar nulo", cifrada);
        assertNotEquals("A senha salva não pode ser igual à original", senhaPlana, cifrada);
        assertEquals("A descriptografia deve trazer a senha original de volta", senhaPlana, decifrada);
    }
}