# Desafio: Contador de Vogais

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge)

**Contando o número de vogais em uma string em Java**

</div>

---

## Descrição do Problema

O objetivo deste desafio é criar um programa em Java que receba uma string (frase ou palavra) como entrada do usuário e, em seguida, conte o número total de vogais (a, e, i, o, u, maiúsculas e minúsculas) presentes nessa string. O programa deve exibir o resultado final.

## Solução

A solução implementada percorre a string de entrada caractere por caractere. Para cada caractere, verifica-se se ele é uma vogal (considerando tanto letras maiúsculas quanto minúsculas). Um contador é incrementado cada vez que uma vogal é encontrada. A entrada do usuário é lida utilizando a classe `Scanner`.

## 📚 Conceitos Aprendidos/Reforçados

Durante a resolução deste desafio, os seguintes conceitos foram praticados:

-   **Entrada de Dados:** Utilização da classe `Scanner` para ler strings do console.
-   **Manipulação de Strings:** Acesso a caracteres individuais de uma string (`charAt()`) e conversão para minúsculas (`toLowerCase()`).
-   **Laços de Repetição:** Uso do laço `for` para iterar sobre os caracteres da string.
-   **Estruturas Condicionais:** Uso de `if` ou `switch` para verificar se um caractere é uma vogal.
-   **Contadores:** Utilização de uma variável para acumular a contagem de vogais.
-   **Saída de Dados:** Exibição de mensagens no console (`System.out.println`).

## 📈 Possíveis Melhorias

-   Adicionar tratamento de exceções para entradas nulas ou vazias.
-   Utilizar expressões regulares para uma abordagem mais concisa na identificação de vogais.
-   Criar uma função separada para a lógica de contagem de vogais, promovendo a reutilização de código.


