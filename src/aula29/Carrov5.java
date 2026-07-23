package aula29;

public class Carrov5 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carrov5() {
        System.out.println("Classe Carro foi instaciada (Via construtor)");
        //Se haver a atribuição na classe, deve se colocar sempre no construtor
        //Pode haver varios construtores se eles forem diferentes
    }

    Carrov5(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
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
