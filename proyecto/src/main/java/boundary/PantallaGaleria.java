package boundary;
import java.util.*;

import control.*;
import entity.*;
import enumeration.*;
public class PantallaGaleria {
	
	public static ControlGaleria controller=new ControlGaleria();
	
    public static void main(String[] args) {
        PantallaGaleria pantalla = new PantallaGaleria();
    	int opciones;
    	long codigo;
    	Scanner sc1 = new Scanner(System.in);
    	do {
		System.out.println("1. ver listado de obras disponibles");
		System.out.println("2. Buscar obra por titulo, artista o año");
		System.out.println("3. Insertar una obra");
		System.out.println("4. Modificar una obra");
		System.out.println("5. Elimina una obra");
		System.out.println("6. Ver listado de clientes");
		System.out.println("7. Buscar clientes registrados en el sistema");
		System.out.println("8. Insertar cliente");
		System.out.println("9. Modificar datos de cliente");
		System.out.println("10.Eliminar un cliente");
		System.out.println("11.Realizar la compra de una obra");
		System.out.println("12.Eliminar compra de una obra ");
		System.out.println("13.Ver listado de compras");
		System.out.println("14.Ver listado de compras para un mes y año especifico");
		System.out.println("15.Ver listado de artistas mas vendidos");
		System.out.println("16.Salir");
                //Scanner sc1 = new Scanner(System.in);
		opciones=sc1.nextInt();
		switch(opciones)
		{
		case 1:
			pantalla.controller.VerObras();
			break;
		case 2:
			pantalla.controller.BuscarObra();
			break;
		case 3:
			pantalla.controller.InsertarObra();
			break;
		case 4:
			pantalla.controller.ModificarObra();
			break;
		case 5:
			pantalla.controller.EliminarObra();
			break;
		case 6:
			pantalla.controller.VerClientes();
			break;
		case 7:
			System.out.println("Ingrese la cedula del cliente que desea buscar");
			codigo=sc1.nextLong();
			pantalla.controller.BuscarCliente(codigo);
			break;
		case 8:
			System.out.println("Ingrese el codigo,cedula, nombre, apelllido, direccion de entrega y telefono del cliente, en ese orden");
			long codigo4=sc1.nextLong();
			long cedula1=sc1.nextLong();
			String nombre1=sc1.next();
			String apellido1=sc1.next();
			String direccion=sc1.next();
			long telefono=sc1.nextLong();
			Cliente cliente1=new Cliente(codigo4,cedula1,nombre1,apellido1,direccion,telefono);
			pantalla.controller.InsertarCliente(cliente1);
			break;
		case 9:
			System.out.println("Ingrese la cedula del cliente que desea modificar");
			long codigo1=sc1.nextLong();
			pantalla.controller.ModificarDatos(codigo1);
			break;
		case 10:
			pantalla.controller.EliminarCliente();
			break;
		case 11:
			System.out.println("Ingrese el titulo de la obra, el codigo de la compra y el codigo del cliente");
			String titulo2=sc1.next();
			long codigoCompra=sc1.nextLong();
			long codigoCliente=sc1.nextLong();
			pantalla.controller.CompraObra(titulo2, codigoCompra, codigoCliente);
			break;
		case 12:
			System.out.println("Inserte el codigo de la compra que desea eliminar");
			long codigo2=sc1.nextLong();
			pantalla.controller.EliminarComprar(codigo2);
			break;
		case 13:
			pantalla.controller.ListadoComprasExistentes();
			break;
		case 14:
			System.out.println("Ingrese el mes y el año");
			int mes1=sc1.nextInt();
			int anio2=sc1.nextInt();
			pantalla.controller.ListadoComprasPorFecha(mes1, anio2);
			break;
		case 15:
			pantalla.controller.ArtistaMasVendido();
			break;
		}
    	}while(opciones!=16);
		
	}
}