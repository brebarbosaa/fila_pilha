// pilha usada para manter um histórico de solicitações de serviço

import java.sql.SQLOutput;

public class Pilha {
    private NodePilha topo;

    public Pilha(){
        this.topo = null;
    }

    public boolean vazia(){
        return topo == null;
    }

    public void adicionar(String id, String descricao, String dataHora){
        Elemento e = new Elemento("solicitacao",id, descricao, dataHora);
        NodePilha novo = new NodePilha(e);
        
        novo.proximo = topo;
        topo = novo;
        System.out.println("Adicionado ao histórico: " + e.getDescricao());
    }

    public void remover(){
        if (vazia()){
            System.out.println("Histórico vazio ");
            return;
        }

        NodePilha removido = topo;
        topo = topo.proximo;
        System.out.println("Removido do histórico: " + removido.getDado().getDescricao());

    }

    public void exibirHistorico(){
        if (vazia()){
            System.out.println("Histórico vazio");
            return;
        }

        System.out.println("----- Histórico -----");
        NodePilha atual = topo;
        while (atual != null){
            Elemento e = atual.getDado();
            System.out.println("ID: " + e.getId());
            System.out.println("Descrição: " + e.getDescricao());
            System.out.println("Data e Hora: " + e.getDataHora());
            System.out.println("----------------------");
            atual = atual.proximo;
        }

    }
}
