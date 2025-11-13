# Exercícios de Programação em Java

Este repositório contém a resolução de 10 exercícios básicos de programação em Java, desenvolvidos como prática de conceitos fundamentais da linguagem. O código foi implementado em um único arquivo (`ExerciciosJava.java`) para simplificar a compilação e execução.

O desenvolvimento foi focado em boas práticas, clareza, e na adição de comentários detalhados e uma formatação "humanizada" para fins didáticos.

---

## Exercícios Implementados

1.  **Par ou Ímpar**: Lê um número inteiro e verifica se é par ou ímpar, com tratamento de erros de entrada.
2.  **Calculadora Simples**: Realiza operações aritméticas básicas (+, -, *, /) entre dois números, utilizando `switch` e tratando divisão por zero.
3.  **Máximo de Três**: Um método que retorna o maior valor entre três números inteiros.
4.  **Fatorial Iterativo**: Calcula o fatorial de um número (0-20) de forma iterativa, usando `long` para prevenir overflow.
5.  **Fibonacci**: Imprime os *n* primeiros termos da sequência de Fibonacci usando um laço `while`.
6.  **Soma e Média de Vetor**: Calcula a soma, média, mínimo e máximo de um vetor de números `double`.
7.  **Contagem de Ocorrências**: Conta quantas vezes um número específico aparece em um vetor de inteiros.
8.  **Ordenação por Seleção (Selection Sort)**: Implementa o algoritmo *Selection Sort* para ordenar um vetor e exibe o antes e o depois.
9.  **Busca Binária**: Implementa o algoritmo de busca binária em um vetor ordenado para encontrar o índice de um elemento.
10. **Menu Interativo com Lista de Números**: Um programa de console que permite ao usuário manipular uma lista de números (inserir, listar, somar, limpar) até que a opção de sair seja escolhida.

---

## Como Compilar e Executar

Para testar os exercícios, você precisa ter o **Java Development Kit (JDK)** instalado em sua máquina.

1.  **Abra um terminal** na pasta onde o arquivo `ExerciciosJava.java` está localizado.

2.  **Compile o arquivo** com o seguinte comando:
    ```bash
    javac ExerciciosJava.java
    ```

3.  **Execute o programa**:
    ```bash
    java ExerciciosJava
    ```

---

## Como Testar um Exercício Específico

Por padrão, o programa está configurado para executar o **Exercício 10 (Menu Interativo)**.

Para executar um exercício diferente, siga os passos:

1.  Abra o arquivo `ExerciciosJava.java` em um editor de texto.
2.  Navegue até o método `main`.
3.  **Comente** a linha do exercício que está ativo (adicionando `//` no início).
4.  **Descomente** a linha do exercício que você deseja testar (removendo o `//` do início).

**Exemplo para testar o Exercício 1 (Par ou Ímpar):**

```java
public static void main(String[] args) {
    // O método main pode ser usado para testar cada um dos exercícios individualmente.
    // Descomente a chamada do método que deseja executar.

    exercicio1_ParOuImpar(); // Linha descomentada
    // exercicio2_CalculadoraSimples();
    // exercicio3_MaximoDeTres();
    // ...
    // exercicio10_MenuInterativo(); // Linha comentada
}
