package boundary;
import java.util.Scanner;

import control.*;
import entity.*;
public class PantallaGaleria {
	
	private static ControlGaleria controller=new ControlGaleria();
	public PantallaGaleria()
	{
		
	}
    public static void main(String[] args) {
    	int opciones;
    	long codigo;
    	PantallaGaleria pan=new PantallaGaleria();
    	Obra obra=new Obra();
    	Artista artista=new Artista();
    	Compra compra=new Compra();
    	Cliente cliente=new Cliente();
    	Scanner sc = new Scanner(System.in);
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
		opciones=sc.nextInt();
		switch(opciones)
		{
		case 1:
			controller.VerObras();
			break;
		case 2:
			controller.BuscarObra();
			break;
		case 3:
			controller.InsertarObra(obra);
			break;
		case 4:
			controller.ModificarObra(obra);
			break;
		case 5:
			controller.EliminarObra(obra);
			break;
		case 6:
			controller.VerClientes(cliente);
			break;
		case 7:
			System.out.println("Ingrese el codigo del cliente que desea buscar");
			codigo=sc.nextLong();
			controller.BuscarCliente(codigo);
			break;
		case 8:
			controller.InsertarCliente(cliente);
			break;
		case 9:
			controller.ModificarDatos(cliente);
			break;
		case 10:
			controller.EliminarCliente(cliente);
			break;
		case 11:
			System.out.println("Ingrese el titulo, el codigo de compra y el codigo de la obra, en ese orden");
			String titulo=sc.next();
			long codigocompra=sc.nextLong();
			long codigo1=sc.nextLong();
			controller.CompraObra(titulo, codigocompra,codigo1);
			break;
		case 12:
			System.out.println("Ingrese el codigo de la compra a eliminar");
			long codigo2=sc.nextLong();
			controller.EliminarComprar(codigo2);
			break;
		case 13:
			controller.ListadoComprasExistentes();
			break;
		case 14:
			System.out.println("Ingrese el mes y el año de la compra");
			int mes=sc.nextInt();
			int anio=sc.nextInt();
			controller.ListadoComprasPorFecha(mes, anio);
			break;
		case 15:
			controller.ArtistaMasVendido(artista);
			break;
		}
    	}while(opciones!=16);
		
	}
}
