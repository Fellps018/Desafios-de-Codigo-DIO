# Exercício: Contador de Métodos HTTP em Java

Este documento contém a descrição e a solução para o problema de contagem de métodos HTTP mais frequentes a partir de uma lista fornecida.

## Descrição
Você está desenvolvendo um programa para contar e identificar o método HTTP mais frequente em uma lista fornecida. O algoritmo deve analisar uma string que contém métodos HTTP separados por vírgulas, contar quantas vezes cada método aparece e retornar o método mais frequente junto com sua descrição. O programa deve identificar o método mais frequente e fornecer uma breve descrição de sua função.

Os métodos HTTP reconhecidos são "GET", "POST", "PUT" e "DELETE". Cada método tem um propósito específico:
* **GET**: O GET solicita a representacao de um recurso.
* **POST**: O POST envia dados para processamento.
* **PUT**: O PUT atualiza todos os dados de um recurso.
* **DELETE**: O DELETE remove um recurso especifico.

Na função `findMostFrequentMethod`, complete o `TODO` que conta a ocorrência de cada método HTTP e armazena essa contagem no mapa `methodCounts`. Utilize um loop para iterar pelos métodos no array `methods`. Para cada método, remova espaços extras usando `trim()` e incremente a contagem no mapa `methodCounts`.

## Entrada
Métodos HTTP: Uma string contendo métodos HTTP separados por vírgulas. A string pode conter espaços extras ao redor dos métodos e métodos podem estar em maiúsculas.

## Saída
Retorna uma string no formato `"Método: Contagem - Descrição"`, onde:
* **Método** é o método HTTP mais frequente.
* **Contagem** é o número de vezes que o método aparece na entrada.
* **Descrição** é uma breve explicação do que o método faz.

### Atenção
Quando um método não é reconhecido, a saída deve listar o método seguido pelo número de ocorrências e pela descrição de erro:
* **Entrada**: `DEL, DEL`
* **Saída**: `DEL: 2 - Metodo nao reconhecido.`

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.

| Entrada | Saída |
| :--- | :--- |
| GET, GET, POST, DELETE, PUT | GET: 2 - O GET solicita a representacao de um recurso. |
| GET, PUT, POST, GET, PUT, DELETE, PUT | PUT: 3 - O PUT atualiza todos os dados de um recurso. |
| GET, DELETE, DELETE, POST, PUT, GET, DELETE, POST, PUT, DELETE | DELETE: 4 - O DELETE remove um recurso da URL. |

---

## Solução em Java

Abaixo está o código-fonte completo implementando a lógica solicitada:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpMethodCounter {
    public static String findMostFrequentMethod(String input) {
        String[] methods = input.split(",");
        Map<String, Integer> methodCounts = new HashMap<>();

        // Contagem da ocorrência de cada método HTTP limpo de espaços extras
        for (String method : methods) {
            String cleanedMethod = method.trim();
            methodCounts.put(cleanedMethod, methodCounts.getOrDefault(cleanedMethod, 0) + 1);
        }

        // Encontrar o metodo com a maior contagem
        String mostFrequentMethod = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : methodCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentMethod = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Descricao do metodo
        String description = "";
        switch (mostFrequentMethod) {
            case "GET":
                description = "O GET solicita a representacao de um recurso.";
                break;
            case "POST":
                description = "O POST envia dados para processamento.";
                break;
            case "PUT":
                description = "O PUT atualiza todos os dados de um recurso.";
                break;
            case "DELETE":
                description = "O DELETE remove um recurso especifico.";
                break;
            default:
                description = "Metodo nao reconhecido.";
        }

        return mostFrequentMethod + ": " + maxCount + " - " + description;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = findMostFrequentMethod(input);
        System.out.println(output);
        scanner.close();
    }
}
```