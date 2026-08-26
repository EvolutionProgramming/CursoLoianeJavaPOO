package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

import java.util.Scanner;

public class ConversaoDeUnidadesDeAreaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        do {
            try {
                mostrarMenuPrincipal();
                opcao = Integer.parseInt(sc.nextLine());
                espacarTexto();
                double numero = 0;
                double numeroConvertido = 0;
                switch (opcao) {
                    case 1: //Converte metro para pés quadrados
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeArea.converterMetroQuadrado_PesQuadrados(numero);
                        ConversaoDeUnidadesDeArea.setResultado(numeroConvertido);
                        break;
                    case 2: //Converte pé quadrado para centímetros quadrados
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeArea.converterPeQuadrado_CentimentosQuadrados(numero);
                        ConversaoDeUnidadesDeArea.setResultado(numeroConvertido);
                        break;
                    case 3: //Converte milha quadrada para acres
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeArea.converterMilhaQuadrada_Acres(numero);
                        ConversaoDeUnidadesDeArea.setResultado(numeroConvertido);
                        break;
                    case 4: //Converte acre para pés quadrados
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeArea.converterAcre_PesQuadrados(numero);
                        ConversaoDeUnidadesDeArea.setResultado(numeroConvertido);
                        break;
                    case 0:
                        System.out.println("FINALIZANDO O SISTEMA");
                        break;
                    default:
                        System.out.println("ERRO: DIGITE UM VALOR VÁLIDO DO MENU");
                        continue;
                }
                if (opcao != 0) {
                    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeArea.getResultado());
                }
            } catch (NumberFormatException e) {
                espacarTexto();
                System.out.println("ERRO: DIGITE UM VALOR VÁLIDO");
            }
        } while (opcao != 0);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("-----------------------------");
        System.out.println("DIGITE 1 (Converte metro quadrado para pés quadrados)");
        System.out.println("DIGITE 2 (Converte pé quadrado para centímetros quadrados) ");
        System.out.println("DIGITE 3 (Converte milha quadrada para acres)");
        System.out.println("DIGITE 4 (Converte acre para pés quadrados)");
        System.out.println("DIGITE 0 PARA SAIR DO SISTEMA");
        System.out.println("-----------------------------");
    }

    public static void espacarTexto() {
        for (int cont = 0; cont < 3; cont++) {
            System.out.println();
        }
    }
}
