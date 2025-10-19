# Sistema de Gerenciamento de Atendimento ao Cliente
---

##  Descrição do Projeto

Este projeto implementa um sistema de gerenciamento de atendimento ao cliente utilizando estruturas de dados personalizadas em Java. O sistema gerencia tanto a fila de atendimento quanto o histórico de solicitações através de implementações próprias de lista encadeada.

--- 

## Estrutura do Projeto

├── Main.java # Classe principal com testes

├── Fila.java # Implementação da fila de atendimento

├── Pilha.java # Implementação do histórico

├── Elemento.java # Classe que armazena os dados

├── NodeFila.java # Nó para a estrutura de fila

└── NodePilha.java # Nó para a estrutura de pilha

---

## Como Executar

1. **Compilar o projeto:**
   ```bash
   javac *.java
2. **Executar o programa:**
   ```bash
   java Main

---

## Explicação:

As estruturas utilizadas pelo sistema são:

#### 1. **Fila (FIFO) - Atendimento**
- Implementada com lista encadeada usando `NodeFila`
- Cada nó contém um `Elemento` com dados do cliente
- Operações: `enqueue` (adicionar no final) e `dequeue` (remover do início)

#### 2. **Pilha (LIFO) - Histórico**
- Implementada com lista encadeada usando `NodePilha`
- Cada nó contém um `Elemento` com dados da solicitação
- Operações: `adicionar` (push) e `remover` (pop)

### Classes Principais

#### **Elemento.java**
- Classe unificada que armazena dados tanto para clientes quanto solicitações
- Usa parâmetro `tipo` para diferenciar entre "cliente" e "solicitacao"
- Atributos reutilizados conforme o tipo de elemento

#### **NodePilha.java & NodeFila.java**
- Implementam os nós das listas encadeadas
- Cada nó contém:
  - `Elemento dado`: os dados armazenados
  - `proximo`: referência para o próximo nó

#### **Cliente.java**
- Entidade que representa um cliente no sistema
- Atributos: nome, ID e descrição
- Fornece getters e setters para acesso aos dados

#### **Pilha.java**
- Implementa o histórico de solicitações (LIFO)
- Métodos principais:
  - `adicionar()`: adiciona no topo
  - `remover()`: remove do topo
  - `exibirHistorico()`: mostra todo o histórico

#### **Fila.java**
- Implementa a fila de atendimento (FIFO)
- Métodos principais:
  - `enqueue()`: adiciona no final
  - `dequeue()`: remove do início
  - `exibirFila()`: mostra toda a fila

### Fluxo de Dados

1. **Cliente chega** → `Fila.enqueue()` cria `Elemento` do tipo "cliente"
2. **Atendimento** → `Fila.dequeue()` remove cliente da frente
3. **Registro** → `Pilha.adicionar()` cria `Elemento` do tipo "solicitacao"
4. **Consulta** → Métodos `exibir` mostram o estado atual das estruturas

## Funcionalidades

### Fila de Atendimento
- Adicionar clientes à fila
- Atender próximo cliente
- Verificar se a fila está vazia
- Exibir toda a fila de atendimento

### Histórico de Solicitações (Pilha)
- Adicionar solicitações ao histórico
- Remover solicitações do histórico (LIFO)
- Verificar se a pilha está vazia
- Exibir todo o histórico

---

## Desenvolvido por:
Alana Queiroz, Brenda Barbosa e Leticia Vieira
