/*
Wagner de Souza França - FATEC

O custo ao consumidor de um carro novo, é a soma do custo de fábrica com
a percentagem do revendedor e com o custo dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do revendedor seja de 25% do custo de fábrica e que os
impostos custam 45 % do custo de fábrica, faça um algoritmo que leia o valor de custo de
fábrica e determine o preço final do automóvel (custo ao consumidor).
 */


import javax.swing.*;

public class automovel {
    public static void main(String[] args){
        float c_fab, p_rev, imp, p_final;

        c_fab = Float.parseFloat(JOptionPane.showInputDialog("Qual o custo de fabrica?"));
        p_rev = (float) (c_fab*0.25);
        imp = (float) (c_fab*0.45);
        p_final = c_fab+p_rev+imp;

        JOptionPane.showMessageDialog(null,"Custo de Fabrica: "+c_fab+
                "\nPercentual do Revendedor: "+p_rev+
                "\nImpostos: "+imp+
                "\nPreco Final: "+p_final);
    }
}
