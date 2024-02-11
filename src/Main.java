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
        System.out.print("que dividir o numero de pitstop escolha y para divisão: ");

        char escolha = sc.next().charAt(0);
        if (escolha == 'Y'){
            System.out.print("Digite a quantidade de pitsop que vai querer fazer ");
            int pitstopqtd = sc.nextInt();
            int cal = gerador.totalConsumo() / pitstopqtd;
            System.out.print("o numero de pitsop é: " + pitstopqtd + " e a quantidade de combustivel por pit é " + cal );
        }



        sc.close();
    }
}

//Tempo Total de Corrida
//
//Tempo por Volta
//
//Número de Voltas
//
//Consumo por Volta 2.7 * totalVolta
//
//Capacidade do Tanque