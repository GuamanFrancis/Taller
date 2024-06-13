import Reservas.*;

public class Main {
    public static void main(String[] args) {

        //Conferencia con1 =new Conferencia("francis",1000, 10202024,"Conferencia",1000,);
        Boda boda1 = new Boda("francis",1001,10062024,"Boda",2000);
        boda1.CostoTotal();
        boda1.calcularCostos();
        Concierto con1 = new Concierto("francis",1000,12062024,"Concierto",5000);
        con1.calcularCosto();


    }
}