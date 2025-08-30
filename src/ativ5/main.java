public class Main {
    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Rua das Flores", 123);
        Endereco endereco2 = new Endereco("Avenida Brasil", 456);

        Pessoa pessoa1 = new Pessoa("João", 30, endereco1);
        Pessoa pessoa2 = new Pessoa("Maria", 25, endereco2);

        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
    }
}