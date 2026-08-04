package tema3_construtores_this_encapsulamento_overload.aula33a28exercicios;

import java.util.Scanner;

public class Lampadav3Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lampadav3 lampada = new Lampadav3();

        int comando;
        boolean validador = true;

        exibirAtributosLampada(lampada);
        System.out.println();

        while (validador) {
            System.out.println("Digite 1 para Ligar ou 2 para Desligar (Digite qualquqer valor para sair do menu)");
            comando = sc.nextInt();
            sc.nextLine();

            validador = validadorComando(comando);
            Lampadav3Teste.exibirResultadoComando(validador, comando, lampada);

        }
        sc.close();
    }

    private static boolean validadorComando(int comando) {
        return comando > 0 && comando < 3;
    }

    private static void exibirResultadoComando(boolean validador, int comando, Lampadav3 lampada) {
        if (validador) {
            if (comando == 1 && lampada.isEstado()) {
                System.out.println("------------------------------");
                System.out.println("Lampada já está ligada!!!");
                System.out.println("------------------------------");
                System.out.println();
            } else if (comando == 2 && !lampada.isEstado()) {
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

    private static void exibirAtributosLampada(Lampadav3 lampada) {
        System.out.println("INFORMAÇÕES DA LAMPADA");
        System.out.println("------------------------------");
        System.out.println("Marca: "+lampada.getMarca());
        System.out.println("Tecnologia: "+lampada.getTecnologia());
        System.out.println("Cor: "+lampada.getCor());
        System.out.println("Preço: "+lampada.getPreco());
        System.out.println("Tensão: "+lampada.getTensao());
        System.out.println("Potência: "+lampada.getPotencia());

    }
}
