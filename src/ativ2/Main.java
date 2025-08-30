package ativ2;

public class Main {
    public static void main(String [] args){
        Carro automovel = new Carro();
        automovel.setMarca("B.Y.D");
        automovel.setAno(2024);
        System.out.println("Marca: "+ automovel.getMarca());
        System.out.println("ano: "+ automovel.getAno());
    }

}
