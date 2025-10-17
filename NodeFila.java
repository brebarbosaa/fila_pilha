public class NodeFila { //nó da fila
    private Elemento dado;
    NodeFila proximo;

    NodeFila(Elemento dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public Elemento getDado() {
        return dado;
    }
}

