package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class Calculadora {
    private static double n1, n2;
    private static double resultado;

    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisar(double n1, double n2) {
        if (n1 == 0) {
            return 0;
        }

        return n1 / n2;
    }

    public static double elevarPotencia(double n1, double n2) {
        return Math.pow(n1,n2);
    }


    public static void setN1(double n1) {
        Calculadora.n1 = n1;
    }


    public static void setN2(double n2) {
        Calculadora.n2 = n2;
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado) {
        Calculadora.resultado = resultado;
    }
}
