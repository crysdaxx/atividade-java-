package ativ3;

public class Main {
    public static void main(String [] args){
        ContaBancaria Conta1 = new ContaBancaria(436789,3567);
        Conta1.depositar(6000);
        Conta1.sacar(9000);
        System.out.println("Saldo: "+ Conta1.Getsaldo());

    }
}
