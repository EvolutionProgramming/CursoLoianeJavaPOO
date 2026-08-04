package tema3_construtores_this_encapsulamento_overload.aula31;

import java.util.Scanner;

public class TesteCarrov7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Carrov7 popular = new Carrov7("Ford", "Fiesta", 5, 47.0, 12.0);

        popular.exibirMarcaModelo();
        popular.exibirNumPassageiros();

        System.out.printf("Para andar 10 kilometros voce vai precisar de: %.2f\n", popular.calcularCombustivel(10));

        System.out.println();

        System.out.println("Gostaria de obter o calculo da autonomia do veículo? (Digite S ou N)");
        char querObter = sc.nextLine().charAt(0);

        if (Character.toLowerCase(querObter) == 's') {
            popular.exibirAutonomia();
        }
    }
}
