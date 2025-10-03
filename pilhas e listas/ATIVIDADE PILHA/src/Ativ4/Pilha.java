package Ativ4;

public class Pilha {
    private final int[] elementos;
    private int topo;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade; 
        this.elementos = new int[capacidade]; 
        this.topo = -1; 
    }
    public void push(int valor) {
        
        if (topo == capacidade - 1) {
            System.out.println(" cheio " + valor);
            return;
        }
        topo++; 
        elementos[topo] = valor;
        System.out.println("Adicionado " + valor);
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println(" vazio");
            return -1; 
        }
        int valorRemovido = elementos[topo]; 
        topo--; 
        return valorRemovido; 
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println(" Pilha vazia");
            return -1;
        }
        return elementos[topo]; 
    }
    public boolean isEmpty() {
        return topo == -1; 
    }

    public void mostrarPilha() {
        if (isEmpty()) {
            System.out.println("vazio");
            return;
        }
        
        System.out.print(" Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
                System.out.println("inicio  da pilha" );
            }
        }