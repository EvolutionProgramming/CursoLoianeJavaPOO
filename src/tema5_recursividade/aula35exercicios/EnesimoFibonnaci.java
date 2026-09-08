package tema5_recursividade.aula35exercicios;

public class EnesimoFibonnaci {
    public static int retornarEnesimoValor(int n) {
        if (n <= 1) {
            return n; // Para n = 0 retorna 0, para n = 1 retorna 1
        }
        return retornarEnesimoValor(n - 1) + retornarEnesimoValor(n - 2);
    }
}
