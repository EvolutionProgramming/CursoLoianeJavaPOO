package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

import java.util.Scanner;

public class ConversaoDeUnidadesDeVolumeTeste {
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
                    case 1: //Converte litro para centímetros cúbicos
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeVolume.converterLitroParaCentimetrosCubicos(numero);
                        ConversaoDeUnidadesDeVolume.setResultado(numeroConvertido);
                        break;
                    case 2: //Converte metro cúbico para litros
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeVolume.converterMetroCubicoParaLitros(numero);
                        ConversaoDeUnidadesDeVolume.setResultado(numeroConvertido);
                        break;
                    case 3: //Converte metro cúbico para pés cúbicos
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeVolume.converterMetroCubicoParaPesCubicos(numero);
                        ConversaoDeUnidadesDeVolume.setResultado(numeroConvertido);
                        break;
                    case 4: //Converte galão americano para polegadas cúbicas
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeVolume.converterGalaoAmericanoParaPolegadasCubicas(numero);
                        ConversaoDeUnidadesDeVolume.setResultado(numeroConvertido);
                        break;
                    case 5: // Converte galão americano para litros
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeVolume.converterGalaoAmericanoParaLitros(numero);
                        ConversaoDeUnidadesDeVolume.setResultado(numeroConvertido);
                        break;
                    case 0:
                        System.out.println("FINALIZANDO O SISTEMA");
                        break;
                    default:
                        System.out.println("ERRO: DIGITE UM VALOR VÁLIDO DO MENU");
                        continue;
                }
                if (opcao != 0) {
                    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeVolume.getResultado());
                }
            } catch (NumberFormatException e) {
                espacarTexto();
                System.out.println("ERRO: DIGITE UM VALOR VÁLIDO");
            }
        } while (opcao != 0);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("-----------------------------");
        System.out.println("DIGITE 1 (Converte litro para centímetros cúbicos)");
        System.out.println("DIGITE 2 (Converte metro cúbico para litros) ");
        System.out.println("DIGITE 3 (Converte metro cúbico para pés cúbicos)");
        System.out.println("DIGITE 4 (Converte  galão americano para polegadas cúbicas)");
        System.out.println("DIGITE 5 (Converte galão americano para litros");
        System.out.println("DIGITE 0 PARA SAIR DO SISTEMA");
        System.out.println("-----------------------------");
    }

    public static void espacarTexto() {
        for (int cont = 0; cont < 3; cont++) {
            System.out.println();
        }
    }
}
