package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class ConversaoDeUnidadesDeTempo {
    private static double resultado;

    // 1 minuto convertido para minutos
    private static double minutoPraSegundos= 60;
    // 1 hora convertido para minutos
    private static double horaPraMinutos = 60;
    // 1 dia convertido para horas
    private static double diaPraHoras = 24;
    // 1 semana convertido para dias
    private static double semanaPraDias = 7;
    // 1 mês convertido para dias
    private static double mesPraDias = 30;
    // 1 ano convertido para dias
    private static double anoPraDias = 365.25;

    public static double converterMinutoParaSegundos(double numero) {
        return numero * getMinutoPraSegundos();
    }

    public static double converterHoraParaMinutos(double numero) {
        return numero * getHoraPraMinutos();
    }

    public static double converterDiaParaHoras(double numero) {
        return numero * getDiaPraHoras();
    }

    public static double converterSemanaParaDias(double numero) {
        return numero * getSemanaPraDias();
    }

    public static double converterMesParaDias(double numero) {
        return numero * getMesPraDias();
    }

    public static double converterAnoParaDias(double numero) {
        return numero * getAnoPraDias();
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado_) {
        resultado = resultado_;
    }

    public static double getMinutoPraSegundos() {
        return minutoPraSegundos;
    }

    public static double getHoraPraMinutos() {
        return horaPraMinutos;
    }

    public static double getDiaPraHoras() {
        return diaPraHoras;
    }

    public static double getSemanaPraDias() {
        return semanaPraDias;
    }

    public static double getMesPraDias() {
        return mesPraDias;
    }

    public static double getAnoPraDias() {
        return anoPraDias;
    }
}
