package Reservas;

public class Evento extends Reserva{
    private String tipoEvento;
    private double costoBase;


    public Evento(String cliente, int id,  int fecha,String tipoEvento, double costoBase){
        super(cliente, id , fecha);
        this.tipoEvento=tipoEvento;
        this.costoBase=costoBase;


    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public double getCostoBase() {
        return costoBase;
    }

    @Deprecated
    public void calcularCosto(){
        super.calcularCostos();
        System.out.println("Es un tipo de evento de caracarter: "+tipoEvento);
        System.out.println(" El costo base del evento es de: "+costoBase);

    }


}
