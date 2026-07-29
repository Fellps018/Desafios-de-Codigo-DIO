# Sistema de Recursos Humanos - Atualização de Salários

## Descrição
Você está desenvolvendo um sistema de recursos humanos para uma empresa. O sistema precisa aplicar um percentual de aumento de salário para todos os funcionários cadastrados. Cada funcionário possui nome, departamento e salário. Crie um programa que leia os dados dos funcionários, aplique o percentual de aumento fornecido e retorne a lista de funcionários com seus salários atualizados.

## Entrada
* Um número inteiro `n` representando a quantidade de funcionários.
* Para cada funcionário, serão fornecidos:
  * **nome** (uma string representando o nome do funcionário)
  * **departamento** (uma string representando o departamento do funcionário)
  * **salario** (um número decimal representando o salário do funcionário)
* Um número decimal **aumento** representando o percentual de aumento (ex: `10` para 10%).

## Saída
`String` contendo todos os funcionários com seus novos salários, cada um em uma linha no formato: 
`Nome: X - Novo Salario: Y`

Onde **X** representa o nome e **Y** o salário atualizado com duas casas decimais.
