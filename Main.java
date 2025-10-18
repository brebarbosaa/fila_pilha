public class Main {
    public static void main(String[] args){
        // Instanciação das estruturas
        Fila filaAtendimento = new Fila();
        Pilha historicoSolicitacoes = new Pilha();

        System.out.println("--- Teste fila ---");

        // Adiciona clientes
        System.out.println("\n--- Adicionando Clientes à Fila ---");
        filaAtendimento.enqueue("Maria Silva", "CLI001", "Dúvida sobre produto");
        filaAtendimento.enqueue("João Souza", "CLI002", "Reclamação de serviço");
        filaAtendimento.enqueue("Ana Costa", "CLI003", "Solicitação de reembolso");
        filaAtendimento.enqueue("Pedro Alves", "CLI004", "Informações de entrega");
        filaAtendimento.enqueue("Carla Dias", "CLI005", "Agendamento de visita");

        filaAtendimento.exibirFila();

        // Atende 2 clientes
        System.out.println("\n Atendendo ");
        filaAtendimento.dequeue();
        filaAtendimento.dequeue();

        filaAtendimento.exibirFila();
        System.out.println("Fila está vazia? " + filaAtendimento.isEmpty());


        System.out.println("\n--- Teste pilha---");

        // Adiciona solicitações
        System.out.println("\n Adicionando Solicitações ao Histórico ");
        historicoSolicitacoes.adicionar("REQ001", "Instalação de software", "2024-08-20 10:30");
        historicoSolicitacoes.adicionar("REQ002", "Manutenção preventiva", "2024-08-20 11:00");
        historicoSolicitacoes.adicionar("REQ003", "Atualização de sistema", "2024-08-20 11:30");
        historicoSolicitacoes.adicionar("REQ004", "Suporte técnico", "2024-08-20 12:00");
        historicoSolicitacoes.adicionar("REQ005", "Troca de equipamento", "2024-08-20 12:30");

        historicoSolicitacoes.exibirHistorico();

        // Remove
        System.out.println("\nRemovendo Solicitações ");
        historicoSolicitacoes.remover();
        historicoSolicitacoes.remover();

        historicoSolicitacoes.exibirHistorico();
        System.out.println("Pilha está vazia? " + historicoSolicitacoes.vazia());
    }
}