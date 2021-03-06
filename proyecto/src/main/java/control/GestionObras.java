package control;

import enumeration.Clasificacion;

import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import entity.*;

public class GestionObras {

    public Material material1 = new Material(3812, "Lapiz");
    public Material material2 = new Material(2781, "Papel");
    public Material material3 = new Material(7832, "Carton");
    public Material material4 = new Material(2091, "Tierra");
    public Material material5 = new Material(9841, "Ladrillo");
    public Material material6 = new Material(4341, "Plata");
    public Material material7 = new Material(1234, "Oro");
    public Material material8 = new Material(8123, "Barro");

    public ArrayList<Material> inListMateriales() {

        ArrayList<Material> materiales = new ArrayList<Material>();
        Material mat1 = new Material(1928, "Plomo");
        materiales.add(mat1);
        Material mat2 = new Material(9281, "Ladrillo");
        materiales.add(mat2);
        Material mat3 = new Material(1239, "Lodo");
        materiales.add(mat3);
        return materiales;
    }

    public ArrayList<Obra> inListaObras() {
        ArrayList<Obra> listaObras = new ArrayList<Obra>();
        ArrayList<Material> materiales = new ArrayList<Material>();
        Material mat1 = new Material(1928, "Plomo");
        materiales.add(mat1);
        Material mat2 = new Material(9281, "Ladrillo");
        materiales.add(mat2);
        Material mat3 = new Material(1239, "Lodo");
        materiales.add(mat3);
        Obra obra1 = new Cuadro(1233907, "MonaLisa", new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44), 2000, "3x3", Clasificacion.OBRA_REPRESENTATIVA,
                "Paz", "Puntillizmo");
        listaObras.add(obra1);
        Obra obra2 = new Cuadro(1254567, "Ultima Cena", new GregorianCalendar(2012, Calendar.AUGUST, 10, 10, 23, 44), 2500, "3x3",
                Clasificacion.OBRA_MAESTRA, "Suspenso", "Oleo");
        listaObras.add(obra2);
        Obra obra3 = new Cuadro(4563545, "Las Meninas", new GregorianCalendar(2013, Calendar.NOVEMBER, 5, 2, 14, 44), 3000, "3x3",
                Clasificacion.OBRA_MAESTRA, "Intriga", "Acuarela");
        listaObras.add(obra3);
        Obra obra4 = new Cuadro(2978671, "La Noche Estrellada", new GregorianCalendar(2014, Calendar.JANUARY, 13, 1, 13, 44), 4500, "3x3",
                Clasificacion.OBRA_REPRESENTATIVA, "Desolacion", "Aerografia");
        listaObras.add(obra4);
        Obra obra5 = new Cuadro(2938471, "El grito", new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44), 4500, "3x3",
                Clasificacion.OBRA_MAESTRA, "Horror", "Temple al huevo");
        listaObras.add(obra5);
        Obra obra6 = new Cuadro(1973671, "Guernica", new GregorianCalendar(1998, Calendar.JUNE, 23, 6, 12, 44), 8500, "3x3",
                Clasificacion.OBRA_MAESTRA, "Guerra", "Tinta");
        listaObras.add(obra6);
        Obra obra7 = new Cuadro(9830123, "La Rueda De Bicicleta", new GregorianCalendar(1995, Calendar.FEBRUARY, 20, 8, 14, 44), 8500, "3x3",
                Clasificacion.OBRA_REPRESENTATIVA, "Histeria", "Objetos");
        listaObras.add(obra7);
        Obra obra8 = new Cuadro(1273371, "El Jardin De Las Delicias", new GregorianCalendar(1993, Calendar.APRIL, 15, 21, 12, 44), 8500, "3x3",
                Clasificacion.OBRA_REPRESENTATIVA, "Asombro", "Pintura al pastel");
        listaObras.add(obra8);
        Obra obra9 = new Escultura(1233907, "MonaLisa", new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44), 2000, "3x3",
                material1, 55);
        listaObras.add(obra9);
        Obra obra10 = new Escultura(9043718, "El David", new GregorianCalendar(1344, Calendar.AUGUST, 10, 10, 23, 44), 5500, "40x40",
                material2, 60);
        listaObras.add(obra10);
        Obra obra11 = new Escultura(4561728, "El Pensador", new GregorianCalendar(1666, Calendar.NOVEMBER, 5, 2, 14, 44), 5000, "30x30",
                material3, 8);
        listaObras.add(obra11);
        Obra obra12 = new Escultura(3401923, "Estatua de la Libertad", new GregorianCalendar(1892, Calendar.JANUARY, 13, 1, 13, 44), 9500, "310x100",
                material4, 9);
        listaObras.add(obra12);
        Obra obra13 = new Escultura(9821345, "El Moises", new GregorianCalendar(2020, Calendar.MARCH, 13, 5, 13, 44), 4500, "190x290",
                material5, 32);
        listaObras.add(obra13);
        Obra obra14 = new Escultura(2194027, "El Discobolo", new GregorianCalendar(291, Calendar.JUNE, 23, 6, 12, 44), 6200, "40x50",
                material6, 7);
        listaObras.add(obra14);
        Obra obra15 = new Escultura(8910284, "Venus de Milo", new GregorianCalendar(467, Calendar.FEBRUARY, 20, 8, 14, 44), 8800, "33x31",
                material7, 50);
        listaObras.add(obra15);
        Obra obra16 = new Escultura(1204928, "Gran Esfinge de Guinza", new GregorianCalendar(132, Calendar.APRIL, 15, 21, 12, 44), 12000, "400x400",
                material8, 54);
        listaObras.add(obra16);
        Obra obra17 = new Instalacion(9839192, "Tentacion de San Antonio", new GregorianCalendar(132, Calendar.APRIL, 15, 21, 12, 44), 12000, "400x400",
                "", null);
        listaObras.add(obra17);
        Obra obra18 = new Instalacion(2748291, "Gran Esfinge de Guinza", new GregorianCalendar(132, Calendar.APRIL, 15, 21, 12, 44), 12000, "400x400",
                "", null);
        listaObras.add(obra18);
        Obra obra19 = new Instalacion(1204928, "Gran Esfinge de Guinza", new GregorianCalendar(132, Calendar.APRIL, 15, 21, 12, 44), 12000, "400x400",
                "", null);
        listaObras.add(obra19);
        if (obra17 instanceof Instalacion) {
            ((Instalacion) obra17).setMateriales(materiales);
        }
        if (obra18 instanceof Instalacion) {
            ((Instalacion) obra17).setMateriales(materiales);
        }
        if (obra19 instanceof Instalacion) {
            ((Instalacion) obra17).setMateriales(materiales);
        }
        return listaObras;
    }

    public ArrayList<Artista> inListaArtistas() {
        ArrayList<Artista> listaArtistas = new ArrayList<Artista>();
        Artista artista1 = new Artista(4155, 8536974, "Leonardo", "Da Vinci", new GregorianCalendar(1452, Calendar.APRIL, 15, 23, 11, 44), 310524896);
        listaArtistas.add(artista1);
        Artista artista2 = new Artista(4233, 2365896, "Miguel", "Angel", new GregorianCalendar(1475, Calendar.MARCH, 6, 10, 23, 44), 350698753);
        listaArtistas.add(artista2);
        Artista artista3 = new Artista(4488, 8524789, "Vincent", "Van Gogh", new GregorianCalendar(1853, Calendar.MARCH, 30, 2, 14, 44), 320697563);
        listaArtistas.add(artista3);
        Artista artista4 = new Artista(4499, 1589635, "Claude", "Monet", new GregorianCalendar(1840, Calendar.NOVEMBER, 14, 1, 13, 44), 321589874);
        listaArtistas.add(artista4);
        Artista artista5 = new Artista(4135, 8536975, "Pablo", "Picasso", new GregorianCalendar(1881, Calendar.OCTOBER, 25, 5, 13, 44), 314963987);
        listaArtistas.add(artista5);
        Artista artista6 = new Artista(4185, 8593468, "Salvador", "Dalí", new GregorianCalendar(1904, Calendar.MAY, 11, 6, 12, 44), 312589647);
        listaArtistas.add(artista6);
        Artista artista7 = new Artista(4752, 5263947, "Donatello", " ", new GregorianCalendar(1386, Calendar.OCTOBER, 19, 8, 14, 44), 313698236);
        listaArtistas.add(artista7);
        Artista artista8 = new Artista(4960, 1239874, "Rafael", "Sanzio", new GregorianCalendar(1483, Calendar.APRIL, 6, 21, 12, 44), 305893458);
        listaArtistas.add(artista8);
        return listaArtistas;
    }

    public HashMap<Integer, Artista> inListaArtistasMap() {

        HashMap<Integer, Artista> listaArtistasMap = new HashMap<Integer, Artista>();
        listaArtistasMap.put(0, new Artista(4155, 8536974, "Leonardo", "Da Vinci", new GregorianCalendar(1452, Calendar.APRIL, 15, 23, 11, 44), 310524896));
        listaArtistasMap.put(1, new Artista(4233, 2365896, "Miguel", "Angel", new GregorianCalendar(1475, Calendar.MARCH, 6, 10, 23, 44), 350698753));
        listaArtistasMap.put(2, new Artista(4488, 8524789, "Vincent", "Van Gogh", new GregorianCalendar(1853, Calendar.MARCH, 30, 2, 14, 44), 320697563));
        listaArtistasMap.put(3, new Artista(4499, 1589635, "Claude", "Monet", new GregorianCalendar(1840, Calendar.NOVEMBER, 14, 1, 13, 44), 321589874));
        listaArtistasMap.put(4, new Artista(4135, 8536975, "Pablo", "Picasso", new GregorianCalendar(1881, Calendar.OCTOBER, 25, 5, 13, 44), 314963987));
        listaArtistasMap.put(5, new Artista(4185, 8593468, "Salvador", "Dalí", new GregorianCalendar(1904, Calendar.MAY, 11, 6, 12, 44), 312589647));
        listaArtistasMap.put(6, new Artista(4752, 5263947, "Donatello", " ", new GregorianCalendar(1386, Calendar.OCTOBER, 19, 8, 14, 44), 313698236));
        listaArtistasMap.put(7, new Artista(4960, 1239874, "Rafael", "Sanzio", new GregorianCalendar(1483, Calendar.APRIL, 6, 21, 12, 44), 305893458));

        return listaArtistasMap;
    }
}
