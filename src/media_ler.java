//Wagner de Souza França - FATEC
import javax.swing.JOptionPane;
public class media_ler {
    public static void main(String[] args){
        float nota1, nota2, calc_media;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota A"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota B"));
        calc_media = (nota1+nota2)/2;
        //System.out.println("A media eh: " + calc_media);
        JOptionPane.showMessageDialog(null, "A media eh: "+calc_media);
    }
}
