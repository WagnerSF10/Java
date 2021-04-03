/*
* Wagner de Souza França - FATEC
*
* Um cliente de um banco tem um saldo positivo de R$ 500,00. Fazer
* um algoritmo que leia um cheque que entrou e calcule o saldo, mostrando
* (escrevendo) o saldo na tela.
*/

import javax.swing.*;

public class saldo {
    public static void main(String[] args){
        float valor_saldo=500, cheque;
        cheque = Float.parseFloat(JOptionPane.showInputDialog("Valor do cheque: "));
        valor_saldo = valor_saldo - cheque;
        JOptionPane.showMessageDialog(null, "Saldo final: "+valor_saldo);
    }
}
