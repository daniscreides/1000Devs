//Ler quatro valores numéricos inteiros e apresentar o resultado das adições e das multiplicações utilizando o mesmo raciocínio aplicado quando do uso de propriedades distributivas para a máxima combinação possível entre as quatro variáveis. Não é para calcular a propriedade distri- butiva, apenas para usar a sua forma de combinação. Considerando a leitura de valores para as variáveis A, B, C e D, devem ser feitas seis adições e seis multiplicações, ou seja, deve ser combinada a variável A com a variável B, a variável A com a variável C, a variável A com a variável D. Depois é necessário combinar a variável B com a variável C e a variável B com a variável D e, por fim, a variável C será combinada com a variável D.

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        System.out.print("Digite o valor de A: ");
        A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        D = scanner.nextInt();

        // Adições
        int somaAB = A + B;
        int somaAC = A + C;
        int somaAD = A + D;
        int somaBC = B + C;
        int somaBD = B + D;
        int somaCD = C + D;

        // Multiplicações
        int produtoAB = A * B;
        int produtoAC = A * C;
        int produtoAD = A * D;
        int produtoBC = B * C;
        int produtoBD = B * D;
        int produtoCD = C * D;

        // Exibindo resultados
        System.out.println("Resultados das Adições:");
        System.out.println("A + B = " + somaAB);
        System.out.println("A + C = " + somaAC);
        System.out.println("A + D = " + somaAD);
        System.out.println("B + C = " + somaBC);
        System.out.println("B + D = " + somaBD);
        System.out.println("C + D = " + somaCD);

        System.out.println("\nResultados das Multiplicações:");
        System.out.println("A * B = " + produtoAB);
        System.out.println("A * C = " + produtoAC);
        System.out.println("A * D = " + produtoAD);
        System.out.println("B * C = " + produtoBC);
        System.out.println("B * D = " + produtoBD);
        System.out.println("C * D = " + produtoCD);

        scanner.close();
    }
}