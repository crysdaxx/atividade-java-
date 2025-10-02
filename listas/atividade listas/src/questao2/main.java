
class No {
    int valor;
    No anterior;
    No proximo;

    public No(int v) {
        valor = v;
        anterior = null;
        proximo = null;
    }
}

class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public ListaDupla() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirNoInicio(int v) {
        No novo = new No(v);
        if (inicio == null) { 
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }
    public void inserirNoFinal(int v) {
        No novo = new No(v);
        if (fim == null) { 
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }
    public void removerNoInicio() {
        if (inicio != null) {
            if (inicio == fim) { 
                inicio = fim = null;
            } else {
                inicio = inicio.proximo;
                inicio.anterior = null;
            }
            tamanho--;
        }
    }
    public void removerNoFinal() {
        if (fim != null) {
            if (inicio == fim) { 
                inicio = fim = null;
            } else {
                fim = fim.anterior;
                fim.proximo = null;
            }
            tamanho--;
        }
    }
    public void exibir() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }
}
public class main {
    public main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirNoInicio(50);
        lista.inserirNoFinal(100);
        lista.inserirNoFinal(150);
        lista.exibir(); 
        lista.removerNoInicio();
        lista.exibir(); 
        lista.removerNoFinal();
        lista.exibir(); 
    }
}

