import javax.swing.*;

public class saldo {
    public static void main(String[] args){
        float valor_saldo=500, cheque;
        cheque = Float.parseFloat(JOptionPane.showInputDialog("Valor do cheque: "));
        valor_saldo = valor_saldo - cheque;
        JOptionPane.showMessageDialog(null, "Saldo final: "+valor_saldo);
    }
}
