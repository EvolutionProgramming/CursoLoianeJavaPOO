package aula32;

public class Carrov8 {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    private double obterAutonomia() {
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        return km / this.consumoCombustivel;

    }

    void exibirAutonomia() {
        System.out.println("Autonomia de: " + this.obterAutonomia() + "km");
    }


    void exibirMarcaModelo() {
        System.out.println("Carro " + this.marca + " " + this.modelo);
    }

    void exibirNumPassageiros() {
        System.out.println("Suporta " + this.numPassageiros + " pessoas");
    }

    String getMarca() {
        return this.marca;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    String getModelo() {
        return this.modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getNumPassageiros() {
        return this.numPassageiros;
    }

    void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    double getCapCombustivel() {
        return this.capCombustivel;
    }

    void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    double getConsumoCombustivel() {
        return this.consumoCombustivel;
    }

    void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }
}
