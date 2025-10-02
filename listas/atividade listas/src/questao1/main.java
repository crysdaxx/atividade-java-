package questao1;

class No {
    int valor;
    No proximo;
    
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaSimples {
    private No inicio;
    private int tamanho;
    
    public ListaSimples() {
        inicio = null;
        tamanho = 0;
    }
    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }
    
    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }
    
    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) return;
        
        if (pos == 0) {
            inserirNoInicio(valor);
        } else if (pos == tamanho) {
            inserirNoFinal(valor);
        } else {
            No novo = new No(valor);
            No atual = inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }
            novo.proximo = atual.proximo;
            atual.proximo = novo;
            tamanho++;
        }
    }
    
    public void removerNoInicio() {
        if (inicio == null) return;
        inicio = inicio.proximo;
        tamanho--;
    }
    
    public void removerNoFinal() {
        if (inicio == null) return;
        
        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
        tamanho--;
    }
    
    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) return;
        
        if (pos == 0) {
            removerNoInicio();
        } else {
            No atual = inicio;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }
    }
    
    public int tamanho() {
        return tamanho;
    }
    
    public void exibir() {
        No atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println("| Tamanho: " + tamanho);
    }
}

public class main {
    public main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.inserirNoFinal(10);
        lista.inserirNoFinal(20);
        lista.inserirNoInicio(5);
        lista.exibir();
        
        lista.inserirNaPosicao(1, 15);
        lista.exibir();
        lista.removerNoInicio();
        lista.exibir();
        lista.removerNoFinal();
        lista.exibir();
        lista.removerNaPosicao(1);
        lista.exibir();
    }
}