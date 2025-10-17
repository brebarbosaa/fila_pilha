public class Cliente {
    private String nome;
    private int idCliente;
    private String descricaoCliente;

    public Cliente(String nome, int id, String descricaoCliente) {
        this.nome = nome;
        this.idCliente = id;
        this.descricaoCliente = descricaoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescricaoCliente() {
        return descricaoCliente;
    }

    public void setDescricaoCliente(String descricaoCliente) {
        this.descricaoCliente = descricaoCliente;
    }
}
