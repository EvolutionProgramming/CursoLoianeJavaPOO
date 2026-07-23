package aula30;

import aula29.Carrov5;

import java.util.Scanner;

public class TesteCarrov6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Carrov6 popular = new Carrov6();

        popular.marca = "Ford";
        popular.modelo = "Fiesta";
        popular.numPassageiros = 5;
        popular.capCombustivel = 47.0;
        popular.consumoCombustivel = 12.0;

        popular.exibirMarcaModelo();
        popular.exibirNumPassageiros();

        double qtdCombustivel = popular.calcularCombustivel(10);
        System.out.printf("Para andar 10 kilometros voce vai precisar de: %.2f\n", qtdCombustivel);

        System.out.println();

        System.out.println("Gostaria de obter o calculo da autonomia do veículo? (Digite S ou N)");
        char querObter = sc.nextLine().charAt(0);

        if (Character.toLowerCase(querObter) == 's') {
            popular.exibirAutonomia();
        }

        // ferrari inventada (numeros irreais)
        Carrov6 popular2 = new Carrov6("Ferrari", "Roma", 10, 66, 15);
        System.out.println(popular2.marca + "\n" + popular2.modelo + "\n" + popular2.numPassageiros + "\n" + popular2.capCombustivel + "\n" + popular2.consumoCombustivel);
        System.out.println();
    }
}
