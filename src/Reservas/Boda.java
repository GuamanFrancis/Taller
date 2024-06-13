package Reservas;

public class Boda extends Evento {
    public Boda(int cliente, int id, int fecha, String tipoEvento, double costoBase) {
        super(cliente, id, fecha, tipoEvento, costoBase);
    }

    public void CostoTotal(){
        System.out.println("Costo base de Boda: $2000");
        System.out.println("Costo adicional por decoración floral: $500");
        System.out.println("Costo adicional por música en vivo: $300");
        System.out.println("Costo total de la boda: $2800");
    }
    int TotalCosto = 2800;
    @Override
    public void calcularCosto(){
        super.calcularCostos();
        System.out.println("Es un tipo de evento de caracarter: "+getTipoEvento());
        System.out.println(" El costo base del evento es de: "+getCostoBase());
        System.out.println(" El costo total del evento es de: $"+TotalCosto);
    }
}
