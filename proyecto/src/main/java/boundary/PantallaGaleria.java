package boundary;

import java.util.*;
import java.io.*;
import control.*;
import org.apache.commons.csv.*;
import java.io.FileWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import entity.*;

public class PantallaGaleria {

    public static ControlGaleria controller = new ControlGaleria();

    public static void main(String[] args) throws InputMismatchException, ArrayIndexOutOfBoundsException, Exception {
        PantallaGaleria pantalla = new PantallaGaleria();
        int opciones;
        long codigo;
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println(" X -------------------------------------- X ");
            System.out.println(" 1. ver listado de obras disponibles");
            System.out.println(" 2. Buscar obra por titulo, artista o año");
            System.out.println(" 3. Insertar una obra");
            System.out.println(" 4. Modificar una obra");
            System.out.println(" 5. Elimina una obra");
            System.out.println(" 6. Ver listado de clientes");
            System.out.println(" 7. Buscar clientes registrados en el sistema");
            System.out.println(" 8. Insertar cliente");
            System.out.println(" 9. Modificar datos de cliente");
            System.out.println(" 10. Eliminar un cliente");
            System.out.println(" 11. Realizar la compra de una obra");
            System.out.println(" 12. Eliminar compra de una obra ");
            System.out.println(" 13. Ver listado de compras");
            System.out.println(" 14. Ver listado de compras para un mes y año especifico");
            System.out.println(" 15. Ver listado de artistas mas vendidos");
            System.out.println(" 16. Ver listado de Esculturas");
            System.out.println(" 17. Ver las compras realizadas");
            System.out.println(" 18. Ver la ganancia total");
            System.out.println(" 19. Guardar los XML");
            System.out.println(" 0. Salir");
            System.out.println(" X -------------------------------------- X ");

            opciones = sc1.nextInt();
            switch (opciones) {
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
                    System.out.println("Ingrese el codigo del cliente que desea buscar");
                    try {
                        codigo = sc1.nextLong();
                        pantalla.controller.BuscarCliente(codigo);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("El codigo no se digito correctamente ");
                    }
                case 8:
                    System.out.println("Ingrese el codigo,cedula, nombre, apelllido, direccion de entrega y telefono del cliente, "
                            + "en ese orden");
                    try {
                        long codigo4 = sc1.nextLong();
                        long cedula1 = sc1.nextLong();
                        String nombre1 = sc1.next();
                        String apellido1 = sc1.next();
                        String direccion = sc1.next();
                        long telefono = sc1.nextLong();
                        Cliente cliente1 = new Cliente(codigo4, cedula1, nombre1, apellido1, direccion, telefono);
                        pantalla.controller.InsertarCliente(cliente1);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Los valores no fueron digitados correctamente");
                    }
                case 9:
                	try {
                    System.out.println("Ingrese el codigo del cliente que desea modificar");
                    long codigo1 = sc1.nextLong();
                    pantalla.controller.ModificarDatos(codigo1);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("El codigo no se digito correctamente");
                }
                case 10:
                    pantalla.controller.EliminarCliente();
                    break;
                case 11: 
                	try {
                    System.out.println("Ingrese el titulo de la obra, el codigo de la compra y el codigo del cliente");
                    String titulo2 = sc1.next();
                    long codigoCompra = sc1.nextLong();
                    long codigoCliente = sc1.nextLong();
                    pantalla.controller.CompraObra(titulo2, codigoCompra, codigoCliente);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Se digito mal algun valor");
                }
                case 12:
                	try {
                    System.out.println("Inserte el codigo de la compra que desea eliminar");
                    long codigo2 = sc1.nextLong();
                    pantalla.controller.EliminarComprar(codigo2);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Se digito incorrectamente el codigo");
                }
                case 13:
                    pantalla.controller.ListadoComprasExistentes();
                    break;
                case 14:
                	try {
                    System.out.println("Ingrese el mes y el año");
                    int mes1 = sc1.nextInt();
                    int anio2 = sc1.nextInt();
                    pantalla.controller.ListadoComprasPorFecha(mes1, anio2);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Se digito mal el año");
                }
                case 15:
                    pantalla.controller.ArtistaMasVendido();
                    break;
                case 16:
                    pantalla.controller.Esculturas();
                    break;
                case 17:
                    pantalla.controller.Compras();
                    break;
                case 18:
                    pantalla.controller.GanaciaTotal();
                    break;
                case 19:
                    guardarXml(controller);
                    break;
            }
        } while (opciones != 0);
    }

    public static void guardarXml(ControlGaleria p) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Inserte la direccion de ruta donde este el archivo y el nombre del XML ejemplo c:\\GaleriaFinal.xml");
        String dir = sc1.next();

        try (FileWriter out = new FileWriter(dir)) {
            JAXBContext context = JAXBContext.newInstance(ControlGaleria.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(p, out);
            System.out.println("-------------------------------------------------------------");
            System.out.println(" - SU PROYECTO SE GUARDO EN LA DIRECCION " + dir + "-");
            System.out.println("-------------------------------------------------------------");
        } catch (IOException e) {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println(" - SU PROYECTO NO SE GUARDO EN LA DIRECCION " + dir + "-");
            System.out.println("-------------------------------------------------------------");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
