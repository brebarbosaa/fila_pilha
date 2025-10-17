public class NodePilha {
    private Elemento dado;
    NodePilha proximo;

    public NodePilha(Elemento dado){
        this.dado = dado;
        this.proximo = null;
    }

    public Elemento getDado() {
        return dado;
    }
}
