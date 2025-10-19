class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public double somar(double a, double b) {
        return a + b;
    }
}


class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado2Int = calc.somar(2, 3);           
        int resultado3Int = calc.somar(1, 2, 3);        
        double resultado2Double = calc.somar(2.5, 3.1); 

        System.out.println("somar(2, 9) = " + resultado2Int);
        System.out.println("somar(1, 2, 7) = " + resultado3Int);
        System.out.println("somar(5.5, 3.1) = " + resultado2Double);
    }
}