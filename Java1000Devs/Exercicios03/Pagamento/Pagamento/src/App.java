//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende dosalário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20%
//Imprima na tela as informações, dispostas conforme o exemplo abaixo.
//Exemplo:
//QTDE de Horas Trabalhadas:   5
//Valor da hora trabalhada:    R$220.00
//Salário Bruto: (5 * 220):    R$1.100,00
//(-) IR (5%):                 R$55,00 
//(-) INSS ( 10%):             R$110,00
//(-) Sindicato (3%):          R$33,00
//FGTS (11%):                  R$121,00
//Total de descontos:          R$198,00
//Salário Liquido:             R$902,00


import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);

        double horasTrabalhada = 0;
        double valorHoras = 0;

        try {

            System.out.println("Valor da hora trabalhada: ");
            valorHoras = scanner.nextDouble();

            System.out.println("Quantas horas trabalhada: ");
            horasTrabalhada = scanner.nextDouble();

        } catch (Exception e) {
            System.out.println("ERRO: Digite apenas números.");
        }

        

        double salarioBruto = (valorHoras * horasTrabalhada);
        double Inss = 0.10f;
        double Fgts = 0.11f;
        double Sindicato = 0.03f;
        double Ir = 0;

        if (salarioBruto <= 900) {
            Ir = 0;  

        } else if (salarioBruto > 900 && salarioBruto < 1500) {
            Ir = 0.05f;
        
        } else if (salarioBruto > 1500 && salarioBruto < 2500) {
            Ir = 0.10f;
        
        } else {
            Ir = 0.20f;
        }

        double descontoInss = salarioBruto * Inss;
        double descontoSindicato = salarioBruto * Sindicato;
        double descontoIr = salarioBruto * Ir;
        double descontoFgts = salarioBruto * Fgts;

        double totalDesconto = descontoInss + descontoIr + descontoSindicato;
        double salarioLiquido = salarioBruto - totalDesconto; 
        
        System.out.println("\n----------------------------------\n");
        System.out.println("|       FOLHA DE PAGAMENTO       |");
        System.out.println("\n----------------------------------\n");
        System.out.printf("HORAS TRABALHADAS: %.0f Horas%n ", horasTrabalhada);
        System.out.printf("\nVALOR HORAS TRABALHADAS: R$%.2f\n", valorHoras);
        System.out.println("\n----------------------------------\n");
        System.out.printf("\nSALÁRIO BRUTO: R$%.2f\n", salarioBruto);
        System.out.printf("\nFGTS: R$%.2f\n", descontoFgts);
        System.out.println("\n----------------------------------\n");
        System.out.printf("\nDESCONTO IR: R$%.2f\n", descontoIr);
        System.out.printf("\nDESCONTO INSS: R$%.2f\n", descontoInss);
        System.out.printf("\nDESCONTO SINDICATO: R$%.2f\n", descontoSindicato);
        System.out.println("\n----------------------------------\n");
        System.out.printf("\nTOTAL DESCONTO: R$%.2f\n", totalDesconto);
        System.out.println("\n----------------------------------\n");
        System.out.printf("\nTOTAL LIQUÍDO: R$%.2f\n", salarioLiquido);
        System.out.println("\n----------------------------------\n");

    scanner.close();

    }
}
