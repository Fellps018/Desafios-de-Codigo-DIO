# Sistema de Inventário - Filtragem de Produtos por Preço

Este documento apresenta a especificação, as regras de negócio e a solução em Java para o sistema de filtragem de produtos com base em uma faixa de preço utilizando Java Streams.

---

## 📋 Descrição
Você está desenvolvendo um sistema de inventário para uma loja. O sistema precisa filtrar produtos por faixa de preço. Cada produto tem um nome, categoria e preço. Crie um programa que leia os dados dos produtos e retorne a lista de produtos dentro de uma faixa de preço específica.

## 📥 Entrada
Um número inteiro `n` representando a quantidade de produtos.

Para cada produto, serão fornecidos:
* **nome:** uma string representando o nome do produto
* **categoria:** uma string representando a categoria do produto
* **preco:** um número decimal representando o preço do produto

No final, serão fornecidos dois números decimais `preco_min` e `preco_max` representando a faixa de preço delimitadora.

## 📤 Saída
Uma string contendo todos os produtos dentro da faixa de preço especificada (inclusive), cada um em uma linha no formato:
`Nome: [nome] - Preco: [preco]` (com duas casas decimais).

---

## 📊 Exemplos de Casos de Teste

| Entrada | Saída |
| :--- | :--- |
| 2<br>Roteador<br>Rede<br>250.00<br>Switch<br>Rede<br>400.00<br>100.00<br>300.00 | Nome: Roteador - Preco: 250.00 |
| 3<br>Teclado<br>Periferico<br>150.00<br>Mouse<br>Periferico<br>80.00<br>Monitor<br>Periferico<br>900.00<br>100.00<br>200.00 | Nome: Teclado - Preco: 150.00 |
| 4<br>Notebook<br>Computador<br>4500.00<br>Desktop<br>Computador<br>3000.00<br>Tablet<br>Dispositivo<br>2000.00<br>Smartphone<br>Dispositivo<br>3500.00<br>2500.00<br>4000.00 | Nome: Desktop - Preco: 3000.00<br>Nome: Smartphone - Preco: 3500.00 |

---
