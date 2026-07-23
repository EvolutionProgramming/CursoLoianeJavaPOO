package aula29;

import aula27.Carrov4;

import java.util.Scanner;

public class TesteCarrov5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Carrov5 popular = new Carrov5();

        popular.marca = "Ford";
        popular.modelo = "Fiesta";
        popular.numPassageiros = 5;
        popular.capCombustivel = 47.0;
        popular.consumoCombustivel = 12.0;
        // ferrari inventada (numeros irreais)
        Carrov5 popular2 = new Carrov5("Ferrari", "Roma", 10, 66,15);
        System.out.println(popular2.marca + "\n" + popular2.modelo + "\n"+ popular2.numPassageiros + "\n"+ popular2.capCombustivel + "\n" + popular2.consumoCombustivel);
    }
}
