package tema2_classes_e_metodos.aula27exercicios;

public class Lampadav2 {
    String marca;
    String tecnologia;
    String cor;
    double preco;
    int tensao;
    int potencia;
    boolean estado;


    void ligarLampada() {
        estado = true;
    }

    void desligarLampada() {
        estado = false;
    }

}
