package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class Contador {

    private static int valor;

    public Contador() {
        valor++;
    }

    public static void zerarValor(){
        setValor(0);
    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        Contador.valor = valor;
    }
}
