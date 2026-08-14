package tema3_construtores_this_encapsulamento_overload.aula33a28exercicios;

public class Lampadav3 {
    private String marca;
    private String tecnologia;
    private String cor;
    private double preco;
    private int tensao;
    private int potencia;
    private boolean estado;

    public Lampadav3(){
        this.marca = "Elgin";
        this.tecnologia = "LED Smart Wi-Fi";
        this.cor = "RGB";
        this.preco = 45.00;
        this.tensao = 110;
        this.potencia = 10;
    }

    public void ligarLampada() {
        setEstado(true);
    }

    public void desligarLampada() {
        setEstado(false);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public int getTensao() {
        return tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
