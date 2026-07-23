package aula30;

public class Carrov6 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carrov6() {
        System.out.println("Classe Carro foi instaciada (Via construtor)");
        //Se haver a atribuição na classe, deve se colocar sempre no construtor
        //Pode haver varios construtores se eles forem diferentes
    }

    Carrov6(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirMarcaModelo() {
        System.out.println("Carro " + marca + " " + modelo);
    }

    void exibirNumPassageiros() {
        System.out.println("Suporta " + numPassageiros + " pessoas");
    }


    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        double qtdCombustivel = km / consumoCombustivel;

        return qtdCombustivel;

    }

    void exibirAutonomia() {
        double autonomia = obterAutonomia();
        System.out.println("Autonomia de: " + autonomia + "km");
    }
}
