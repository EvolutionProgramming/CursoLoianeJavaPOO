package tema4_variaveis_e_metodos_estaticos.aula34exercicios;

public class ConversaoDeUnidadesDeTempo {
    private static double resultado;

    // 1 minuto convertido para minutos
    private static final double MINUTO_PARA_SEGUNDOS= 60;
    // 1 hora convertido para minutos
    private static final double HORA_PARA_MINUTOS = 60;
    // 1 dia convertido para horas
    private static final double DIA_PARA_HORAS = 24;
    // 1 semana convertido para dias
    private static final double SEMANA_PARA_DIAS = 7;
    // 1 mês convertido para dias
    private static final double MES_PARA_DIAS = 30;
    // 1 ano convertido para dias
    private static final double ANO_PARA_DIAS = 365.25;

    public static double converterMinutoParaSegundos(double numero) {
        return numero * MINUTO_PARA_SEGUNDOS;
    }

    public static double converterHoraParaMinutos(double numero) {
        return numero * HORA_PARA_MINUTOS;
    }

    public static double converterDiaParaHoras(double numero) {
        return numero * DIA_PARA_HORAS;
    }

    public static double converterSemanaParaDias(double numero) {
        return numero * SEMANA_PARA_DIAS;
    }

    public static double converterMesParaDias(double numero) {
        return numero * MES_PARA_DIAS;
    }

    public static double converterAnoParaDias(double numero) {
        return numero * ANO_PARA_DIAS;
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado_) {
        resultado = resultado_;
    }
}
