package F__encapsulamento_2;

import javax.swing.JOptionPane;

public class FuncionarioView {
    public static void main(String[] args) {
        try{
        FuncionarioDAO funcionarioA=new FuncionarioDAO();
        FuncionarioDTO funcionarioT=new FuncionarioDTO();

        funcionarioT.setNome(JOptionPane.showInputDialog("Nome: "));
        funcionarioT.setCidade(JOptionPane.showInputDialog("Cidade: "));
        funcionarioT.setTelefone(JOptionPane.showInputDialog("Telefone: "));
        funcionarioT.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario: ")));
        
        JOptionPane.showMessageDialog(null, funcionarioA.mostraDados(funcionarioT));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro:" + e.getMessage());
        }
    }
}
