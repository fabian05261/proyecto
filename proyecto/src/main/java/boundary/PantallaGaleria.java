package boundary;
import java.util.Calendar;
import java.util.Scanner;

import control.*;
import entity.*;
public class PantallaGaleria {
    
	
	private static ControlGaleria controller = new ControlGaleria();
	public PantallaGaleria()
	{
		
	}
    public static void main(String[] args) {
        PantallaGaleria pantalla = new PantallaGaleria();
    	int opciones;
        pantalla.controller.getCliente().inListaClientes(pantalla.controller.getListaClientes());
        pantalla.controller.getObras().inListaObras(pantalla.controller.getListaObras());
    	long codigo;
    	Obra obra=new Obra();
    	Artista artista=new Artista();
    	Compra compra=new Compra();
    	Cliente cliente=new Cliente();
    	//Scanner sc = new Scanner(System.in);
    	do {
		System.out.println("1. ver listado de obras disponibles");
		System.out.println("2. Buscar obra por titulo, artista o año");
		System.out.println("3. Insertar una obra");
		System.out.println("4.Modificar una obra");
		System.out.println("5.Elimina una obra");
		System.out.println("6.Ver listado de clientes");
		System.out.println("7.Buscar de clentes registrados en el sistema");
		System.out.println("8.Insertar cliente");
		System.out.println("9.Modificar datos de cliente");
		System.out.println("10.Eliminar un cliente");
		System.out.println("11.Realizar la compra de una obra");
		System.out.println("12.Eliminar compra de una obra ");
		System.out.println("13.Ver listado de compras");
		System.out.println("14.Ver listado de compras para un mes y año especifico");
		System.out.println("15.Ver listado de artistas mas vendidos");
		System.out.println("16.Salir");
                Scanner sc = new Scanner(System.in);
		opciones=sc.nextInt();
		switch(opciones)
		{
		case 1:
			pantalla.controller.VerObras();
			break;
		case 2:
			pantalla.controller.BuscarObra();
			break;
		case 3:
			pantalla.controller.InsertarObra(obra);
			break;
		case 4:
			System.out.println("Ingrese los datos de obra codigo obra, titulo, fecha como dia mes y ano, precio de referencia, dimensiones ");
			long codigoobra=sc.nextLong();
			String titulo1=sc.next();
			int dia=sc.nextInt();
			int mes=sc.nextInt();
			int anio=sc.nextInt();
			Calendar fecha1=Calendar.getInstance();
			fecha1.set(anio, mes, dia);
			float precioRef=sc.nextFloat();
			String dimensiones=sc.next();
			Obra obra1=new Obra(codigoobra,titulo1,fecha1,precioRef,dimensiones);
			pantalla.controller.ModificarObra(obra1);
			break;
		case 5:
			pantalla.controller.EliminarObra();
			break;
		case 6:
			pantalla.controller.VerClientes();
			break;
		case 7:
			System.out.println("Ingrese el codigo del cliente que desea buscar");
			codigo=sc.nextLong();
			pantalla.controller.BuscarCliente(codigo);
			break;
		case 8:
			System.out.println("Ingrese el codigo,cedula, nombre, apelllido, direccion de entrega y telefono del cliente, en ese orden");
			long codigo4=sc.nextLong();
			long cedula1=sc.nextLong();
			String nombre1=sc.next();
			String apellido1=sc.next();
			String direccion=sc.next();
			long telefono=sc.nextLong();
			Cliente cliente1=new Cliente(codigo4,cedula1,nombre1,apellido1,direccion,telefono);
			pantalla.controller.InsertarCliente(cliente1);
			break;
		case 9:
			System.out.println("Ingrese el codigo del cliente que desea modificar");
			long codigo1=sc.nextLong();
			pantalla.controller.ModificarDatos(codigo1);
			break;
		case 10:
			pantalla.controller.EliminarCliente();
			break;
		case 11:
			System.out.println("Ingrese el titulo de la obra, el codigo de la compra y el codigo del cliente");
			String titulo2=sc.next();
			long codigoCompra=sc.nextLong();
			long codigoCliente=sc.nextLong();
			pantalla.controller.CompraObra(titulo2, codigoCompra, codigoCliente);
			break;
		case 12:
			System.out.println("Inserte el codigo de la compra que desea eliminar");
			long codigo2=sc.nextLong();
			pantalla.controller.EliminarComprar(codigo2);
			break;
		case 13:
			pantalla.controller.ListadoComprasExistentes();
			break;
		case 14:
			System.out.println("Ingrese el mes y el año");
			int mes1=sc.nextInt();
			int anio2=sc.nextInt();
			pantalla.controller.ListadoComprasPorFecha(mes1, anio2);
			break;
		case 15:
			pantalla.controller.ArtistaMasVendido();
			break;
		}
    	}while(opciones!=16);
		
	}
}