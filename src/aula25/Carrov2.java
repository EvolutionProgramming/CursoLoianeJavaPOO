package aula25;

public class Carrov2 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirMarcaModelo() {
        System.out.println("Carro "+marca+" "+modelo);
    }

    void exibirNumPassageiros() {
        System.out.println("Suporta "+numPassageiros+" pessoas");
    }

    void exibirAutonomia(){
        System.out.println("Autonomia de: "+capCombustivel * consumoCombustivel+"km");
    }
}
