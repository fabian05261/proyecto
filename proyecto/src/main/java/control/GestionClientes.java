package control;

import java.util.ArrayList;

import entity.*;

public class GestionClientes {
	
	private ArrayList<Cliente>cliente=new ArrayList<Cliente>();

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	public void VerClientes(Cliente cliente1)
	{
		for(Cliente clientes:cliente)
		{
			if(cliente1.getCedula()==clientes.getCedula())
			{
				System.out.println(cliente1.getCedula());
			}
		}
	}
	public void InsertarCliente(Cliente cliente1)
	{
		for(Cliente clientes:cliente)
		{
			if(cliente1.getCedula()==clientes.getCedula())
			{
				System.out.println("El cliente esta repetido");
				return;
			}
			System.out.println("Se inserto el cliente");
			cliente.add(cliente1);
		}
	}
	public void ModificarClientes(Cliente cliente1)
	{
		for(Cliente clientes:cliente)
		{
			if(cliente1.getCedula()==clientes.getCedula())
			{
				System.out.println("Se encontro el cliente");
				cliente.remove(cliente1);
			}
		}
		System.out.println("Se elimino el cliente");
	}
}
