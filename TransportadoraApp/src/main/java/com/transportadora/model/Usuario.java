package com.transportadora.model;
import com.transportadora.util.CriptografiaUtil;

// * Classe abstrata que representa um usuário genérico do sistema.

public abstract class Usuario {
    
    // Os atributos estao protegidos para que as classes filhas (Cliente, Gerente) possam acessar
    protected String nome;
    protected String email;
    protected String senha; // criptografada
    protected String endereco;

    public Usuario(String nome, String email, String senha, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        // Ao criar o usuário, já criptografamos a senha (RNF003)
        this.senha = criptografarSenha(senha);
    }

    // Construtor vazio que ainda precisa de Frameworks
    public Usuario() {
    }

    // Método de Login (RNF002) : Verifica se o email bate e se a senha informada (após criptografar) bate com a guardada.
    public boolean login(String emailLogin, String senhaLogin){
        if (this.email.equals(emailLogin)) {
            // Pega a senha criptografada que está salva na memoria
            String senhaSalvaDescriptografada = CriptografiaUtil.descriptografar(this.senha);
            
            // vai comparar com a senha que o usuário digitou agora
            if (senhaSalvaDescriptografada != null) {
                return senhaSalvaDescriptografada.equals(senhaLogin);
            }
        }
        return false;
    }

    public void logout() {
        System.out.println("Usuário " + this.nome + " realizou logout.");
    }


    // Método responsável pela segurança (RNF003).
    // Em um cenário real RSA, usaríamos chaves Públicas/Privadas.
    // Aqui simulamos o hash para funcionamento da lógica de login.
    
    private String criptografarSenha(String senhaOriginal) {
      return CriptografiaUtil.criptografar(senhaOriginal);
    }

    // os Getters e Setters

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    // Não criasse o setSenha público simples para obrigar o uso da criptografia no construtor ou método específico

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}