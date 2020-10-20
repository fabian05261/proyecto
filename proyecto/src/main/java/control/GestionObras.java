package control;

import entity.Artista;
import entity.Obra;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GestionObras {
 

    public ArrayList<Obra> inListaObras() {
        ArrayList<Obra> listaObras = new ArrayList<Obra>();
        Obra obra1 = new Obra(1233907, "MonaLisa", new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44), 2000, "3x3");
        listaObras.add(obra1);
        Obra obra2 = new Obra(1254567, "Ultima Cena", new GregorianCalendar(2012, Calendar.AUGUST, 10, 10, 23, 44), 2500, "3x3");
        listaObras.add(obra2);
        Obra obra3 = new Obra(4563545, "Las Meninas", new GregorianCalendar(2013, Calendar.NOVEMBER, 5, 2, 14, 44), 3000, "3x3");
        listaObras.add(obra3);
        Obra obra4 = new Obra(2978671, "La Noche Estrellada", new GregorianCalendar(2014, Calendar.JANUARY, 13, 1, 13, 44), 4500, "3x3");
        listaObras.add(obra4);
        Obra obra5 = new Obra(2938471, "El grito", new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44), 4500, "3x3");
        listaObras.add(obra5);
        Obra obra6 = new Obra(1973671, "Guernica", new GregorianCalendar(1998, Calendar.JUNE, 23, 6, 12, 44), 8500, "3x3");
        listaObras.add(obra6);
        Obra obra7 = new Obra(1973671, "La Rueda De Bicicleta", new GregorianCalendar(1995, Calendar.FEBRUARY, 20, 8, 14, 44), 8500, "3x3");
        listaObras.add(obra7);
        Obra obra8 = new Obra(1273371, "El Jardin De Las Delicias", new GregorianCalendar(1993, Calendar.APRIL, 15, 21, 12, 44), 8500, "3x3");
        listaObras.add(obra8);
        return listaObras;
    }    

    public ArrayList<Artista> inListaArtistas() {
        ArrayList<Artista> listaArtistas = new ArrayList<Artista>();
        Artista artista1 = new Artista(4155,8536974, "Leonardo","Da Vinci", new GregorianCalendar(1452, Calendar.APRIL, 15, 23, 11, 44), 3105248963);
        listaArtistas.add(artista1);
        Artista artista2 = new Artista(4233,2365896, "Miguel","Angel", new GregorianCalendar(1475, Calendar.MARCH, 6, 10, 23, 44), 3506987531);
        listaArtistas.add(artista2);
        Artista artista3 = new Artista(4488,8524789, "Vincent","Van Gogh", new GregorianCalendar(1853, Calendar.MARCH, 30, 2, 14, 44), 3206987563);
        listaArtistas.add(artista3);
        Artista artista4 = new Artista(4499,1589635, "Claude","Monet", new GregorianCalendar(1840, Calendar.NOVEMBER, 14, 1, 13, 44), 3215896874);
        listaArtistas.add(artista4);
        Artista artista5 = new Artista(4135,8536975, "Pablo","Picasso", new GregorianCalendar(1881, Calendar.OCTOBER, 25, 5, 13, 44), 3149635987);
        listaArtistas.add(artista5);
        Artista artista6 = new Artista(4185,8593468, "Salvador","Dalí", new GregorianCalendar(1904, Calendar.MAY, 11, 6, 12, 44), 3125896478);
        listaArtistas.add(artista6);
        Artista artista7 = new Artista(4752,5263947, "Donatello"," ", new GregorianCalendar(1386, Calendar.OCTOBER, 19, 8, 14, 44), 3136985236);
        listaArtistas.add(artista7);
        Artista artista8 = new Artista(4960,1239874, "Rafael","Sanzio", new GregorianCalendar(1483, Calendar.APRIL, 6, 21, 12, 44), 3058963458);
        listaArtistas.add(artista8);
        return listaArtistas;
    } 
}
