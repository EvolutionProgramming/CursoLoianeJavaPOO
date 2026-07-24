package aula31;

public class Carrov7 {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    Carrov7() {

    }

    Carrov7(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    private double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        return km / this.consumoCombustivel;

    }

    void exibirAutonomia() {
        double autonomia = this.obterAutonomia();
        System.out.println("Autonomia de: " + autonomia + "km");
    }


    void exibirMarcaModelo() {
        System.out.println("Carro " + this.marca + " " + this.modelo);
    }

    void exibirNumPassageiros() {
        System.out.println("Suporta " + this.numPassageiros + " pessoas");
    }
}
