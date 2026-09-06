package tema5_recursividade.aula35;

public class MinhaCalculadorav2 {
    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static int soma(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }

        return total;
    }

    public static double processarFatorialNaoRecursivo(double number) {

        double fatorial = 1;

        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static double processarFatorialRecursivo(double number) {

        if(number == 0) {
            return 1;
        }

        return number * processarFatorialRecursivo(number -1 );
    }
}
