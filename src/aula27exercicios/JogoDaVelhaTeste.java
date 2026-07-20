package aula27exercicios;

import java.util.Scanner;

public class JogoDaVelhaTeste {
    public static void main(String[] args) {
        JogoDaVelha jogo1 = new JogoDaVelha();
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja iniciar o jogo? (Digite 1 para sim) e (Digite 0 para não)");
        int comando = sc.nextInt();
        sc.nextLine();

        if (validarComando(comando)) {

            System.out.println("Digite o nome do Jogador1 (Joga com X)");
            jogo1.jogador1 = sc.nextLine();
            System.out.println("Digite o nome do Jogador2 (Joga com O)");
            jogo1.jogador2 = sc.nextLine();
        } else {

            System.out.println("Saindo do jogo");
            System.exit(0);
        }

        jogo1.turno = 0;
        while (validarComando(comando)) {
            String nomeTurno = jogo1.validarVez(jogo1.turno);
            mostrarTabuleiro(jogo1);
            System.out.println("Vez de " + nomeTurno);
            System.out.println("Informe a fileira: ");
            int fileira = sc.nextInt();
            System.out.println("Informe a coluna: ");
            int coluna = sc.nextInt();

            if (jogo1.validarPosicao(fileira, coluna)) {
                limparConsole();
                jogo1.atualizarTabuleiro(fileira, coluna);
                String estado = jogo1.verificarEstadoDoJogo();

                if (!estado.equals("andamento")) {
                    mostrarTabuleiro(jogo1);
                    System.out.println();

                    if (estado.equals("empate")) {
                        System.out.println("Deu velha! O jogo terminou empatado.");
                    } else {
                        System.out.println("Parabéns, " + estado + "! Você venceu o jogo! ");
                    }

                    break;
                }
                jogo1.turno++;
            } else {
                limparConsole();
                System.out.println("Posição inválida ou já está ocupada. Tente outra vez!");
                System.out.println();
            }

        }
        sc.close();
    }

    static boolean validarComando(int comando) {
        return comando == 1;
    }

    static void mostrarTabuleiro(JogoDaVelha jogo) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + jogo.getTabuleiro()[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
    }

    static void limparConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
