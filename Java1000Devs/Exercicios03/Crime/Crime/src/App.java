//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//"Telefonou para a vítima?"
//"Esteve não é morador local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?"
//O usuário deve responder a cada pergunta: 1 para sim ou 0 para não. O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se uma pessoa responder sim em 2 questões ela deve ser definida como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaRespostas = 0;

        try {
            System.out.println("Responda 1 para SIM ou 0 para NÃO.");

            System.out.print("1 - Telefonou para a vítima? ");
            int resposta1 = scanner.nextInt();

            System.out.print("2 - Esteve no local do crime? ");
            int resposta2 = scanner.nextInt();

            System.out.print("3 - Mora perto da vítima? ");
            int resposta3 = scanner.nextInt();

            System.out.print("4 - Devia para a vítima? ");
            int resposta4 = scanner.nextInt();

            System.out.print("5 - Já trabalhou com a vítima? ");
            int resposta5 = scanner.nextInt();

            somaRespostas = resposta1 + resposta2 + resposta3 + resposta4 + resposta5;

            if (somaRespostas == 2) {
                System.out.println("\nClassificação: SUSPEITA");

            } else if (somaRespostas >= 3 && somaRespostas <= 4) {
                System.out.println("\nClassificação: CÚMPLICE");

            } else if (somaRespostas == 5) {
                System.out.println("\nClassificação: ASSASSINO");

            } else {
                System.out.println("\nClassificação: INOCENTE");

            }

        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, digite apenas 1 ou 0.");

        } finally {

            scanner.close();
            
        }
    }
}

