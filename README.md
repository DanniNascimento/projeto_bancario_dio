# Projeto Bancário em Java Orientado a Objetos

## Visão Geral

Este projeto em Java demonstra os conceitos fundamentais da Programação Orientada a Objetos (POO) através da implementação de um sistema bancário simplificado. O foco principal é ilustrar os princípios de abstração, encapsulamento, herança e polimorfismo em um contexto prático.

## Funcionalidades

O sistema bancário implementa as seguintes funcionalidades essenciais:

* **Criação de Contas:** Suporta a criação de dois tipos distintos de contas bancárias:
    * **Conta Corrente:** Oferece um limite de cheque especial para seus usuários.
    * **Conta Poupança:** Acumula rendimentos com base em uma taxa predefinida.
* **Depósito:** Permite que os clientes adicionem fundos às suas contas existentes.
* **Saque:** Facilita a retirada de dinheiro das contas, respeitando o saldo disponível e o limite de cheque especial para contas correntes.
* **Transferência:** Habilita a movimentação de valores entre contas pertencentes à mesma instituição bancária.
* **Aplicação de Rendimento:** Calcula e aplica rendimentos mensais às contas poupança.
* **Listagem de Contas:** Apresenta informações detalhadas sobre todas as contas registradas no banco.

## Conceitos de POO Aplicados

Este projeto foi desenvolvido com ênfase nos seguintes princípios da Programação Orientada a Objetos:

* **Abstração:** A classe abstrata `Conta` serve como uma representação genérica de uma conta bancária, definindo atributos e comportamentos comuns. As classes `ContaCorrente` e `ContaPoupança` especializam essa abstração para tipos de contas específicos.
* **Encapsulamento:** Os atributos das classes são declarados como `private`, restringindo o acesso direto e garantindo que a manipulação dos dados seja feita através de métodos `public` (getters e setters). Isso protege a integridade dos dados e oculta a complexidade da implementação interna.
* **Herança:** As classes `ContaCorrente` e `ContaPoupança` herdam da classe `Conta`, herdando seus atributos e métodos. A classe `ContaCorrente` estende a funcionalidade de saque para considerar o limite de cheque especial.
* **Polimorfismo:** Objetos de `ContaCorrente` e `ContaPoupança` podem ser referenciados utilizando o tipo da classe pai `Conta`. O método `transferir` da classe `Conta` demonstra o polimorfismo ao aceitar objetos de diferentes subclasses de `Conta` como destinatário.

## Como Executar

Para executar o projeto, siga os passos abaixo:

1.  **Pré-requisitos:**
    * Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
    * Opcionalmente, você pode utilizar o Maven para gerenciar as dependências e o processo de build do projeto.

2.  **Execução com Maven:**
    ```bash
    cd projeto-bancario
    mvn clean install
    java -jar target/projeto-bancario-1.0-SNAPSHOT.jar
    ```

3.  **Execução sem Maven:**
    ```bash
    cd projeto-bancario/src/main/java
    javac br/com/banco/*.java
    java br.com.banco.Main
    ```

## Classes Principais

* **`Conta` (Abstract):** Classe base abstrata que define a estrutura e o comportamento comum a todos os tipos de contas bancárias.
* **`ContaCorrente`:** Subclasse de `Conta` que representa uma conta corrente e implementa a funcionalidade de limite de cheque especial.
* **`ContaPoupança`:** Subclasse de `Conta` que representa uma conta poupança e implementa a lógica de aplicação de rendimentos.
* **`Banco`:** Classe responsável por gerenciar o conjunto de contas do banco, oferecendo métodos para adicionar, buscar e listar as contas existentes.
* **`Cliente`:** Classe que representa um cliente do banco, armazenando informações básicas como nome e CPF.
* **`Main`:** Classe principal que contém o método `main`, responsável por inicializar e executar o sistema bancário, demonstrando suas funcionalidades.
