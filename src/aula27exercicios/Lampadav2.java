package aula27exercicios;

public class Lampadav2 {
    String marca;
    String tecnologia;
    String cor;
    double preco;
    int tensao;
    int potencia;

    boolean validadorComando(int comando) {
        return comando != 0;
    }

    void informarComandoInvalido() {
        System.out.println("Comando inválido! Digite 1 para Ligar ou 2 para Desligar");
        System.out.println();
        System.out.println("--------------------------------");
    }

    void ligarLampada() {
        System.out.println("Lampada LIGADA com sucesso!");
        System.out.println();
        System.out.println("--------------------------------");
    }

    void desligarLampada() {
        System.out.println("Lampada DESLIGADA com sucesso!");
        System.out.println();
        System.out.println("--------------------------------");

    }

    void sairLampada() {
        System.out.println("Saindo do Sistema...");
        System.exit(0);
    }
}
