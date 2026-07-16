package aula27exercicios;

public class JogoDaVelha {
    String jogador1, jogador2;
    char simboloX = 'X', simboloO = 'O';
    char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    int turno;

    void mostrarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----------");
        }
    }

    void atualizaTabuleiro(int fileira, int coluna) {
        tabuleiro[fileira][coluna] = atualizaSimbolo(this.turno);
    }

    void limparConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    String validaVez(int vez) {
        return (vez % 2 == 0) ? this.jogador1 : this.jogador2;
    }

    String verificarEstadoDoJogo() {
        // 1. Verificar Linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
                return (tabuleiro[i][0] == simboloX) ? jogador1 : jogador2;
            }
        }

        // 2. Verificar Colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[0][j] != ' ') {
                return (tabuleiro[0][j] == simboloX) ? jogador1 : jogador2;
            }
        }

        // 3. Verificar Diagonal Principal
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
            return (tabuleiro[0][0] == simboloX) ? jogador1 : jogador2;
        }

        // 4. Verificar Diagonal Secundária
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
            return (tabuleiro[0][2] == simboloX) ? jogador1 : jogador2;
        }

        // 5. Verificar se ainda há jogadas possíveis
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return "andamento";
                }
            }
        }

        // 6. Se não houve vencedor e o tabuleiro está cheio
        return "empate";
    }

    char atualizaSimbolo(int turno) {
        return (turno % 2 == 0) ? simboloX : simboloO;
    }

    boolean validaPosicao(int fileira, int coluna) {
        if ((fileira >= 0 && fileira < 3) && (coluna >= 0 && coluna < 3)) {
            if (Character.valueOf(tabuleiro[fileira][coluna]).equals(' ')) {
                return true;
            }
        }

        return false;
    }

    boolean validaComando(int comando) {
        return comando == 1;
    }
}
