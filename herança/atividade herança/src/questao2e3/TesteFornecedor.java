package questao2e3;
public class TesteFornecedor {
    public static void main(String[] args) {
        
        Fornecedor fornecedor = new Fornecedor("Empresa crysdax", "gentil bittencurt ", "3333-2222", 5000.0, 1200.0);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: " + fornecedor.getValorCredito());
        System.out.println("Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}