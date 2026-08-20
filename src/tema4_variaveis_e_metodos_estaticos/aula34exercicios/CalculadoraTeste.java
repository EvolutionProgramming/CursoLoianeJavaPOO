package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        do {

            try {
                espacarTexto();
                mostrarMenuOperacoes();
                opcao = Integer.parseInt(sc.nextLine());

                int n1, n2;
                if (opcao != 6) {
                    System.out.println("Digite o primeiro número:");
                    n1 = Integer.parseInt(sc.nextLine());
                    Calculadora.setN1(n1);
                    System.out.println("Digite o segundo número:");
                    n2 = Integer.parseInt(sc.nextLine());
                    Calculadora.setN2(n2);

                    espacarTexto();
                    Calculadora.setResultado(Calculadora.processarOpcao(opcao, n1, n2));
                } else {
                    int num;
                    System.out.println("Digite o número da operação fatorial");
                    num = Integer.parseInt(sc.nextLine());
                    Calculadora.setResultado(Calculadora.processarFatorial(num));
                }

                if (opcao > 0 && opcao <= 6) {
                    System.out.println("O resultado é: " + Calculadora.getResultado());
                }

            } catch (NumberFormatException e) {
                espacarTexto();
                System.out.println("ERRO: DIGITE UM VALOR VÁLIDO");
                espacarTexto();
            }


        } while (opcao != 0);
    }

    public static void mostrarMenuOperacoes() {
        System.out.println("---------------------------------");
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para dividir");
        System.out.println("Digite 5 para elevar potência");
        System.out.println("Digite 6 para calcular fatorial");
        System.out.println("---------------------------------");
    }

    public static void espacarTexto() {
        for (int cont = 0; cont < 3; cont++) {
            System.out.println();
        }
    }

}
