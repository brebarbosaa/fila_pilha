public class Fila { //fila do atendimento
    NodeFila frente;
    NodeFila tras;

    Fila(){
        frente = null;
        tras = null;
    }

    boolean isEmpty(){ //verifica caso esteja vazia
        if (frente == null){
            return true;
        }
        else {
            return false;
        }
    }

    void enqueue(String nome, String id, String motivo){ //add cliente no final
        NodeFila novo = new NodeFila(nome, id, motivo);

        if (isEmpty()){
            frente = novo;
            tras = novo;
        }
        else {
            tras.proximo = novo;
            tras = novo;
        }
        System.out.println("Cliente " + nome + " adicionado à fila. ");
    }

    void dequeue(){ //remove cliente da frente
        if (isEmpty()){
            System.out.println("A fila está vazia. Nenhum cliente esperando atendimento. ");
        }
        else {
            System.out.println("Cliente atendido: " + frente.nomeCliente);
            frente = frente.proximo;
            if (frente == null){
                tras = null;
            }
        }
    }

    void exibirFila(){
        if (isEmpty()){
            System.out.println("Fila vazia.");
        }
        else {
            System.out.println("\n *** Fila de Atendimento *** ");
            NodeFila atual = frente;
            while (atual != null){
                System.out.println("Cliente: " + atual.nomeCliente + " | ID: " + atual.idCliente + " | Motivo: " + atual.motivo);
                atual = atual.proximo;
            }
        }
    }
}
