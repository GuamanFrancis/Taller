package Reservas;
import java.util.Scanner;

public class Boda extends Evento {
    public Boda(int cliente, int id, int fecha, String tipoEvento, double costoBase) {
        super(cliente, id, fecha, tipoEvento, costoBase);
    }

    public void CostoTotal(){
        System.out.println("Costo base de Boda: $2000");
        System.out.println("1. Costo adicional por decoración floral: $500");
        System.out.println("2. Costo adicional por música en vivo: $300");
        System.out.println("Quiere agregar algo adicional? (1 0 2, 3 para ambas, 0 salir) ");
        Scanner a = new Scanner(System.in);
        int op = a.nextInt();
        if (op == 1){
            System.out.println("Costo adicional por decoración floral: $500");
            System.out.println("Costo total de la boda: $2500");
            TotalCosto = 2500;
        } else if (op == 2){
            System.out.println("Costo adicional por música en vivo: $300");
            System.out.println("Costo total de la boda: $2300");
            TotalCosto = 2300;
        } else if (op == 3) {
            System.out.println("Costo adicional por decoración floral: $500");
            System.out.println("Costo adicional por música en vivo: $300");
            System.out.println("Costo total de la boda: $2800");
            TotalCosto = 2800;
        } else {
            System.out.println("Costo total de la boda: $2000");
            TotalCosto = 2000;
        }
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
