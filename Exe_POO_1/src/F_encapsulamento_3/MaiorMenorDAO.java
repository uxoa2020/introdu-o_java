/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package F_encapsulamento_3;

/**
 *
 * @author uxoa
 */
public class MaiorMenorDAO {

    public String MostraPessoa(MaiorMenorDTO maiormenorDTO) {
        return "dados da pessoa:" + "\nnome: " + maiormenorDTO.getNome()
                + "\nidade: " + maiormenorDTO.getIdade();
    }

    public String MaiorIdade(MaiorMenorDTO maiormenorDTO) {
        int idade;
        idade = maiormenorDTO.getIdade();

        String maioridade = "";

        if (idade >= 18) {
            maioridade = "maior de idade";
        } else {
            maioridade = "menor de idade";
        }
        return maioridade;
    }
}
