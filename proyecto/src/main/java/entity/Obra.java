package entity;

import java.util.Calendar;
import java.util.*;

public abstract class Obra {

    protected long codigoObra;
    protected String titulo;
    protected Calendar fecha;
    protected float precioRef;
    protected String dimensiones;
    protected Compra compra;
    protected ArrayList<Artista> artista = new ArrayList<Artista>();

    public Obra() {
    }
    
    public Obra(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones) {
        this.codigoObra = codigoObra;
        this.titulo = titulo;
        this.fecha = fecha;
        this.precioRef = precioRef;
        this.dimensiones = dimensiones;
    }

    public ArrayList<Artista> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artista> artista) {
        this.artista = artista;
    }

    public Compra getCompra() {
        return this.compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public long getCodigoObra() {
        return this.codigoObra;
    }

    public void setCodigoObra(long codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getFecha() {
        return this.fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public float getPrecioRef() {
        return this.precioRef;
    }

    public void setPrecioRef(float precioRef) {
        this.precioRef = precioRef;
    }

    public String getDimensiones() {
        return this.dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public abstract float CalcularPrecio();
    {
    	
    }
    @Override
    public String toString() {
        return "Obra{" + "codigoObra=" + codigoObra + ", titulo=" + titulo + ", fecha=" + fecha + ", precioRef=" + precioRef + ", dimensiones=" + dimensiones + ", compra=" + compra + '}';
    }

}