/*
    Wagner de Souza França - FATEC

    Duas variáveis (A e B) possuem valores distintos (A:=5 e B:= 10), Crie um
	algoritmo que armazene esses dois valores nessas duas variáveis, e efetue a troca dos valores de
	forma que a variável A passe a possuir o valor da variável B e que a variável B passe a possuir
	o valor da variável A. Por fim, apresentar os valores trocado

*/


import javax.swing.*;

public class trocar {
    public static void main(String[] args){
        int a, b, aux;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
        JOptionPane.showMessageDialog(null, "Antes de trocar: A = "+a+ " e B = "+b);

        aux = a;
        a = b;
        b = aux;

        JOptionPane.showMessageDialog(null,"Trocados: A = "+a+ " e B = "+b);

    }

}
