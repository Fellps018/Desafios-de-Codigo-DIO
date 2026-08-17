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

## 💻 Implementação em Java

Abaixo está o código-fonte completo utilizando a classe `Scanner` para entrada de dados e `HashMap` para o armazenamento do inventário.

```java
import java.util.HashMap;
import java.util.Scanner;

public class GerenciadorInventario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o estoque e armazena os produtos simulados
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Switch", 10);
        estoque.put("Servidor", 5);
        estoque.put("Roteador", 0); // Exemplo de produto indisponível

        // Leitura do nome do produto digitado pelo usuário
        String produtoBuscado = scanner.nextLine();

        // Processamento e exibição do resultado
        String mensagemResultado = verificarEstoque(produtoBuscado, estoque);
        System.out.println(mensagemResultado);

        scanner.close();
    }

    /**
     * Verifica a disponibilidade do produto no HashMap do estoque.
     * 
     * @param produto Nome do produto a ser consultado
     * @param estoque HashMap contendo o inventário atual
     * @return String com a mensagem de status do produto
     */
    public static String verificarEstoque(String produto, HashMap<String, Integer> estoque) {
        // Verifica se a chave existe no HashMap
        if (estoque.containsKey(produto)) {
            int quantidade = estoque.get(produto);
            
            // Verifica se a quantidade é maior que zero
            if (quantidade > 0) {
                return "Produto disponivel: " + quantidade + " em estoque.";
            } else {
                return "Produto indisponivel.";
            }
        } else {
            return "Produto nao encontrado.";
        }
    }
}
```