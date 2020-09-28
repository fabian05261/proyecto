package control;
import entity.Obra;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GestionObras {
    public static void main(String[] args) {
        Obra obra5= new Obra(1234567,"Harry Potter",new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44),2000,"3x3");
        System.out.println(obra5.getFecha().getTime());
    }
    public void inListaObras(ArrayList<Obra> listaObras){
 
        Obra obra1= new Obra(1233907,"MonaLisa",new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44),2000,"3x3");
        listaObras.add(obra1);
        Obra obra2= new Obra(1254567,"Ultima Cena",new GregorianCalendar(2012, Calendar.AUGUST, 10, 10, 23, 44),2500,"3x3");
        listaObras.add(obra2);
        Obra obra3= new Obra(4563545,"Las Meninas",new GregorianCalendar(2013, Calendar.NOVEMBER, 5, 2, 14, 44),3000,"3x3");
        listaObras.add(obra3);
        Obra obra4= new Obra(2978671,"La Noche Estrellada",new GregorianCalendar(2014, Calendar.JANUARY, 13, 1, 13, 44),4500,"3x3");
        listaObras.add(obra4);
        Obra obra5= new Obra(2938471,"El grito",new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44),4500,"3x3");
        listaObras.add(obra5);
        Obra obra6= new Obra(1973671,"Guernica",new GregorianCalendar(1998, Calendar.JUNE, 23, 6, 12, 44),8500,"3x3");
        listaObras.add(obra6);
        Obra obra7= new Obra(1973671,"La Rueda De Bicicleta",new GregorianCalendar(1995, Calendar.FEBRUARY, 20, 8, 14, 44),8500,"3x3");
        listaObras.add(obra7);
        Obra obra8= new Obra(1273371,"El Jardin De Las Delicias",new GregorianCalendar(1993, Calendar.APRIL, 15, 21, 12, 44),8500,"3x3");
        listaObras.add(obra8);
        
    }
}