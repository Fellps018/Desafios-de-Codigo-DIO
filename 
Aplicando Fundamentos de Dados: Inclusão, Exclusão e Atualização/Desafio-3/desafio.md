# Desafio de Código: Atualização de Elementos em Tabela com HashMap

## Descrição
Implemente o método `update` na classe `Table` que permita ao usuário atualizar o nome de um elemento na tabela. O usuário deve informar o ID do elemento e o novo nome. O método deve verificar se a chave (`ID`) existe na tabela. Se existir, o valor associado a essa chave deve ser atualizado com o novo nome. Caso contrário, exiba a mensagem `"ID nao encontrado."`.

Após todas as atualizações, o programa deve exibir a tabela atualizada com todos os nomes, um abaixo do outro.

### Instrução
* **Implementar o Método `update`:** Você deve completar o método `update` que altera o valor de um elemento baseado no seu `ID`.
* Utilize o método `containsKey` para verificar a existência do ID e o método `put` para atualizar o valor associado à chave.

## Entrada
* Um inteiro `n` representando a quantidade de atualizações a serem feitas.
* Seguido por `n` pares de entradas onde cada par contém:
  * Um inteiro (`ID`) que representa a chave do elemento na tabela.
  * Uma string (`novo nome`) que representa o novo valor a ser associado à chave.

## Saída
* A lista de nomes atualizados na tabela, um abaixo do outro.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas com base em um mapa populado internamente (A-F) para os testes.

| Entrada | Saída |
| :--- | :--- |
| `2`<br>`5`<br>`Erica`<br>`6`<br>`Fabio` | `Alice`<br>`Bob`<br>`Charlie`<br>`Debora`<br>`Erica`<br>`Fabio` |
| `3`<br>`1`<br>`Angela`<br>`2`<br>`Bruce`<br>`3`<br>`Chris` | `Angela`<br>`Bruce`<br>`Chris`<br>`Debora`<br>`Eduardo`<br>`Fernanda` |
| `4`<br>`2`<br>`Brad`<br>`3`<br>`Charlie`<br>`4`<br>`Derek`<br>`5`<br>`Emma` | `Alice`<br>`Brad`<br>`Charlie`<br>`Derek`<br>`Emma`<br>`Fernanda` |

---
