package control;
import java.util.*;
import entity.*;

public class ControlGaleria {

	private ArrayList<Cliente>listaClientes=new ArrayList <Cliente>();
	private ArrayList<Artista>listaArtistas=new ArrayList <Artista>();
	private ArrayList<Obras>listaObras=new ArrayList <Obras>();

	public ControlGaleria()
	{
		
	}
	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Artista> getListaArtistas() {
		return listaArtistas;
	}

	public void setListaArtistas(ArrayList<Artista> listaArtistas) {
		this.listaArtistas = listaArtistas;
	}

	public ArrayList<Obras> getListaObras() {
		return listaObras;
	}

	public void setListaObras(ArrayList<Obras> listaObras) {
		this.listaObras = listaObras;
	}
	
	
}
