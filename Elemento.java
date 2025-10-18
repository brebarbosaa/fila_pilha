public class Elemento {
    private String id;
    private String descricao;
    private String dataHora;
    String nomeCliente;
    private String motivo;

    // Construtor unificado com um tipo de elemento
    public Elemento(String tipo, String a, String b, String c) {
        if (tipo.equals("solicitacao")) {
            this.id = a;
            this.descricao = b;
            this.dataHora = c;
            this.nomeCliente = null;
            this.motivo = null;
        } else if (tipo.equals("cliente")) {
            this.nomeCliente = a;
            this.id = b; // idCliente
            this.motivo = c;
            this.descricao = null;
            this.dataHora = null;
        }
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
