package questao4;
class Veiculo {
    String marca;
    String modelo;
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
class Carro extends Veiculo {
    int quantidadePortas;

   
    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo); 
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public void exibirInfo() {
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + quantidadePortas);
    }
}

class Moto extends Veiculo {
    int cilindradas;


    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo); 
        this.cilindradas = cilindradas;
    }

    
    @Override
    public void exibirInfo() {
        System.out.println("Moto - Marca: " + marca + ", Modelo: " + modelo + ", Cilindradas: " + cilindradas);
    }
}
