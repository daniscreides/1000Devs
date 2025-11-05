import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroComputador = random.nextInt(11);
        int tentativa, pontos = 0;
        boolean acertou = false;

        System.out.println("Jogo: Acerte o Número!");
        System.out.println("Adivinhe o número escolhido de0 a 10.");
        System.out.println("Você tem 3 tentativas!");

        for (int i = 1; i <= 3; i++) {
            System.out.print("\nTentativa " + i + ": ");
            tentativa = input.nextInt();

            if (tentativa == numeroComputador) {
                acertou = true;

                switch (i) {
                    case 1:
                        pontos = 5;
                        break;
                    case 2:
                        pontos = 4;
                        break;
                    case 3:
                        pontos = 2;
                        break;
                }

                System.out.println("\nParabéns! Você acertou!");
                System.out.println("O número era: " + numeroComputador);
                System.out.println("Você ganhou " + pontos + " pontos.");
                break;

            } else {

                if (tentativa < numeroComputador) {
                    System.out.println("O número é MAIOR que " + tentativa + ".");

                } else {
                    System.out.println("O número é MENOR que " + tentativa + ".");
                }

                if (i == 3) {
                    System.out.println("\nVocê perdeu!");
                    System.out.println("O número correto era: " + numeroComputador);
                }
            }
        }

        input.close();
    }
}
