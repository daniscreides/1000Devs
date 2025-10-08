//Em uma eleição sindical concorreram ao cargo de presidente três candidatos (representados pelas variáveis A, B e C). Durante a apuração dos votos foram computados votos nulos e em branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador que faça a leitura da quantidade de votos válidos para cada candidato, além de também ler a quantidade de votos nulos e em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.

import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
        int votosA = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
        int votosB = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
        int votosC = scanner.nextInt();

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos em branco: ");
        int votosBrancos = scanner.nextInt();

        int totalEleitores = votosA + votosB + votosC + votosNulos + votosBrancos;

        double percentualVotosValidos = ((votosA + votosB + votosC) / (double) totalEleitores) * 100;
        double percentualVotosA = (votosA / (double) totalEleitores) * 100;
        double percentualVotosB = (votosB / (double) totalEleitores) * 100;
        double percentualVotosC = (votosC / (double) totalEleitores) * 100;
        double percentualVotosNulos = (votosNulos / (double) totalEleitores) * 100;
        double percentualVotosBrancos = (votosBrancos / (double) totalEleitores) * 100;

        System.out.println("\nResultados da Eleição:");
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualVotosValidos);
        System.out.printf("Percentual de votos do candidato A: %.2f%%\n", percentualVotosA);
        System.out.printf("Percentual de votos do candidato B: %.2f%%\n", percentualVotosB);
        System.out.printf("Percentual de votos do candidato C: %.2f%%\n", percentualVotosC);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualVotosNulos);
        System.out.printf("Percentual de votos em branco: %.2f%%\n", percentualVotosBrancos);

        scanner.close();
    }
}