# Sistema de Gerenciamento de Funcionários

Este documento apresenta uma solução em Python para o problema de gerenciamento de funcionários, onde os funcionários são inseridos em uma lista e exibidos em ordem crescente de ID.

## Descrição do Problema

Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários de uma empresa. Cada funcionário tem um ID, nome e cargo. Crie um programa que adicione funcionários a uma "tabela" (lista) e liste todos os funcionários ordenados pelo ID.

### Entrada
1. Um número inteiro `n` representando a quantidade de funcionários.
2. Para cada funcionário, serão fornecidos dois dados:
   - **Nome**: uma string representando o nome do funcionário.
   - **Cargo**: uma string representando o cargo do funcionário.

*Nota: O ID é gerado automaticamente com base na ordem de inserção (começando em 1).*

### Saída
String contendo todos os funcionários listados em ordem crescente de ID, cada um em uma linha no formato:
`ID: Nome - Cargo`

---

## Exemplos

| Entrada | Saída |
| :--- | :--- |
| 2<br>Mariana Desenvolvedora<br>Samuel Analista | 1: Mariana - Desenvolvedora<br>2: Samuel - Analista |
| 3<br>Simone Gerente<br>Victor Desenvolvedor<br>Ana Analista | 1: Simone - Gerente<br>2: Victor - Desenvolvedor<br>3: Ana - Analista |
| 3<br>Patricia Coordenadora<br>Fabio Arquiteto<br>Marcelo Gerente | 1: Patricia - Coordenadora<br>2: Fabio - Arquiteto<br>3: Marcelo - Gerente |

---
