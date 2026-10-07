import java.util.Scanner;
public class PraticandoArray {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0.0;
        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a sua nota " + (i + 1) + ": ");
            notas[i] = leitor.nextDouble();
            soma = soma + notas[i];
        }
        double media = soma / 3;

        if(media >= 7){
            System.out.println("Parabéns! Você foi aprovado com média " + String.format("%.2f ", media));
        }
        else if(media >= 4){
            System.out.println("A sua média é " + String.format("%.2f ", media) + "e você está na final. ");
        }
        else{
            System.out.println("A sua média é " + String.format("%.2f", media) + ". Infelizmente você está reprovado");
        }
        leitor.close();
    }

}
