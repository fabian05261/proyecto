package entity;

import java.util.*;

public class Artista {
	
	private long codigoArtista;
	private long cedula;
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	private long telefono;
	private ArrayList <Obra>obras=new ArrayList<Obra>();
        private ArrayList <Compra>ventas=new ArrayList<Compra>();
	
	
	public ArrayList<Obra> getObras() {
		return obras;
	}
	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}
        public ArrayList<Compra> getVentas() {
		return ventas;
	}
	public void setCompra(ArrayList<Compra> ventas) {
		this.ventas = ventas;
	}
	public long getCodigoArtista() {
		return codigoArtista;
	}
	public void setCodigoArtista(long codigoArtista) {
		this.codigoArtista = codigoArtista;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public Artista() {
	
	}
	public Artista(long codigoArtista, long cedula, String nombre, String apellido, Calendar fechaNacimiento,
			long telefono) {
		this.codigoArtista = codigoArtista;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
	}
	
	
}
