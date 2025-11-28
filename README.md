# 🚚 Sistema de Gestão Logística e Transportadora

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow?style=for-the-badge)

Projeto acadêmico de Engenharia de Software desenvolvido em grupo. O sistema visa gerenciar o fluxo de pedidos, controle de frota e rastreamento de entregas de uma transportadora.

## 📋 Escopo e Funcionalidades

O projeto atende aos requisitos funcionais (RF) e regras de negócio (RN) estipulados, incluindo:

* **Autenticação Segura:** Login com criptografia RSA para proteção de senhas (RNF003).
* **Gestão de Pedidos:** Cadastro e validação de cargas conforme legislação (VUC/Caminhões) (RD001).
* **Cálculo de Frete:** Estimativa de custos baseada em peso e rota.
* **Controle de Frota:** Gestão de veículos, motoristas e manutenção.
* **Rastreamento:** Consulta de status de entrega com tempo de resposta otimizado (< 2s).

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17 ou superior).
* **IDE Recomendada:** Apache NetBeans.
* **Gerenciador de Dependências:** Maven.
* **Testes:** JUnit 4.13.2.
* **Arquitetura:** MVC (Model-View-Controller).

## 📂 Estrutura do Projeto

A organização dos pacotes segue o padrão MVC:

com.transportadora ├── model # Classes de dados (Usuario, Cliente, Pedido, Veiculo) ├── view # Telas e Interface Gráfica (Swing/JFrame) ├── controller # Lógica de negócio e comunicação entre View e Model └── util # Utilitários (Segurança/CriptografiaUtil.java)


## 🛠️ Como Executar o Projeto

### Pré-requisitos
1.  Ter o **Java JDK** instalado e configurado.
2.  Ter o **Git** instalado.
3.  Utilizar o **NetBeans** (ou IntelliJ/Eclipse com suporte a Maven).

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU_USUARIO/TransportadoraApp.git](https://github.com/SEU_USUARIO/TransportadoraApp.git)
    ```
2.  **Abra no NetBeans:**
    * Vá em `File` > `Open Project`.
    * Selecione a pasta clonada.
3.  **Instale as Dependências:**
    * O projeto usa Maven. Ao abrir, o NetBeans deve baixar as dependências automaticamente.
    * Caso contrário, clique com o botão direito no projeto > **Clean and Build**.

## 🧪 Executando os Testes (JUnit)

O projeto possui cobertura de testes unitários para garantir a qualidade e segurança (RNF002, RNF003).

Para rodar os testes:
1.  No NetBeans, expanda a pasta **Test Packages**.
2.  Clique com o botão direito no arquivo `LoginTest.java`.
3.  Selecione **Run File** (ou `Ctrl + F6`).

**Cenários Cobertos Atualmente:**
- [x] Login com Sucesso (Credenciais válidas).
- [x] Bloqueio de Login (Senha incorreta).
- [x] Verificação de Criptografia RSA (Cifragem e Decifragem).

## 👥 Colaboradores (Grupo 3)

| Integrante | Função | Responsabilidade Principal |
| :--- | :--- | :--- |
| **Sérgio* | Tech Lead / Backend | Infraestrutura, Segurança (RSA) e Autenticação. |
| **Michel** | Desenvolvedor | Módulo de Pedidos, Cliente e Regras de Frete. |
| **Igor** | Desenvolvedor | Módulo de Frota, Rotas e Manutenção. |

---
*Este projeto é estritamente educacional.*
