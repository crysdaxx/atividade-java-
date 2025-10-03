package Ativ4;

public class Main {

    public static void main(String[] args) {
        Pilha mhaPilha = new Pilha(5);
        mhaPilha.push(30); 
        mhaPilha.push(35);            
        mhaPilha.push(40); 
        mhaPilha.mostrarPilha(); 
        
        System.out.println("topo:");
        int topoAtual = mhaPilha.peek();
        System.out.println("No topo está: " + topoAtual);
        
        
        System.out.println("numeros tirados :");
        while (!mhaPilha.isEmpty()) { 
            int numeroRemovido = mhaPilha.pop(); 
            System.out.println("Tirei: " + numeroRemovido);
            mhaPilha.mostrarPilha(); 
        }
        
        System.out.println(" A pilha vazia!");
    }


}