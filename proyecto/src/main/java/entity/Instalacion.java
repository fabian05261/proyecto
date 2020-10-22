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
	Material mate1=new Material(9382,"Tierra");
    public ArrayList<Material>inListMateriales(){
		
		ArrayList<Material>materiales=new ArrayList<Material>() ;
		Material mat1=new Material(1928,"Plomo");
		materiales.add(mat1);
		Material mat2=new Material(9281,"Ladrillo");
		materiales.add(mat2);
		Material mat3=new Material(1239,"Lodo");
		materiales.add(mat3);
		return materiales;
	}
	
	public Instalacion(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones,
			String descripcion,ArrayList<Material>materiales) {
		
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
