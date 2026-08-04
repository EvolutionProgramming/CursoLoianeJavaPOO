package aula33a28exercicios;

public class JogoDaVelhav2 {

    private String jogador1, jogador2;
    private char simboloX = 'X', simboloO = 'O';
    private char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    private int turno;

    public char[][] getTabuleiro() {
        return this.tabuleiro;
    }

    public void atualizarTabuleiro(int fileira, int coluna) {
        tabuleiro[fileira][coluna] = atualizarSimbolo(this.turno);
    }

    public char atualizarSimbolo(int turno) {
        return (turno % 2 == 0) ? simboloX : simboloO;
    }

    public String validarVez(int turno) {
        return (turno % 2 == 0) ? this.jogador1 : this.jogador2;
    }

    public void proximoTurno() {
        this.turno++;
    }

    public String verificarEstadoDoJogo() {
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

    public boolean validarPosicao(int fileira, int coluna) {
        if ((fileira >= 0 && fileira < 3) && (coluna >= 0 && coluna < 3)) {
            return Character.valueOf(tabuleiro[fileira][coluna]).equals(' ');
        }

        return false;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
