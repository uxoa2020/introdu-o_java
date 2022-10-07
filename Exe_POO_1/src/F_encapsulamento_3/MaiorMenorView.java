package F_encapsulamento_3;

import javax.swing.JOptionPane;

public class MaiorMenorView {

    public static void main(String[] args) {
        MaiorMenorDTO mmt = new MaiorMenorDTO();
        MaiorMenorDAO mma = new MaiorMenorDAO();
        try {
            mmt.setNome(JOptionPane.showInputDialog("nome: "));
            mmt.setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade: ")));

            JOptionPane.showMessageDialog(null, mma.MostraPessoa(mmt));
            JOptionPane.showMessageDialog(null, "pessoa é: " + mma.MaiorIdade(mmt));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro:" + e.getMessage());
        }
    }
}
