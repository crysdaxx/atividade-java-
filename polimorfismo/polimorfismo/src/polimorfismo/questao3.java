
public class questao3 {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor(4000.00);
        Funcionario sup = new Suporte(2500.00);

        System.out.printf("%s - salario final: R$ %.2f%n",
                dev.getClass().getSimpleName(), dev.calcularSalarioFinal());
        System.out.printf("%s - salario final: R$ %.2f%n",
                sup.getClass().getSimpleName(), sup.calcularSalarioFinal());
    }
}

abstract class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.10; 
    }
}

class Suporte extends Funcionario {
    private static final double AJUDA_CUSTO = 200.00;

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + AJUDA_CUSTO;
    }
}