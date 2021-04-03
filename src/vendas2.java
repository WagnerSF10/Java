/*
* Wagner de Souza França - FATEC
*
* Uma Empresa de desenvolvimento de softwares paga a seu vendedor um
* fixo de R$ 500,00 por mês, mais um bônus de R$ 50,00 por sistema vendido. Faça
* uma algoritmo que leia quantos softwares o funcionário vendeu e determine o salário
* total do funcionário. Mostre as informações que você achar necessário.
*
* */

import javax.swing.*;

public class vendas2 {
    public static void main(String[] args){
        float fixo=500, bonus, soft_vendido, sal_total;
        soft_vendido = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de software vendido: "));
        bonus = soft_vendido*50;
        sal_total = fixo+bonus;
        JOptionPane.showMessageDialog(null,"Salario fixo R$ "+fixo+
                "\nBonus R$ "+bonus+
                "\nSalario Total R$ "+sal_total);

    }
}
