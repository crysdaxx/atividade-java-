
public class questao2 {
    public static void main(String[] args) {
        Funcionario[] listaDePagamento = new Funcionario[2];
        listaDePagamento[0] = new Gerente("dax", 7000.0, 3000.0);
        listaDePagamento[1] = new Programador("duda", 5000.0, 10); 

        for (Funcionario f : listaDePagamento) {
            double salario = f.calcularSalario();
            System.out.printf("%s %s - salário calculado: %.2f%n", f.getCargo(), f.getNome(), salario);
        }
    }
}

class Funcionario {
    private final String nome;
    private final double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return "Funcionario";
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase; 
    }
}

class Gerente extends Funcionario {
    private final double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus; 
    }
}

class Programador extends Funcionario {
    private final int horasExtras;
    private static final double VALOR_HORA_EXTRA = 50.0;

    public Programador(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public String getCargo() {
        return "Programador";
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + horasExtras * VALOR_HORA_EXTRA; 
}
}