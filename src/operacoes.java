import javax.swing.*;

public class operacoes {
    public static void main (String[] args){
        float num1, num2, soma, mul, div, sub;
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero:"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro numero:"));

        soma = num1+num2;
        mul = num1*num2;
        div = num1/num2;
        sub = num1-num2;
        JOptionPane.showMessageDialog(null,
                "Soma: "+soma+
                        "\nMultiplicacao: "+mul+
                        "\nDivisao: "+div+
                        "\nSubtracao: "+sub);

    }
}
