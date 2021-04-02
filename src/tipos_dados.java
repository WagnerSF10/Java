
/*
 * Wagner de Souza França - FATEC
 *
 * Ler o nome de uma pessoa, a sua idade e o seu salário, e mostrar essas informações.
 *
 */

import javax.swing.*;

public class tipos_dados {
    public static void main(String[] args){
        float salario; int idade; String nome;
        nome = JOptionPane.showInputDialog("Nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Salario:"));

        JOptionPane.showMessageDialog(null,"Nome: "+nome);
        JOptionPane.showMessageDialog(null, "Idade: "+idade);
        JOptionPane.showMessageDialog(null,"Salario: "+salario);


    }
}
