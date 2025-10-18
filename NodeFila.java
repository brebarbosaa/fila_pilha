public class NodeFila { //nó da fila
    Elemento dado;  // Armazena o cliente como um Elemento
    NodeFila proximo;
    Elemento elemento;

    NodeFila(Elemento e) {
        this.dado = e;
        this.proximo = null;
    }

    public Elemento getDado() {
        return dado;
    }
}
