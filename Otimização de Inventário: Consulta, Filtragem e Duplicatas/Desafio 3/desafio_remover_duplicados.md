# Desafio de Programação: Remover Produtos Duplicados

## Descrição
Você está trabalhando em um sistema de gerenciamento de inventário para uma empresa de tecnologia e precisa de uma função que recebe uma lista de produtos de TI e remove quaisquer duplicados. A lista pode conter produtos com o mesmo nome, e você precisa garantir que cada produto apareça apenas uma vez na lista final. Escreva uma função que receba uma lista de produtos e retorne uma nova lista com os produtos únicos, mantendo a ordem de sua primeira ocorrência.

## Objetivo do Desafio
Você deve completar o método `main` para chamar a função `removerDuplicados` e armazenar o resultado. Em seguida, deve imprimir a lista de produtos únicos. A função deve ser capaz de lidar com produtos que diferem apenas em letras maiúsculas e minúsculas, ou seja, `"USB Drive"` e `"usb drive"` devem ser considerados duplicados.

## Entrada
A função receberá uma lista de strings `produtos` onde cada string representa o nome de um produto de TI. A lista pode conter produtos duplicados.

## Saída
A função deve retornar uma lista de strings onde cada string representa o nome de um produto de TI, sem duplicatas e na mesma ordem em que apareceram pela primeira vez na lista de entrada.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.

| Entrada | Saída |
| :--- | :--- |
| 6<br>USB Drive<br>usb drive<br>External HDD<br>External HDD<br>USB DRIVE<br>Pen Drive | Produtos unicos:<br>USB Drive<br>External HDD<br>Pen Drive |
| 6<br>Printer<br>Scanner<br>Speaker<br>Scanner<br>Speaker<br>Printer | Produtos unicos:<br>Printer<br>Scanner<br>Speaker |
| 8<br>Router<br>Switch<br>Router<br>Modem<br>Switch<br>Printer<br>Laptop<br>Router | Produtos unicos:<br>Router<br>Switch<br>Modem<br>Printer<br>Laptop |

---

