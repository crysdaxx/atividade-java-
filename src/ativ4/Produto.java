public class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
         this.preco = preco; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! Não pode ser negativo.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 59.90);
        Produto p2 = new Produto("Tênis", -150.00); 

        p1.mostrarInfo();
        p2.mostrarInfo();
        p1.setPreco(-20.00);
        p1.mostrarInfo();
    }
}