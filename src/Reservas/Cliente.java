package Reservas;

public class Cliente extends Reserva{
    private String Nombre;
    private String email;



    public Cliente (int cliente, int id,  int fecha, String Nombre , String email){
        super(cliente, id, fecha);
        this.Nombre=Nombre;
        this.email=email;
    }



}
