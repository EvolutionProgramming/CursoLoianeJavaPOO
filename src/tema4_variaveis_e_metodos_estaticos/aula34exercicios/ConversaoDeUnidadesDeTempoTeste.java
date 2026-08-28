package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

import java.util.Scanner;

public class ConversaoDeUnidadesDeTempoTeste {
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
                    case 1: //Converte minuto para segundos
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterMinutoParaSegundos(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 2: //Converte hora para minutos
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterHoraParaMinutos(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 3: //Converte dia para horas
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterDiaParaHoras(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 4: //Converte semana para dias
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterSemanaParaDias(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 5: //Converte mês para dias
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterMesParaDias(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 6: //Converte ano para dias
                        System.out.println("Digite o valor:");
                        numero = Double.parseDouble(sc.nextLine());
                        numeroConvertido = ConversaoDeUnidadesDeTempo.converterAnoParaDias(numero);
                        ConversaoDeUnidadesDeTempo.setResultado(numeroConvertido);
                        break;
                    case 0:
                        System.out.println("FINALIZANDO O SISTEMA");
                        break;
                    default:
                        System.out.println("ERRO: DIGITE UM VALOR VÁLIDO DO MENU");
                        continue;
                }
                if (opcao != 0) {
                    System.out.println("O resultado da conversão é: " + ConversaoDeUnidadesDeTempo.getResultado());
                }
            } catch (NumberFormatException e) {
                espacarTexto();
                System.out.println("ERRO: DIGITE UM VALOR VÁLIDO");
            }
        } while (opcao != 0);
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("-----------------------------");
        System.out.println("DIGITE 1 (Converte minuto para segundos)");
        System.out.println("DIGITE 2 (Converte hora para minutos)");
        System.out.println("DIGITE 3 (Converte dia para horas)");
        System.out.println("DIGITE 4 (Converte semana para dias)");
        System.out.println("DIGITE 5 (Converte mês para dias)");
        System.out.println("DIGITE 6 (Converte ano para dias)");
        System.out.println("DIGITE 0 PARA SAIR DO SISTEMA");
        System.out.println("-----------------------------");
    }

    public static void espacarTexto() {
        for (int cont = 0; cont < 3; cont++) {
            System.out.println();
        }
    }
}
