//Uma loja de venda de frutas está vendendo frutas com a seguinte tabela de preços:
//- Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
//- Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

          try {
            
            System.out.println("Quantos Kg de Morango?");
            float pesoMorango = scanner.nextFloat();
            scanner.nextLine();
            
            System.out.println("Quantos Kg de Maça?");
            float pesoMaca = scanner.nextFloat();
            scanner.nextLine();
            
            float valorMorango, valorMaca;

            if (pesoMorango <= 5) {
                valorMorango = 2.50f;  
            } else {
                valorMorango = 2.20f;
            }

            if (pesoMaca <= 5) {
                valorMaca = 1.80f;            
            }
            else{
                valorMaca = 1.50f;
            }

            float totalMorango = pesoMorango * valorMorango;
            float totalMaca = pesoMaca * valorMaca;
            float totalCompra = totalMaca + totalMorango;
            float pesoTotal = pesoMorango + pesoMaca;
        
            if (pesoTotal > 8 || totalCompra > 25.00f) {
                totalCompra -= totalCompra * 0.10f; // 10% de desconto

                System.out.println("Você teve 10% de desconto na sua compra.");
            }

            System.out.printf("Você comprou: %.2f Kg de frutas. O valor total a ser pago é R$ %.2f%n", pesoTotal, totalCompra);

            } catch (Exception e) {
                System.out.println("ERRO: Digite apenas números.");        
            } 

        scanner.close();
    }
}
