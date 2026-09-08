package tema5_recursividade.aula35exercicios;

public class Somatorio1aN {
    public static int somar1aN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + somar1aN(n - 1);
    }
}
