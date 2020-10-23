package entity;
import enumeration.*;
import java.util.Calendar;

public class Cuadro extends Obra{
	
	private String tema;
	private String tecnica;
	private Clasificacion clasificacion;
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public Cuadro()
	{
		
	}
	public Cuadro(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones,
			Clasificacion clasificacion,String tema,String tecnica)
	{
		super(codigoObra,titulo,fecha,precioRef,dimensiones);
		this.clasificacion=clasificacion;
		this.tema=tema;
		this.tecnica=tecnica;
	}
	public double CalcularPrecio()
	{
		double nuevoPrecio1;
		if(this.clasificacion==Clasificacion.OBRA_MAESTRA)
		{
			nuevoPrecio1= precioRef+(5/100*precioRef);
		}
		else
		{
			nuevoPrecio1=precioRef+(3/100*precioRef);
		}
		return nuevoPrecio1;
	}
}
