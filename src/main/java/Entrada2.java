import javax.swing.JOptionPane;
public class Entrada2 {
    public static void main(String[] args) {
        try {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua terceira nota: "));
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) {
            JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está aprovado! ");
        } else if(media >= 4) {
            JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está na final. ");
        } else {
            JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está reprovado. ");
        }

    } catch (NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos" + erro.toString());

    }
    System.exit(0);

    }
}
