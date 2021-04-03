/*
*
* Wagner de Souza França - FATEC
*
*    Uma Empresa de vendas de softwares paga a seu vendedor um fixo de
*    R$ 800,00 por mês, mais uma comissão de 15% pelo seu valor de vendas no mês. Faça
*    uma algoritmo que leia o valor da venda e determine o salário total do funcionário.
*    Mostre as informações que você achar necessário.
* */

import javax.swing.*;

public class vendas {
    public static void main(String[] args){
        float fixo=800, comissao, vendas_mes, sal_final;
        vendas_mes = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das vendas do mês R$"));
        comissao= (float) (vendas_mes*0.15);
        sal_final=fixo+comissao;

        JOptionPane.showMessageDialog(null,"O salario fixo R$ " +fixo+
                "\nComissao R$ "+comissao+
                "\nSalario final R$ "+sal_final);
    }
}
