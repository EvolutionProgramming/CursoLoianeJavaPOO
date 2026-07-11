package aula27exercicios;

import java.util.Scanner;

public class Lampadav2Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampadav2 lampada = new Lampadav2();

        int comando;
        boolean validador = true;

        while (validador) {
            System.out.println("Digite 1 para Ligar ou 2 para Desligar (Digite 0 para sair)");
            comando = sc.nextInt();
            validador = lampada.validadorComando(comando);

            switch (comando) {
                case 1:
                    lampada.ligarLampada();
                    break;
                case 2:
                    lampada.desligarLampada();
                    break;
                case 0:
                    lampada.sairLampada();
                    break;
                default:
                    lampada.informarComandoInvalido();
                    continue;

            }
        }
    }
}
