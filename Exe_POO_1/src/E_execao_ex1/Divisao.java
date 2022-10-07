package E_execao_ex1;

import javax.swing.JOptionPane;

public class Divisao {

    private double resultado=0;
    private double n1=0;
    private double n2=0;

    public void calcularDivisao(double n1, double n2) {
        try {
            this.resultado = (this.n1 / this.n2);

            JOptionPane.showMessageDialog(null, "O returltado da divisão: " + this.resultado);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro:" + e.getMessage());
        }
    }
}
