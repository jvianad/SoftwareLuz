package logica;

public class ReciboFactory {
    public static Recibo generarRecibo(double valorKW, double calculoInicioMes, double calculoActual, double aseo){
        if (valorKW == 0.0 || calculoInicioMes == 0.0 || calculoActual == 0.0 || aseo == 0.0){
            throw new IllegalArgumentException("Recibo invalido, valores erroneos");
        }else{
            return new Recibo(valorKW, calculoInicioMes, calculoActual, aseo);
        }
    }
}
