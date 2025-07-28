# Desafio: Par ou Ímpar

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)


</div>

---

## Descrição do Problema

O objetivo deste desafio é criar um programa em Java que determine se um número inteiro fornecido pelo usuário é par ou ímpar. O programa deve solicitar a entrada do número e, em seguida, exibir uma mensagem indicando o resultado.

##  Solução

A solução implementada utiliza o operador de módulo (`%`) para verificar a paridade do número. Se o resto da divisão do número por 2 for 0, o número é par; caso contrário, é ímpar. A entrada do usuário é lida utilizando a classe `Scanner`.


##  Conceitos Aprendidos/Reforçados

Durante a resolução deste desafio, os seguintes conceitos foram praticados:

-   **Entrada de Dados:** Utilização da classe `Scanner` para ler dados do console.
-   **Estruturas Condicionais:** Uso de `if-else` para tomar decisões com base na paridade do número.
-   **Operadores Aritméticos:** Aplicação do operador de módulo (`%`) para verificar o resto de uma divisão.
-   **Tipos de Dados:** Manipulação de números inteiros (`int`).
-   **Saída de Dados:** Exibição de mensagens no console (`System.out.println`).

##  Possíveis Melhorias

-   Adicionar tratamento de exceções para entradas não numéricas.
-   Implementar um loop para permitir que o usuário verifique múltiplos números sem reiniciar o programa.
-   Criar uma função separada para a lógica de verificação de paridade, promovendo a reutilização de código.


