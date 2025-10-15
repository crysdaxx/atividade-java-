
public class Pedido {

    private final List<ItemPedido> itens = new ArrayList<>();

    public static class ItemPedido {
        private final String nome;
        private final int quantidade;
        private final double precoUnitario;

        public ItemPedido(String nome, int quantidade, double precoUnitario) {
            this.nome = nome;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double subtotal() {
            return quantidade * precoUnitario;
        }

        @Override
        public String toString() {
            return nome + " x" + quantidade + " @ R$ " + String.format("%.2f", precoUnitario)
                    + " => R$ " + String.format("%.2f", subtotal());
        }
    }

    public void adicionarItem(String nome, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(nome, quantidade, precoUnitario));
    }

    public double valorTotal() {
        double total = 0.0;
        for (ItemPedido it : itens) {
            total += it.subtotal();
        }
        return total;
    }

    public void listarItens() {
        for (ItemPedido it : itens) {
            System.out.println(it);
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        System.out.println("Itens do pedido:");
        pedido.listarItens();

        System.out.printf("Valor total do pedido: R$ %.2f%n", pedido.valorTotal());
    }
}
