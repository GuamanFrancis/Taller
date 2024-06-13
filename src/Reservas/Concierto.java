package Reservas;
import java.util.Scanner;

public class Concierto extends Evento{
    public Concierto(int cliente, int id, int fecha, String tipoEvento, double costoBase) {
        super(cliente, id, fecha, tipoEvento, costoBase);
    }

    public double valorTotal(){
        System.out.println("Costo base es: $"+getCostoBase());
        System.out.println("1. Seguridad adicional: $400 adicionales");
        System.out.println("2. Stand de comida: $150 adicionales");
        System.out.println("Quiere agregar algo adicional? (1 0 2, 3 para ambas, 0 salir) ");
        Scanner a = new Scanner(System.in);
        int op = a.nextInt();
        if (op ==1){
            System.out.println("Seguridad adicional: $400 adicionales");
            return getCostoBase() + 400;
        } else if (op == 2) {
            System.out.println("Stand de comida: $150 adicionales");
            return getCostoBase() + 150;
        } else if (op == 3) {
            System.out.println("Seguridad adicional: $400 adicionales");
            System.out.println("Stand de comida: $150 adicionales");
            return getCostoBase() + 400 + 150;
        }else{
            System.out.println("Costo base de la reserva es de: "+getCostoBase());
            return getCostoBase();
        }
    }
    @Deprecated
    public void calcularCostos(){
        super.calcularCostos();
        System.out.println("Seguridad adicional: $400 adicionales");
        System.out.println("Stand de comida: $150 adicionales");
        System.out.println("El valor total es: "+ valorTotal());
    }
}
