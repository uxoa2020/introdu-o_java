/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_encapsulamento_1;

/**
 *
 * @author uxoa
 */
public class clienteDAO {

    public String mostraNomeRg(clienteDTO cliente) {

        return "o nome é " + cliente.getNome() + " e o rg "
                + cliente.getRG() + ".";

    }

    public String motraNomeIdade(clienteDTO cliente) {
        return "O nome é " + cliente.getNome()
                + " e a idade " + cliente.getIdade() + ".";
    }
}
