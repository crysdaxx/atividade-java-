public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        }
    }

    @Override
    public String toString() {
        String status = disponivel ? "Disponível" : "Emprestado";
        return titulo + " - " + autor + " (" + status + ")";
    }
}

<------------------------------------------------------------------>

| Biblioteca.java |

public class Biblioteca {
    private Livro[] livros;
    private int quantidade;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        quantidade = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                break;
            }
        }
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                break;
            }
        }
    }

    public void mostrarLivros() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(livros[i]);
        }
        System.out.println();
    }
}

<------------------------------------------------------------------>

Main.java

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro l1 = new Livro("Harry Potter", "JK Rowling");
        Livro l2 = new Livro("O Senhor dos Anéis", "Tolkien");
        Livro l3 = new Livro("Crônicas de Nárnia", "Lewis");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("1984");
        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("1984");
        biblioteca.mostrarLivros();
    }
}


