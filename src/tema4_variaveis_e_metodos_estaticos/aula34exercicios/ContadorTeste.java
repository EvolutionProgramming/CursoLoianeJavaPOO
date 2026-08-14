package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

import java.util.Scanner;

public class ContadorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int comando;
        do {
            System.out.println("Digite 1 para incrementar");
            System.out.println("Digite 2 para mostrar o valor");
            System.out.println("Digite 3 para zerar o valor");
            comando = sc.nextInt();

            switch (comando) {
                case 1:
                    new Contador();
                    break;

                case 2:
                    System.out.println(Contador.getValor());
                    break;
                case 3:
                    Contador.zerarValor();
                    break;
            }

        } while (comando != 0);

    }
}
