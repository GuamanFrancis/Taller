package Reservas;

public class Conferencia extends Evento {
    private  double Serviciodecatering=200;
    private  double audiovisual=100;
    private double CostobasedeConferencia = 1000;


    public Conferencia(String cliente, int id,  int fecha,String tipoEvento, double costoBase,double Serviciodecatering, double audiovisual, double Costobasedeconferencia){
        super( cliente, id,   fecha, tipoEvento,  costoBase);
        this.CostobasedeConferencia=Costobasedeconferencia;
        this.audiovisual=audiovisual;
        this.Serviciodecatering=audiovisual;


    }


    public double getServiciodecatering() {
        return Serviciodecatering;
    }

    public double getAudiovisual() {
        return audiovisual;
    }

    public double getCostobasedeConferencia() {
        return CostobasedeConferencia;
    }
        @Override
    public void calcularCostos(){
        super.calcularCostos();


    }
}
