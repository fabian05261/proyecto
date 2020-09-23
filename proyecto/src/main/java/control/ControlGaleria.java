package control;
import java.util.*;
import entity.*;

public class ControlGaleria {
	
	private GestionClientes gestionCliente;
	private ArrayList<Cliente>listaClientes=new ArrayList <Cliente>();
	private ArrayList<Artista>listaArtistas=new ArrayList <Artista>();
	private ArrayList<Obras>listaObras=new ArrayList <Obras>();

	public ControlGaleria()
	{
		
	}

	public GestionClientes getCliente() {
		return gestionCliente;
	}

	public void setCliente(GestionClientes gestionCliente) {
		this.gestionCliente = gestionCliente;
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
	
	public void VerClientes(Cliente cliente)
	{
		for(Cliente clientes:listaClientes)
		{
			System.out.println("El nombre del cliente es: "+clientes.getNombre());
			System.out.println("El apellido del cliente es: "+clientes.getApellidos());
			System.out.println("La cedula del cliente es: "+clientes.getCedula());
			System.out.println("El telefono del cliente es: "+clientes.getTelefono());
		}
	}
	public void InsertarCliente(Cliente cliente)
	{
		for(Cliente clientes:listaClientes)
		{
			if(cliente.getCodigoCliente()==clientes.getCodigoCliente())
			{
				System.out.println("El cliente esta repetido");
				return;
			}
			System.out.println("Se inserto el cliente");
			listaClientes.add(cliente);
		}
	}
	public void ModificarDatos(Cliente cliente)
	{
		Scanner sc = new Scanner(System.in);
		int opciones;
		String nuevoNombre;
		for(Cliente clientes:listaClientes)
		{
			if(cliente.getCodigoCliente()!=clientes.getCodigoCliente())
			{
				System.out.println("El cliente no existe");
				return;
			}
		}
		VerClientes(cliente);
		System.out.println("Seleccione el dato que desea modificar");
		do
		{
			System.out.println("Presione 1 para cambiar el nombre");
			System.out.println("Presione 2 para cambiar el apellido");
			System.out.println("Presione 3 para cambiar la cedula");
			System.out.println("Presione 9 para salir");
			opciones=sc.nextInt();
		}while(opciones!=9);
		
		switch(opciones)
		{
		case 1://cambiar nombre 
			System.out.println("Ingrese el nuevo nombre que desea cambiar");
			nuevoNombre=sc.next();
			for(Cliente clientes:listaClientes)
			{
				if(cliente.getNombre()==clientes.getNombre())
				{
					listaClientes.set(clientes, nuevoNombre);
				}
			}
		}
		sc.close();
	}
	
}
