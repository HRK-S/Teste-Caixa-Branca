Teste Caixa Branca

 Grafo De Fluxo

```mermaid
graph TD
    A((Nó 1: Início)) --> B((Nó 2: Bloco Try));
    B --> C((Nó 3: Decisao if rs.next));
    C -- Verdadeiro --> D((Nó 4: Bloco 'True'));
    C -- Falso --> F((Nó 6: Return));
    D --> F;
    B -- Exceção --> E((Nó 5: Bloco 'Catch'));
    E --> F;

```

V(G) = 3 REGIÕES.

V(G) = 7 ARESTAS.

V(G) = 6 NÓS.

CÁLCULO : V(G) = 7 - 6 = 1 + 2 = 3



Caminho 1 = 1; 2; 3; 4; 6; 

Caminho 2 = 1; 2; 3; 6;

Caminho 3 = 1; 2; 5; 6;