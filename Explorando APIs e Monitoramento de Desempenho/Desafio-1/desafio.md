# Desafio: Validação de Endpoints de API

## Descrição
Você está desenvolvendo um programa para validar endpoints de API. O algoritmo deve verificar se o endpoint fornecido segue o formato padrão `/api/{recurso}` e seus sub-recursos. O formato válido é iniciado por `/api/` seguido por um ou mais segmentos separados por barras (`/`), onde cada segmento é uma palavra alfanumérica.

### Validação com Expressão Regular
Para validar o formato do endpoint, você deve usar uma expressão regular. A expressão regular precisa:
* Garantir que o endpoint comece com `/api/`.
* Seguir com um ou mais segmentos, onde cada segmento é uma palavra alfanumérica.
* Os segmentos devem ser separados por barras (`/`).
* O endpoint deve terminar após o último segmento.

### Exemplo de Expressão Regular
**Expressão Regular:** `^/api/\w+(/\w+)*$`

* `^/api/` — O endpoint deve começar com `/api/`.
* `\w+` — Deve haver pelo menos uma palavra alfanumérica após `/api/`.
* `(/\w+)*` — Pode haver zero ou mais segmentos adicionais, cada um separado por barras (`/`).
* `$` — O endpoint deve terminar após o último segmento.

---

## Entrada
* **Endpoint:** Uma string representando o endpoint da API a ser validado.

## Saída
* `"Endpoint valido."` se o endpoint está no formato correto.
* `"Endpoint invalido."` se o endpoint não está no formato correto.

---

## Exemplos

| Entrada | Saída |
| :--- | :--- |
| `/api/users` | `Endpoint valido.` |
| `/api/products` | `Endpoint valido.` |
| `/service/users/123` | `Endpoint invalido.` |

---

