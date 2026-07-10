package aula26;

import java.util.Scanner;

public class TesteCarrov3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Carrov3 popular = new Carrov3();

        popular.marca = "Ford";
        popular.modelo = "Fiesta";
        popular.numPassageiros = 5;
        popular.capCombustivel = 47.0;
        popular.consumoCombustivel = 12.0;

        popular.exibirMarcaModelo();
        popular.exibirNumPassageiros();
        System.out.println();

        System.out.println("Gostaria de obter o calculo da autonomia do veículo? (Digite S ou N)");
        char querObter = sc.nextLine().charAt(0);

        if (Character.toLowerCase(querObter) == 's'){
            popular.exibirAutonomia();
        }
    }
}
