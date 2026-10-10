import javax.swing.JOptionPane;
public class SaberIdade {
    public static void main(String[] args) {
        try {

            int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que estamos: "));
            int anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));

            int idade = anoAtual - anoDeNascimento;

            JOptionPane.showMessageDialog(null, "A sua idade é " + idade + ". ");

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite somente caracteres numéricos" + erro.toString());
        }
        System.exit(0);
    }
}
