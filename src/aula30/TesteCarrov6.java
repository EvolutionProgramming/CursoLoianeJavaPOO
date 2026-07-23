package aula30;

import java.util.Scanner;

public class TesteCarrov6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Carrov6 popular = new Carrov6("Ford", "Fiesta", 5, 47.0, 12.0);

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
    }
}
