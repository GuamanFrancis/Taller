import Reservas.*;
import java.util.Scanner;
import Reservas.Concierto;

public class Main {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
        Conferencia con1 =new Conferencia(1755991615,1000, 10202024,"Conferencia",1000,200,100);
        Boda boda1 =new Boda(1755991615,1000, 10202024,"boda",2000);
        Concierto concierto1 = new Concierto(1755991615,1000,13062024,"Concierto",4000);
        Cliente cl1 = new Cliente(1709876543,1000,8082024,"Francis","pepito@gmail.com");

        int op2;

        do {
            System.out.println("Menú:");
            System.out.println("1. Reserva Conferencia");
            System.out.println("2. Reserva Boda");
            System.out.println("3. Reserva Concierto");
            System.out.println("4. Datos cliente y servicio");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            op2 = a.nextInt();

            switch (op2) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1.");
                    System.out.println("Ingrese que tipo de reserva desea.");
                    System.out.println("1. Reserva Conferencia normal.");
                    System.out.println("2. Reserva Conferencia + catering");
                    System.out.println("3. Reserva Conferencia + Equipo audivisual");
                    System.out.println("4. Reserva Conferencia + Equipo audivisual + catering");
                    int op =a.nextInt();
                    con1.calcularCostos(op);


                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");

                    boda1.calcularCosto();
                    boda1.CostoTotal();
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3.");
                    concierto1.calcularCostos();

                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 4.");
                    cl1.DatosCliente();
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
        } while (op2 != 5);










    }
}