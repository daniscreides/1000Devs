//Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em metros, lembrando que um pé mede 0,3048 metro, ou seja, um pé é igual a 30,48 centímetros.

import java.util.Scanner;
public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PE_EM_METROS = 0.3048;

        System.out.print("Digite a medida em pés: ");
        double pes = scanner.nextDouble();
        
        double metros = pes * PE_EM_METROS; // Converte pés para metros
        System.out.printf("%.2f pés é igual a %.2f metros.\n", pes, metros);
        
        scanner.close();
    }  
}