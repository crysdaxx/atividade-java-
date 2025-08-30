package ativ3;

public class ContaBancaria {
    private int conta;
    private double saldo;

    ContaBancaria(int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }
    void deposito(double valor){
        if(valor > 0){
            System.out.print(valor);
            saldo += valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        }
        void sacar (double valor){
            if(valor <= saldo){
                saldo -= valor;
                System.out.println(saldo);
            }
            else{
                System.out.println("Saldo insuficiente");
            }
            }
        public double GetSaldo(){
            return this.saldo;
        }
        }
        

