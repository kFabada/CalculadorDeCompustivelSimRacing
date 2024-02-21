package entites;

public class GeradorCombustivel {
    public int tempoTotal;
    public int tempoVolta;
    public double consumoVolta;
    public GeradorCombustivel() {
    }
    public int calTotalVolta() {
        int cal = (tempoTotal * 60) / tempoVolta;
        return cal;
    }
    public int totalConsumo() {
        double cal = consumoVolta * calTotalVolta();
        return (int) cal;
    }


    public String toString() {
        return
                "tempoTotal = " + tempoTotal +
                " tempoVolta = " + tempoVolta +
                " consumoVolta = " + consumoVolta ;
    }
}
