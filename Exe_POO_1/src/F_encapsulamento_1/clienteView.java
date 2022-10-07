package F_encapsulamento_1;

import javax.swing.JOptionPane;

public class clienteView {

    public static void main(String[] args) {

        clienteDTO clienteT = new clienteDTO();
        clienteDAO clienteA = new clienteDAO();
        clienteT.setNome(JOptionPane.showInputDialog("Qual seu nome? "));
        clienteT.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? ")));
        clienteT.setRG(JOptionPane.showInputDialog("Qual seu RG? "));
        
        JOptionPane.showMessageDialog(null,clienteA.mostraNomeRg(clienteT));
        JOptionPane.showMessageDialog(null,clienteA.motraNomeIdade(clienteT));
    }
}
