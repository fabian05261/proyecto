package control;

import entity.Artista;
import entity.Obra;
import enumeration.Clasificacion;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import entity.*;
public class GestionObras {
 

    public ArrayList<Obra> inListaObras() {
        ArrayList<Obra> listaObras = new ArrayList<Obra>();
        Obra obra1 = new Cuadro(1233907, "MonaLisa", new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44), 2000, "3x3",Clasificacion.OBRA_REPRESENTATIVA,
        		"Paz","Puntillizmo");
        listaObras.add(obra1);
        Obra obra2 = new Cuadro(1254567, "Ultima Cena", new GregorianCalendar(2012, Calendar.AUGUST, 10, 10, 23, 44), 2500, "3x3",
        		Clasificacion.OBRA_MAESTRA,"Suspenso","Oleo");
        listaObras.add(obra2);
        Obra obra3 = new Cuadro(4563545, "Las Meninas", new GregorianCalendar(2013, Calendar.NOVEMBER, 5, 2, 14, 44), 3000, "3x3",
        		Clasificacion.OBRA_MAESTRA,"Intriga","Acuarela");
        listaObras.add(obra3);
        Obra obra4 = new Cuadro(2978671, "La Noche Estrellada", new GregorianCalendar(2014, Calendar.JANUARY, 13, 1, 13, 44), 4500, "3x3",
        		Clasificacion.OBRA_REPRESENTATIVA,"Desolacion","Aerografia");
        listaObras.add(obra4);
        Obra obra5 = new Cuadro(2938471, "El grito", new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44), 4500, "3x3",
        		Clasificacion.OBRA_MAESTRA,"Horror","Temple al huevo");
        listaObras.add(obra5);
        Obra obra6 = new Cuadro(1973671, "Guernica", new GregorianCalendar(1998, Calendar.JUNE, 23, 6, 12, 44), 8500, "3x3",
        		Clasificacion.OBRA_MAESTRA,"Guerra","Tinta");
        listaObras.add(obra6);
        Obra obra7 = new Cuadro(1973671, "La Rueda De Bicicleta", new GregorianCalendar(1995, Calendar.FEBRUARY, 20, 8, 14, 44), 8500, "3x3",
        		Clasificacion.OBRA_REPRESENTATIVA,"Histeria","Objetos");
        listaObras.add(obra7);
        Obra obra8 = new Cuadro(1273371, "El Jardin De Las Delicias", new GregorianCalendar(1993, Calendar.APRIL, 15, 21, 12, 44), 8500, "3x3",
        		Clasificacion.OBRA_REPRESENTATIVA,"Asombro","Pintura al pastel");
        listaObras.add(obra8);
        Obra obra9 = new Escultura(1233907, "MonaLisa", new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44), 2000, "3x3",
        		"Acuarelas",55);
        listaObras.add(obra9);
        Obra obra10 = new Escultura(1254567, "Ultima Cena", new GregorianCalendar(2012, Calendar.AUGUST, 10, 10, 23, 44), 2500, "3x3",
        		"Pinceles",60);
        listaObras.add(obra10);
        Obra obra11 = new Escultura(4563545, "Las Meninas", new GregorianCalendar(2013, Calendar.NOVEMBER, 5, 2, 14, 44), 3000, "3x3",
        		"Brocha",8);
        listaObras.add(obra11);
        Obra obra12 = new Escultura(2978671, "La Noche Estrellada", new GregorianCalendar(2014, Calendar.JANUARY, 13, 1, 13, 44), 4500, "3x3",
        		"Lapiz",9);
        listaObras.add(obra12);
        Obra obra13 = new Escultura(2938471, "El grito", new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44), 4500, "3x3",
        		"Tabla de madera",32);
        listaObras.add(obra13);
        Obra obra14 = new Escultura(1973671, "Guernica", new GregorianCalendar(1998, Calendar.JUNE, 23, 6, 12, 44), 8500, "3x3",
        		"Papel Acuarela",7);
        listaObras.add(obra14);
        Obra obra15 = new Escultura(1973671, "La Rueda De Bicicleta", new GregorianCalendar(1995, Calendar.FEBRUARY, 20, 8, 14, 44), 8500, "3x3",
        		"Rueda",50);
        listaObras.add(obra15);
        Obra obra16 = new Escultura(1273371, "El Jardin De Las Delicias", new GregorianCalendar(1993, Calendar.APRIL, 15, 21, 12, 44), 8500, "3x3",
        		"Pinceles",54);
        listaObras.add(obra16);
        return listaObras;
    }    

    public ArrayList<Artista> inListaArtistas() {
        ArrayList<Artista> listaArtistas = new ArrayList<Artista>();
        Artista artista1 = new Artista(4155,8536974, "Leonardo","Da Vinci", new GregorianCalendar(1452, Calendar.APRIL, 15, 23, 11, 44), 310524896);
        listaArtistas.add(artista1);
        Artista artista2 = new Artista(4233,2365896, "Miguel","Angel", new GregorianCalendar(1475, Calendar.MARCH, 6, 10, 23, 44), 350698753);
        listaArtistas.add(artista2);
        Artista artista3 = new Artista(4488,8524789, "Vincent","Van Gogh", new GregorianCalendar(1853, Calendar.MARCH, 30, 2, 14, 44), 320697563);
        listaArtistas.add(artista3);
        Artista artista4 = new Artista(4499,1589635, "Claude","Monet", new GregorianCalendar(1840, Calendar.NOVEMBER, 14, 1, 13, 44), 321589874);
        listaArtistas.add(artista4);
        Artista artista5 = new Artista(4135,8536975, "Pablo","Picasso", new GregorianCalendar(1881, Calendar.OCTOBER, 25, 5, 13, 44), 314963987);
        listaArtistas.add(artista5);
        Artista artista6 = new Artista(4185,8593468, "Salvador","Dalí", new GregorianCalendar(1904, Calendar.MAY, 11, 6, 12, 44), 312589647);
        listaArtistas.add(artista6);
        Artista artista7 = new Artista(4752,5263947, "Donatello"," ", new GregorianCalendar(1386, Calendar.OCTOBER, 19, 8, 14, 44), 313698236);
        listaArtistas.add(artista7);
        Artista artista8 = new Artista(4960,1239874, "Rafael","Sanzio", new GregorianCalendar(1483, Calendar.APRIL, 6, 21, 12, 44), 305893458);
        listaArtistas.add(artista8);
        return listaArtistas;
    } 
}
