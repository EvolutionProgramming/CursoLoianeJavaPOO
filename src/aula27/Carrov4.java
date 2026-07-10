package aula27;

public class Carrov4 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

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
        System.out.println("Autonomia de: " +autonomia+ "km");
    }
}
