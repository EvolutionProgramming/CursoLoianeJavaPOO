package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class Calculadora {
    private static double n1, n2;
    private static double resultado;

    public static double processarOpcao(int opcao, int n1, int n2) {
        switch (opcao) {
            case 1:
                return Calculadora.somar(n1, n2);
            case 2:
                return Calculadora.subtrair(n1, n2);
            case 3:
                return Calculadora.multiplicar(n1, n2);
            case 4:
                return Calculadora.divisar(n1, n2);
            case 5:
                return Calculadora.elevarPotencia(n1, n2);
            default:
                return 0;
        }
    }

    public static double processarFatorial(int number) {

        long fatorial = 1;

        for (int i = 1; i <= number; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

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
