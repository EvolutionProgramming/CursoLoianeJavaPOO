package aula24;

public class TesteCarro {
    public static void main(String args[]){
        Carro popular = new Carro();
        popular.marca = "Ford";
        popular.modelo = "Fiesta";
        popular.numPassageiros = 5;
        popular.capCombustivel = 47.0;
        popular.consumoCombustivel = 12.0;

        System.out.println(popular.marca);
    }
}
