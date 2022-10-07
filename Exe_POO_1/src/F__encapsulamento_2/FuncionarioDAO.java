package F__encapsulamento_2;

import javax.swing.JOptionPane;

public class FuncionarioDAO {

    public String mostraDados(FuncionarioDTO funcionarioT) {
        try {
            return "Os dados do funcionario são:" + "\nNome: " + funcionarioT.getNome()
                    + "\nTelefone: " + funcionarioT.getTelefone() + "\nCidade: "
                    + funcionarioT.getCidade()+ "\nSalario: " + funcionarioT.getSalario();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro:" + e.getMessage());
        }
        return null;
    }

}
