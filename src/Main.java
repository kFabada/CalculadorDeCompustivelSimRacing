import entites.GeradorCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        GeradorCombustivel gerador = new GeradorCombustivel();
        System.out.print("Calculador de Combustivel");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.print("Digite tempo total em minutos: ");
        gerador.tempoTotal = sc.nextInt();
        System.out.print("Digite tempo por volta em segundo: ");
        gerador.tempoVolta = sc.nextInt();
        System.out.print("A quantidade de voltas é: " + gerador.calTotalVolta());
        System.out.print("\n");
        System.out.print("Digite a quantidade de litros por volto: " );
        gerador.consumoVolta = sc.nextDouble();
        System.out.print("O consumo total da corrida é: " + gerador.totalConsumo() + "L\n");
        System.out.print("Que dividir o numero de pitstop escolha y para divisão: ");
        char escolha = sc.next().charAt(0);
        if (escolha == 'y'){
            System.out.print("Digite a quantidade de pitsop que vai querer fazer ");
            double pitstopqtd = sc.nextInt();
            double cal = gerador.totalConsumo() / pitstopqtd;
            System.out.print("o numero de pitsop é: " + (int)pitstopqtd + " e a quantidade de combustivel por pit é " + cal );
        }


        sc.close();
    }
}

