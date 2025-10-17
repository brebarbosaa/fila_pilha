public class NodeFila { //nó da fila
    String nomeCliente;
    String idCliente;
    String motivo;
    NodeFila proximo;

    NodeFila(String nome, String id, String motivo) {
        this.nomeCliente = nome;
        this.idCliente = id;
        this.motivo = motivo;
        this.proximo = null;
    }
}
