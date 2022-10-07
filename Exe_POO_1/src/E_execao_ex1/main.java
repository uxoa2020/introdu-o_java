package E_execao_ex1;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        double n1, n2;

        Divisao divisao = new Divisao();
        try {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero da divisao: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero da divisao: "));

            divisao.calcularDivisao(n1, n2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e.getMessage() + "  ");
        }
    }
}
