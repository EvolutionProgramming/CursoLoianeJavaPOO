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
        estado = true;
    }

    public void desligarLampada() {
        estado = false;
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

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTensao() {
        return tensao;
    }

    public void setTensao(int tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
