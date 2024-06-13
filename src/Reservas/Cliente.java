package Reservas;

public class Cliente extends Reserva{
    private String Nombre;
    private String email;



    public Cliente (int cliente, int id,  int fecha, String Nombre , String email){
        super(cliente, id, fecha);
        this.Nombre=Nombre;
        this.email=email;
    }

    public  void DatosCliente(){
        System.out.println("--------------------------------");
        System.out.println("     Reporte ");
        System.out.println("Nombre cliente: "+getCliente());
        System.out.println("ID de la reserva: "+getId());
        System.out.println("fecha de la reserva:  "+getFecha());
        System.out.println("Nombre del cliente: "+Nombre);
        System.out.println("email del cliente: "+email);
    }



}
