package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class ConversaoDeUnidadesDeVolume {
    private static double resultado;

    // 1 litro convertido para centímetros cúbicos
    private static double litroParaCm3 = 1000;
    // 1 metro cúbico para litros
    private static double metro3PraLitros = 1000;
    // 1 metro cúbico convertido para pés cúbicos
    private static double metro3ParaPes3 = 35.32;
    // 1 galão americano convertido para polegadas cúbicas
    private static double galaoAmericanoParaPol3 = 231;
    // 1 galão americano convertido para litros
    private static double galaoAmericanoPraLitros = 3.785;

    public static double converterLitroParaCentimetrosCubicos(double numero) {
        return numero * getLitroParaCm3();
    }

    public static double converterMetroCubicoParaLitros(double numero) {
        return numero * getMetro3PraLitros();
    }

    public static double converterMetroCubicoParaPesCubicos(double numero) {
        return numero * getMetro3ParaPes3();
    }

    public static double converterGalaoAmericanoParaPolegadasCubicas(double numero) {
        return numero * getGalaoAmericanoParaPol3();
    }

    public static double converterGalaoAmericanoParaLitros(double numero) {
        return numero * getGalaoAmericanoPraLitros();
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado_) {
        resultado = resultado_;
    }

    public static double getLitroParaCm3() {
        return litroParaCm3;
    }

    public static double getMetro3PraLitros() {
        return metro3PraLitros;
    }

    public static double getMetro3ParaPes3() {
        return metro3ParaPes3;
    }

    public static double getGalaoAmericanoParaPol3() {
        return galaoAmericanoParaPol3;
    }

    public static double getGalaoAmericanoPraLitros() {
        return galaoAmericanoPraLitros;
    }
}
