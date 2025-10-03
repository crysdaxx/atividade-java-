package questao4;
public class Main {
    public static void main(String[] args) {
    
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("tesla", "x", 4);
        veiculos[1] = new Moto("honda", "cg", 160);
        veiculos[2] = new Carro("Chevrolet", "camaro", 4);

        
        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i].exibirInfo(); 
        }
        
        
        Carro meuCarro = new Carro("jeep", "renegade", 4);
        Moto minhaMoto = new Moto("BMW", "urban", 350);
        
        meuCarro.exibirInfo();
        minhaMoto.exibirInfo();
        
        
        System.out.println("Total de veículos: " + veiculos.length);
    }
}