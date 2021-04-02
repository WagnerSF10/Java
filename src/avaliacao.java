/*
        Wagner de Souza França - FATEC

        O sistema de avaliação de determinada disciplina, é composto por três
        provas. A primeira prova tem peso 2, a Segunda tem peso 3 e a terceira prova tem
        peso 5. Faça um algoritmo para calcular a média final de um aluno desta disciplina.
 */

import javax.swing.*;

public class avaliacao {
    public static void main(String[] args){
        float p1, p2, p3, media;

        p1 = Float.parseFloat(JOptionPane.showInputDialog("Prova 1: "));
        p2 = Float.parseFloat(JOptionPane.showInputDialog("Prova 2: "));
        p3 = Float.parseFloat(JOptionPane.showInputDialog("Prova 3: "));

        p1 = (p1*2)/10;
        p2 = (p2*3)/10;
        p3 = (p3*5)/10;

        media = p1+p2+p3;

        JOptionPane.showMessageDialog(null, "Media: "+media);
    }
}
