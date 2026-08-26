package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class ConversaoDeUnidadesDeArea {
    private static double resultado;

        // 1 metro quadrado convertido para pes quadrados
        private static double metroQuadradoConvertido = 10.76;
        // 1 pé quadrado convertido para centímetros quadrados
        private static double peQuadradoConvertido = 929;
        // 1 milha quadrada convertido para acres
        private static double milhaConvertida = 640;
        // 1 acre convertido para pes quadrados
        private static double acreConvertido = 43.560;

    public static double converterMetroQuadrado_PesQuadrados(double numero) {
        return numero * getMetroQuadradoConvertido();
    }

    public static double converterPeQuadrado_CentimentosQuadrados(double numero) {
        return numero * getPeQuadradoConvertido();
    }

    public static double converterMilhaQuadrada_Acres(double numero) {
        return numero * getMilhaConvertida();
    }

    public static double converterAcre_PesQuadrados(double numero) {
        return numero * getAcreConvertido();
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado_) {
        resultado = resultado_;
    }

    public static double getMetroQuadradoConvertido() {
        return metroQuadradoConvertido;
    }

    public static double getPeQuadradoConvertido() {
        return peQuadradoConvertido;
    }

    public static double getMilhaConvertida() {
        return milhaConvertida;
    }

    public static double getAcreConvertido() {
        return acreConvertido;
    }
}
