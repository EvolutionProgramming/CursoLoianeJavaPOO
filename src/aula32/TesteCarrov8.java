package aula32;


import java.util.Scanner;

public class TesteCarrov8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Carrov8 popular = new Carrov8();

        popular.setMarca("Ford");
        popular.setModelo("Fiesta");
        popular.setNumPassageiros(5);
        popular.setCapCombustivel(47.0);
        popular.setConsumoCombustivel(12.0);

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
