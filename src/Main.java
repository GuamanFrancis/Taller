import Reservas.Conferencia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
        Conferencia con1 =new Conferencia("francis",1000, 10202024,"Conferencia",1000,200,100);

        System.out.println("Ingrese que tipo de reserva desea.");
        System.out.println("1. Reserva Conferencia normal.");
        System.out.println("2. Reserva Conferencia + catering");
        System.out.println("3. Reserva Conferencia + Equipo audivisual");
        System.out.println("4. Reserva Conferencia + Equipo audivisual + catering");

        int op =a.nextInt();
        con1.calcularCostos(op);






    }
}