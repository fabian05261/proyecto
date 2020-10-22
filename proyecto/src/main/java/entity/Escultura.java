package entity;

import java.util.Calendar;

public class Escultura extends Obra {
	
	private String material;
	private double peso;
	private Material material1;
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Material getMaterial1() {
		return material1;
	}
	public void setMaterial1(Material material1) {
		this.material1 = material1;
	}
	public Escultura(long codigoObra, String titulo, Calendar fecha, float precioRef, String dimensiones,
			String material,double peso)
	{
		super(codigoObra,titulo,fecha,precioRef,dimensiones);
		this.material=material;
		this.peso=peso;
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
