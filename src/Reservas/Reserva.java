package Reservas;

public class Reserva {
    private String cliente;
    private int id;
    private int fecha;


    public Reserva (String cliente, int id,  int fecha){
        this.cliente=cliente;
        this.id=id;
        this.fecha=fecha;



    }


    public String getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

    public int getFecha() {
        return fecha;
    }


    public void calcularCostos(){
        System.out.println("--------------------------------");
        System.out.println("     Reporte ");
        System.out.println("Nombre cliente: "+cliente);
        System.out.println("ID de la reserva: "+id);
        System.out.println("fecha de la reserva:  "+fecha);


    }

}
