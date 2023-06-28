package test;
import logica.*;

public class Main {
    public static void main(String[] args) {
        Recibo recibo = ReciboFactory.generarRecibo(851.6,20173,20357.5,27870);
        System.out.println("Valor a pagar en recibo de luz: "+Math.round(recibo.calcularValorLuz())+" COP, incluye costo de aseo de "+recibo.getAseo());
    }
}