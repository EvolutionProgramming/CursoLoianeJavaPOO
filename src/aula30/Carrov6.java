package aula30;

public class Carrov6 {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carrov6() {

    }

    Carrov6(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        return km / this.consumoCombustivel;

    }

    void exibirAutonomia() {
        double autonomia = obterAutonomia();
        System.out.println("Autonomia de: " + autonomia + "km");
    }


    public void exibirMarcaModelo() {
        System.out.println("Carro " + this.marca + " " + this.modelo);
    }

    public void exibirNumPassageiros() {
        System.out.println("Suporta " + this.numPassageiros + " pessoas");
    }
}
