package aula27exercicios;

import java.util.Scanner;

public class JogoDaVelhaTeste {
    public static void main(String[] args) {
        JogoDaVelha jogo1 = new JogoDaVelha();
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja iniciar o jogo? (Digite 1 para sim) e (Digite 0 para não)");
        int comando = sc.nextInt();
        sc.nextLine();

        if (jogo1.validaComando(comando)) {

            System.out.println("Digite o nome do Jogador1 (Joga com X)");
            jogo1.jogador1 = sc.nextLine();
            System.out.println("Digite o nome do Jogador2 (Joga com O)");
            jogo1.jogador2 = sc.nextLine();
        } else {

            System.out.println("Saindo do jogo");
            System.exit(0);
        }

        jogo1.turno = 0;
        while (jogo1.validaComando(comando)) {
            String nomeTurno = jogo1.validaVez(jogo1.turno);
            jogo1.mostrarTabuleiro();
            System.out.println("Vez de " + nomeTurno);
            System.out.println("Informe a fileira: ");
            int fileira = sc.nextInt();
            System.out.println("Informe a coluna: ");
            int coluna = sc.nextInt();

            if (jogo1.validaPosicao(fileira, coluna)) {
                jogo1.limparConsole();
                jogo1.atualizaTabuleiro(fileira, coluna);
                String estado = jogo1.verificarEstadoDoJogo();

                if (!estado.equals("andamento")) {
                    jogo1.mostrarTabuleiro();
                    System.out.println();

                    if (estado.equals("empate")) {
                        System.out.println("Deu velha! O jogo terminou empatado.");
                    } else {
                        System.out.println("Parabéns, " + estado + "! Você venceu o jogo! ");
                    }

                    break;
                }
                jogo1.turno++;
                jogo1.atualizaSimbolo(jogo1.turno);
            } else {
                jogo1.limparConsole();
                System.out.println("Posição inválida ou já está ocupada. Tente outra vez!");
                System.out.println();
            }

        }
        sc.close();
    }
}
