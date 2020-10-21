package entity;

import java.util.*;

public class Instalacion extends Obra {
	
	private String descripcion;
	private ArrayList<Material>materiales=new ArrayList<Material>();
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Material> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<Material> materiales) {
		this.materiales = materiales;
	}
	
	
	public Instalacion(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones,
			String descripcion, ArrayList<Material> materiales) {
		
		super(codigoObra,titulo,fecha,precioRef,dimensiones);
		this.descripcion = descripcion;
		this.materiales = materiales;
	}
	public double CalcularPrecio()
	{
		double nuevoPrecio;
		nuevoPrecio=precioRef+(precioRef*0.05)*materiales.size();
		return nuevoPrecio;
	}
}
