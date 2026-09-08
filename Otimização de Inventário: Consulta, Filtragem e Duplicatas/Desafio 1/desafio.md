# Sistema de Gerenciamento de Inventário

Este documento apresenta a especificação e a implementação em **Java** para o sistema básico de gerenciamento de inventário utilizando `HashMap`.

## 📋 Descrição do Desafio

O objetivo é criar uma função que verifique a quantidade disponível de um produto em estoque a partir do nome digitado pelo usuário. Os dados de produtos e quantidades são armazenados em um `HashMap`.

A função deve seguir as seguintes regras de negócio:
* Se o produto existir no estoque e a quantidade for **maior que zero**, retorna: `"Produto disponivel: X em estoque."` (onde X é a quantidade).
* Se o produto existir no estoque, mas a quantidade for **igual a zero**, retorna: `"Produto indisponivel."`.
* Se o produto **não for encontrado** no estoque, retorna: `"Produto nao encontrado."`.

---

## 📥 Entrada e Saída

* **Entrada:** `String` (Nome do produto).
* **Saída:** `String` (Mensagem correspondente ao status do estoque).

### Exemplos de Teste

| Entrada | Saída |
| :--- | :--- |
| `Switch` | `Produto disponivel: 10 em estoque.` |
| `Servidor` | `Produto disponivel: 5 em estoque.` |
| `Monitor` | `Produto nao encontrado.` |

---

