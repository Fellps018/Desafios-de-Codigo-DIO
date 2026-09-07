# Desafio de Código: Remoção de Elementos em Tabela com HashMap

## Descrição
Implemente um programa que permita ao usuário remover elementos de uma tabela pré-populada utilizando o ID. O usuário deve informar a quantidade de elementos que deseja remover e, em seguida, fornecer os IDs desses elementos. O programa deve exibir os nomes restantes na tabela após todas as remoções, um abaixo do outro.

### Instrução
* **Completar o Método de Remoção:** Você deve completar o método `delete` que remove um elemento da tabela usando a chave (`ID`) fornecida.
* Utilize o método `remove` do `HashMap` para deletar a chave correspondente.

## Entrada
* Um inteiro `n` representando a quantidade de elementos a serem removidos.
* Seguido por `n` IDs de elementos a serem removidos (um por linha).

## Saída
* A lista de nomes restantes na tabela, um abaixo do outro.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas com base em um mapa populado internamente para os testes.

| Entrada | Saída |
| :--- | :--- |
| `2`<br>`6`<br>`3` | `Alice`<br>`Bob`<br>`Paula`<br>`Gabriela` |
| `3`<br>`5`<br>`2`<br>`1` | `Charlie`<br>`Paula`<br>`Luiza` |
| `4`<br>`1`<br>`2`<br>`3`<br>`4` | `Gabriela`<br>`Luiza` |

---
