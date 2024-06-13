package Reservas;

public class Conferencia extends Evento {
    private  double Serviciodecatering=200;
    private  double audiovisual=100;



    public Conferencia(String cliente, int id,  int fecha,String tipoEvento, double costoBase,double Serviciodecatering, double audiovisual){
        super( cliente, id,   fecha, tipoEvento,  costoBase);

        this.audiovisual=audiovisual;
        this.Serviciodecatering=audiovisual;


    }


    public double getServiciodecatering() {
        return Serviciodecatering;
    }

    public double getAudiovisual() {
        return audiovisual;
    }



    public void calcularCostos(int op){
        super.calcularCostos();
        System.out.println("Tipo de reserva: "+getTipoEvento());
        System.out.println("Costo base de la reserva es de: "+getCostoBase());
        if (op ==1){
            System.out.println("Costo base de la reserva "+getTipoEvento()+"+ el servicio de catering "+getServiciodecatering()+" es de:");
            System.out.println("total ="+(getCostoBase()+getServiciodecatering()));

        }else if (op==2){
            System.out.println("Costo base de la reserva + el cargo audivisual es de: "+(getCostoBase()+getAudiovisual()));


        } else if (op==3){

            System.out.println("Costo base de la reserva + el cargo audivisual + el cargo de catering es de: "+(getCostoBase()+getCostoBase()+getServiciodecatering()));
        }


    }
}
