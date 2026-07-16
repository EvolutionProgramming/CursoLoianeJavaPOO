package aula27exercicios;

import java.util.Scanner;

public class Lampadav2Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampadav2 lampada = new Lampadav2();

        int comando;
        boolean validador = true;

        while (validador) {
            System.out.println("Digite 1 para Ligar ou 2 para Desligar (Digite qualquqer valor para sair do menu)");
            comando = sc.nextInt();
            sc.nextLine();

            validador = validadorComando(comando);
            Lampadav2Teste.exibirResultadoComando(validador, comando, lampada);

        }
        sc.close();
    }

    static boolean validadorComando(int comando) {
        return comando > 0 && comando < 3;
    }

    static void exibirResultadoComando(boolean validador, int comando, Lampadav2 lampada) {
        if (validador) {
            if (comando == 1 && lampada.estado) {
                System.out.println("------------------------------");
                System.out.println("Lampada já está ligada!!!");
                System.out.println("------------------------------");
                System.out.println();
            } else if (comando == 2 && !lampada.estado) {
                System.out.println("------------------------------");
                System.out.println("Lampada já está desligada!!!");
                System.out.println("------------------------------");
                System.out.println();

            } else if (comando == 1) {
                System.out.println("------------------------------");
                System.out.println("Você ligou a lâmpada!");
                System.out.println("------------------------------");
                System.out.println();
                lampada.ligarLampada();

            } else if (comando == 2) {
                System.out.println("------------------------------");
                System.out.println("Você desligou a lâmpada!");
                System.out.println("------------------------------");
                System.out.println();
                lampada.desligarLampada();
            }
        } else {
            System.out.println("Finalizando sistema...");
        }
    }
}
