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

## Solução Sugerida em Java (Stream API)

Abaixo está uma implementação em Java que resolve o problema utilizando a biblioteca Streams e um `LinkedHashSet` auxiliar para identificar duplicados sem diferenciar maiúsculas/minúsculas, preservando a ordem original de inserção.

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GerenciadorInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le a quantidade de produtos
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume a quebra de linha

        List<String> produtos = new ArrayList<>();

        // Le os nomes dos produtos
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextLine()) {
                produtos.add(scanner.nextLine());
            }
        }

        // Chama a funcao para remover duplicados
        List<String> produtosUnicos = removerDuplicados(produtos);

        // Imprime o resultado formatado
        System.out.println("Produtos unicos:");
        for (String produto : produtosUnicos) {
            System.out.println(produto);
        }

        scanner.close();
    }

    public static List<String> removerDuplicados(List<String> produtos) {
        Set<String> vistos = new HashSet<>();
        
        // Filtra a lista mantendo a primeira ocorrencia (case-insensitive)
        return produtos.stream()
                .filter(p -> vistos.add(p.toLowerCase()))
                .toList(); // Para Java 16+ ou use .collect(Collectors.toList()) para versoes anteriores
    }
}
```
