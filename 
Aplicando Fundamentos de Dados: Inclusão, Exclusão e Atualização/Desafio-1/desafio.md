# Desafio de Código: Inserção de Elementos em Tabela com HashMap

## Descrição
Implemente um programa onde o usuário informa a quantidade de elementos que deseja inserir em uma tabela. Em seguida, o usuário deve inserir o ID e o nome de cada elemento. A tabela deve armazenar esses elementos e, ao final, o programa deve exibir todos os nomes armazenados na tabela, um abaixo do outro.

### Instrução
* **Implementar o Método `insert`:** Você deve completar o método `insert` que insere um par (ID, nome) na tabela.
* Utilize o método `put` do `HashMap` para adicionar o par chave-valor ao mapa.

## Entrada
* Um inteiro `n` representando a quantidade de elementos a serem inseridos.
* Seguido por `n` pares de entradas onde cada par contém um inteiro (`ID`) e uma string (`nome`).

## Saída
* A lista de nomes armazenados na tabela, um abaixo do outro.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| :--- | :--- |
| `2`<br>`1`<br>`Anne`<br>`2`<br>`Marcos` | `Anne`<br>`Marcos` |
| `3`<br>`1`<br>`Luiz`<br>`2`<br>`Mariana`<br>`3`<br>`Carlos` | `Luiz`<br>`Mariana`<br>`Carlos` |
| `4`<br>`1`<br>`Bob`<br>`2`<br>`Maria`<br>`3`<br>`Yule`<br>`4`<br>`Sara` | `Bob`<br>`Maria`<br>`Yule`<br>`Sara` |

---
