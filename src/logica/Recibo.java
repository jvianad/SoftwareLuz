package logica;
public class Recibo {
    private double valorKW;
    private double calculoInicioMes;
    private double calculoActual;
    private double aseo;

    public Recibo(double valorKW, double calculoInicioMes, double calculoActual, double aseo) {
        this.valorKW = valorKW;
        this.calculoInicioMes = calculoInicioMes;
        this.calculoActual = calculoActual;
        this.aseo = aseo;
    }

    public double calcularValorLuz(){
        double costoLuzBruto = this.valorKW*(this.calculoActual-this.calculoInicioMes);
        double subsidioEstrato2 = ((calculoActual-calculoInicioMes)*0.85)*(420.72);
        double total = costoLuzBruto-subsidioEstrato2+this.aseo;
        return total;
    }

    public double getAseo() {
        return aseo;
    }


    //OTRA MANERA DE IMPLEMENTAR FUNCIONES
/*    public double costoLuzTotal(){
        double total = 0;
        total=this.valorKW*(this.calculoActual-this.calculoInicioMes);
        return total;
    }

    public double subsidio(){
        double subsidio = 0;
        subsidio = ((calculoActual-calculoInicioMes)*0.85)*(420.72);
        return subsidio;
    }

    public double costoFinalLuz(){
        double totalfinal = 0;
        totalfinal = costoLuzTotal()-subsidio()+this.aseo;
        return totalfinal;
    }*/
}
