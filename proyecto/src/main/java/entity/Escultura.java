package entity;

import java.util.Calendar;

public class Escultura extends Obra {
	private double peso;
	private Material material;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Escultura(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones,
			Material material,double peso)
	{
		super(codigoObra,titulo,fecha,precioRef,dimensiones);
		if(material!=null)
		{
			this.material=material.getNombre();
		}
		this.peso=peso;
		this.material1=material;
	}
	public double CalcularPrecio()
	{
		double nuevoPrecio;
		if(peso>10)
		{
			nuevoPrecio=precioRef+(precioRef+0.01)*peso-10;
		}
		else
		{
			nuevoPrecio=precioRef;
		}
		return nuevoPrecio;
	}
}
