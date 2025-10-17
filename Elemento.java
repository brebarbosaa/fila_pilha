public class Elemento {
    String id;
    String descricao;
    String dataHora;
    private String nomeCliente;
    private String motivo;

    // Construtor para solicitações de serviço e clientes
    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora; 
    }

    public Elemento(String nomeCliente, String idCliente, String motivo) {
        this.nomeCliente = nomeCliente;
        this.id = idCliente; // Reutilizando o campo 'id' para o idCliente
        this.motivo = motivo;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getMotivo() {
        return motivo;
    }
}
