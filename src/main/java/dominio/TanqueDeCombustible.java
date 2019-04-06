package dominio;

public class TanqueDeCombustible {
    private double capacidadMaxima;
    private double litrosActuales;

    private TanqueDeCombustible(double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.litrosActuales = capacidadMaxima;
    }

    public double capacidadMaxima(){
        return this.capacidadMaxima;
    }

    public double litrosActuales(){
        return this.litrosActuales;
    }


    public boolean EstasEnReserva (){
        return this.litrosActuales < 0.1 * this.capacidadMaxima;
    }

}
