package Reservas;

public class Evento extends Reserva{
    private String tipoEento;
    private double costoBase;


    public Evento(String cliente, int id,  int fecha,String tipoEento, double costoBase){
        super(cliente, id , fecha);
        this.tipoEento=tipoEento;
        this.costoBase=costoBase;


    }

    public String getTipoEento() {
        return tipoEento;
    }

    public double getCostoBase() {
        return costoBase;
    }

    @Deprecated
    public void calcularCosto(){
        super.calcularCostos();
        System.out.println("Es un tipo de evento de caracarter: "+tipoEento);
        System.out.println(" El costo base del evento es de: "+costoBase);

    }


}
