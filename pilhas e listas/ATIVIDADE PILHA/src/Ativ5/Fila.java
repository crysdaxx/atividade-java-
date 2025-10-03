package Ativ5;

public class Fila {
    private int[] dados;
    private int frente = 0, tras = -1;

    public Fila(int capacidade) {
        dados = new int[capacidade];
    }

    public void enqueue(int valor) {
        if (tras == dados.length - 1) {
            System.out.println(" Não é possível inserir " + valor);
            return;
        }
        dados[++tras] = valor;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Não é possível remover.");
            return -1;
        }
        return dados[frente++]; 
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        }
        return dados[frente];
    }

    public boolean isEmpty() {
        return frente > tras;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enqueue(20);
        fila.enqueue(25);
        fila.enqueue(30);

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) System.out.println("Removido: " + fila.dequeue());
}
}