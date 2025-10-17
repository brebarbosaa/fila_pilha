public class NodePilha {
    private String id;
    private String descricao;
    private String dataHora;
    NodePilha proximo;

    public NodePilha(String id, String descricao, String dataHora, String proximo){
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.proximo = null;
    }
}
