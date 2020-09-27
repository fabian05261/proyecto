package entity;
import java.util.Calendar;
import java.util.*;

public class Obra {
	private long codigoObra;
	private String titulo;
	private Calendar fecha;
	private float precioRef;
	private String dimensiones; 
	private ArrayList <Artista>artista=new ArrayList<Artista>();
	public Obra() {
		
	}
	
	public ArrayList<Artista> getArtista() {
		return artista;
	}
	public void setArtista(ArrayList<Artista> artista) {
		this.artista = artista;
	}

	public Obra(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones) {
		this.codigoObra = codigoObra;
		this.titulo = titulo;
		this.fecha = fecha;
		this.precioRef = precioRef;
		this.dimensiones = dimensiones;
	}
	
	public long getCodigoObra (){ return this.codigoObra; }
	public void setCodigoObra (long codigoObra) { this.codigoObra = codigoObra; }
	
	public String getTitulo () { return this.titulo; }
	public void setTitulo (String titulo) { this.titulo = titulo; }
	
	public Calendar getFecha () { return this.fecha; }
	public void setFecha (Calendar fecha) {this.fecha = fecha; }
	
	public float getPrecioRef () {return this.precioRef; }
	public void setPrecioRef (float precioRef) { this.precioRef = precioRef; }
	
	public String getDimensiones ( ) { return this.dimensiones; }
	public void setDimensiones (String dimensiones) {this.dimensiones = dimensiones; }
	

}