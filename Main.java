public class Main {
    public static void main(String[] args){
        Fila fila = new Fila();

        //testes fila
        fila.enqueue("Aaa", "001", " aaa");
        fila.exibirFila();
        fila.dequeue();
        fila.exibirFila();
        fila.dequeue();//teste vazia
        fila.dequeue();
    }
}
