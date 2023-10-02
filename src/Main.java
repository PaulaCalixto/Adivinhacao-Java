import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        boolean acertou = false;
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite um número: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente novamente. O número secreto é maior.");
            } else {
                System.out.println("Tente novamente. O número secreto é menor.");
            }
        }
        scanner.close();
    }
}