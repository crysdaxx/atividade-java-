

public class CalculadoraDialog {

    private static final DecimalFormat DF = new DecimalFormat("#.####");

    private static double lerNumero(String mensagem) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, mensagem);
            if (s == null) { 
                System.exit(0);
            }
            try {
                s = s.trim().replace(',', '.');
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        double a = lerNumero("Digite o primeiro número:");
        double b = lerNumero("Digite o segundo número:");

        String[] opcoes = { "+", "−", "×", "÷" };
        int op = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação:",
                "Operação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        if (op == JOptionPane.CLOSED_OPTION) System.exit(0);

        double resultado;
        switch (op) {
            case 0: 
                resultado = a + b;
                break;
            case 1: 
                resultado = a - b;
                break;
            case 2: 
                resultado = a * b;
                break;
            case 3: 
                if (b == 0.0) {
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                resultado = a / b;
                break;
            default:
                return;
        }

        String msg = String.format("%s %s %s = %s",
                DF.format(a), opcoes[op], DF.format(b), DF.format(resultado));
        JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
