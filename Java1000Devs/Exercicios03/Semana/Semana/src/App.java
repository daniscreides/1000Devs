//Exercício 06: Faça um Programa que leia um número e exiba o dia correspondente da semana, conforme esta regra: (1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 -Sexta e 7 - Sábado). Se o usuário digitar outro valor deve aparecer valor inválido.


import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.println("Digite o número do dia da semana:");
            System.out.println("1 - Domingo");
            System.out.println("2 - Segunda-Feira");
            System.out.println("3 - Terça-Feira");
            System.out.println("4 - Quarta-Feira");
            System.out.println("5 - Quinta-Feira");
            System.out.println("6 - Sexta-Feira");
            System.out.println("7 - Sábado");
            System.out.print("Escolha: ");

            int diaSemana = scanner.nextInt();

            if (diaSemana == 1) {
                System.out.println("Domingo");

            } else if (diaSemana == 2) {
                System.out.println("Segunda-Feira");

            } else if (diaSemana == 3) {
                System.out.println("Terça-Feira");

            } else if (diaSemana == 4) {
                System.out.println("Quarta-Feira");

            } else if (diaSemana == 5) {
                System.out.println("Quinta-Feira");

            } else if (diaSemana == 6) {
                System.out.println("Sexta-Feira");

            } else if (diaSemana == 7) {
                System.out.println("Sábado");

            } else {
                System.out.println("ERRO! Digite um número entre 1 e 7.");
            }

        } catch (Exception e) {
            System.out.println("ERRO: Digite apenas números inteiros!");

        } finally {            
            scanner.close();
        }
    }
}
