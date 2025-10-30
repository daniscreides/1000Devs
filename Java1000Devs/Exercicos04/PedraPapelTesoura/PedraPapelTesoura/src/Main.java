import java.util.Scanner; 
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SecureRandom sorteio = new SecureRandom();

        String escolhaComputador = "";

        System.out.println("Escolha: 0 - Tesoura, 1 - Pedra, 2 - Papel");
        int escolhaJogador = teclado.nextInt();

        // sorteia um número de 0 a 2: (0 1 2)
        switch (sorteio.nextInt(3)) {

            case 0: 
                escolhaComputador = "tesoura";
                break;

            case 1:
                escolhaComputador = "pedra";
                break;

            case 2: 
                escolhaComputador = "papel";
                break;
        }

        String escolhaJogador1 = "";

        switch (escolhaJogador) {

            case 0:
                escolhaJogador1 = "tesoura";
                break;
                
            case 1:
                escolhaJogador1 = "pedra";
                break;

            case 2:
                escolhaJogador1 = "papel";
                break;

            default: {

                System.out.println("Opção inválida!");

                teclado.close();

                return;
            }
        }

        System.out.println("Você escolheu: " + escolhaJogador1);
        System.out.println("Computador escolheu: " + escolhaComputador);

        // seleciona o vencedor
        if (escolhaJogador1.equals(escolhaComputador)) {
            System.out.println("Empate");

        } else {

            switch (escolhaJogador1) {

                case "pedra": 
                System.out.println(escolhaComputador.equals("tesoura") ? "Você ganhou" : "Você perdeu");
                break;

                case "papel":
                System.out.println(escolhaComputador.equals("pedra") ? "Você ganhou" : "Você perdeu");
                break;

                case "tesoura":
                System.out.println(escolhaComputador.equals("papel") ? "Você ganhou" : "Você perdeu");
                break;

            }
        }

        teclado.close();
    }
}
