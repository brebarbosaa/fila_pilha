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
        NodePilha novo = new NodePilha(id, descricao, dataHora);
        novo.proximo = topo;
        topo = novo;
        System.out.println("Adicionado ao histórico: " + descricao);
    }

    public void remover(){
        if (vazia()){
            System.out.println("Histórico vazio ");
            return;
        }

        NodePilha removido = topo;
        topo = topo.proximo;
        System.out.println("Removido do histórico: " + removido.descricao);

    }

    public void exibirHistorico(){
        if (vazia()){
            System.out.println("Histórico vazio");
            return;
        }

        System.out.println("----- Histórico -----");
        NodePilha atual = topo;
        while (atual != null){
            System.out.println("ID: " + atual.id);
            System.out.println("Descrição: " + atual.descricao);
            System.out.println("Data e Hora: " + atual.dataHora);
            System.out.println("------------");
            atual = atual.proximo;
        }

    }
}
