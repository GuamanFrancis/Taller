package Reservas;

public class Concierto extends Evento{
    public Concierto(String cliente, int id, int fecha, String tipoEvento, double costoBase) {
        super(cliente, id, fecha, tipoEvento, costoBase);
    }

    public double valorTotal(){
        return getCostoBase() + 150 + 400;
    }
    @Deprecated
    public void calcularCosto(){
        super.calcularCostos();
        System.out.println("Seguridad adicional: $400 adicionales");
        System.out.println("Stand de comida: $150 adicionales");
        System.out.println("El valor total es: "+ valorTotal());
    }
}
