import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args) {
        String aux;
        double nota1, nota2, nota3, media;
        try {
            aux = JOptionPane.showInputDialog("Digite a sua primeira nota: ");
            nota1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite a sua segunda nota: ");
            nota2 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog("Digite a sua terceira nota: ");
            nota3 = Double.parseDouble(aux);

            media = (nota1 + nota2 + nota3) / 3;

            if(media >= 7) {
                JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está aprovado! ");
            } else if(media >= 4) {
                JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está na final. ");
            } else {
                JOptionPane.showMessageDialog(null, "Sua média é " + String.format("%.2f ", media) + ". Você está reprovado. ");
            }

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos" + erro.toString());

        } System.exit(0);
    }
}
