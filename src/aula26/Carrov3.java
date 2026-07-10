package aula26;

public class Carrov3 {
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

    void exibirAutonomia() {
        double autonomia = obterAutonomia();
        System.out.println("Autonomia de: " +autonomia+ "km");
    }
}
