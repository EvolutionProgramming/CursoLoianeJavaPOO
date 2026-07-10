package aula25;

public class TesteCarrov2 {
    public static void main(String args[]){
        Carrov2 popular = new Carrov2();
        popular.marca = "Ford";
        popular.modelo = "Fiesta";
        popular.numPassageiros = 5;
        popular.capCombustivel = 47.0;
        popular.consumoCombustivel = 12.0;

        popular.exibirMarcaModelo();
        popular.exibirAutonomia();
        popular.exibirNumPassageiros();
    }
}
