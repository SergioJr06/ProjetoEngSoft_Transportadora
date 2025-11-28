package com.transportadora.util;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;

// Classe responsável pela criptografia RSA (Requisito RNF003).

public class CriptografiaUtil {

    private static KeyPair parDeChaves;

    // Bloco estático para gerar as chaves assim que o programa rodar
    static {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(2048); // tamanho da chave
            parDeChaves = generator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 // Criptografa uma String usando a Chave Pública.
    
    public static String criptografar(String textoPlano) {
        try {
            PublicKey chavePublica = parDeChaves.getPublic();
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, chavePublica);
            
            byte[] bytesCriptografados = cipher.doFinal(textoPlano.getBytes());
            // Converte para Base64 pra conseguir salvar como texto na memoria
            return Base64.getEncoder().encodeToString(bytesCriptografados);
        } catch (Exception e) {
            System.err.println("Erro ao criptografar: " + e.getMessage());
            return null;
        }
    }

// Descriptografa uma String usando a Chave Privada. (Usaremos isso para conferir a senha ou dados sensíveis internamente)
     
    public static String descriptografar(String textoCriptografado) {
        try {
            PrivateKey chavePrivada = parDeChaves.getPrivate();
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, chavePrivada);
            
            byte[] bytesDecodificados = Base64.getDecoder().decode(textoCriptografado);
            byte[] bytesDescriptografados = cipher.doFinal(bytesDecodificados);
            return new String(bytesDescriptografados);
        } catch (Exception e) {
            System.err.println("Erro ao descriptografar: " + e.getMessage());
            return null;
        }
    }
}