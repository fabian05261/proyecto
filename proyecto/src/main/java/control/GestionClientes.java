package control;

import java.util.ArrayList;
import entity.Cliente;
import java.util.Scanner;

//crea e instancias los Clientes y llenando la lista de clientes de la clase ControlGaleria

public class GestionClientes{
    
   
    public void inListaClientes(ArrayList<Cliente> listaClientes){
        int clie = 0;

        Cliente julian = new Cliente(12345,4052,"Julian","Rojas","Crr 6 N4",31243512);
        listaClientes.add(julian);
        Cliente juan = new Cliente(12346,4053,"Juan","González Flores","Crr 1 N3",32052647);
        listaClientes.add(juan);
        Cliente pedro = new Cliente(12347,4054,"Pedro","González Ramírez","Cll 2 N11",31045567);
        listaClientes.add(pedro);
        Cliente mario = new Cliente(12348,4055,"Mario","Gómez Ruiz","Crr 2 N6",31352944);
        listaClientes.add(mario);
        Cliente maria = new Cliente(12349,4056,"Maria","Fernández","Crr 4 N9",33225612);
        listaClientes.add(maria);
        Cliente andres = new Cliente(12350,4057,"Andres","López","Cll 8 N2",31031045);
        listaClientes.add(andres);
        Cliente pablo = new Cliente(12351,4058,"Pablo","Díaz Martínez","Diag 3 N13",3002123);
        listaClientes.add(pablo);
        Cliente diego = new Cliente(12352,4059,"Diego","Pérez","Crr 9 N4",30574652);
        listaClientes.add(diego);
        Cliente felipe = new Cliente(12353,4060,"Felipe","García Sánchez","Diag 6 N7",31131078);
        listaClientes.add(felipe);
        Cliente andrea = new Cliente(12354,4061,"Andrea","Romero","Crr 8 N1",32342415);
        listaClientes.add(andrea);
        Cliente laura = new Cliente(12355,4062,"Laura","Sosa Torres","Cll 9 N8",31232546);
        listaClientes.add(laura);
        Cliente liliana = new Cliente(12356,4063,"Liliana","Álvarez","Diag 6 N5",30052990);
        listaClientes.add(liliana);

        System.out.println("\n Se ingresaron los siguientes clientes:");
        //Reviso si la lista realmente se lleno

        for(Cliente aux : listaClientes){
            clie++;
            System.out.println(aux.toString());
        }
        System.out.println("Se anadieron a la lista de clientes" + clie + "nuevos clientes");
        
    }
}

/* public void listadodeClientes(){
        int i=0;
        
        System.out.println("El listado de los Clientes son los siguientes:");
        for(Cliente aux : this.clientes){
            i++;
            System.out.println(aux.toString());
        }
        System.out.println("Este fueron todos los clientes, y fueron un total de %i"+i);
    }
      
    public void InsetarCliente(Cliente newcliente){
        int i=0; 
        
        for(Cliente aux : this.clientes){
            i++;
            if(newcliente.getCodigoCliente() == aux.getCodigoCliente()){
                System.out.println("El codigo del cliente nuevo: %l de nombre %s ya esta en el sistema y esta en la posicion: %i de la lista"+newcliente.getCodigoCliente() +newcliente.getNombre() +i);
                return;
            }
        }
        System.out.println("El codigo del cliente nuevo: %l de nombre %s ya fue agregado y esta en la posicion: %i de la lista"+newcliente.getCodigoCliente() +newcliente.getNombre() +i);
        clientes.add(newcliente);
    }
    
    public void ModificarCliente(){
        Scanner sc = new Scanner(System.in);
        int i=0, sel=0, j=0;
        long codigoI=0, codigoC=0;
                
        System.out.println("Por favor inserte el código de identificación del cliente a modificar");
        codigoI = sc.nextLong();   
        
        for(Cliente aux : this.clientes){
            i++;
            if(codigoI == aux.getCodigoCliente()){
                System.out.println(aux.toString());
                System.out.println("\n\t 1. Cambiar el codigo fuente");
                System.out.println("\t 2. Cambiar la cedula");
                System.out.println("\t 3. Cambiar el nombre");
                System.out.println("\t 4. Cambiar el apellido");
                System.out.println("\t 5. Cambiar la direccion Entrega");
                System.out.println("\t 6. Cambiar de telefono");
                sel = sc.nextInt();
                System.out.println("\n Ahora ingrese lo que desea cambiar de %i: "+sel);
                
                switch(sel){
                    case 1:
                        codigoC = sc.nextLong();
                        for(Cliente tem : this.clientes){
                            j++;
                            if(codigoC == tem.getCodigoCliente()){
                                System.out.println("\n Este codigo de identificacion ya esta y no se puede ulilizar, ya que es del cliente %i y del nombre %s"+j +tem.getNombre());
                                return;
                            }
                        }
                        System.out.println("\n Se a cambiado el cliente de codigo %s hubicado en la lista %i a cambio del nuevo codigo %s"+aux.getCodigoCliente() +i +codigoC);
                        aux.setCodigoCliente(codigoC);
                        break;
                        
                    case 2:
                        aux.setCedula(sc.nextLong());
                        System.out.println("Se cambio la cedula del cliente %i de la lista"+i);
                        break;
                        
                    case 3:
                        aux.setNombre(sc.nextLine());
                        System.out.println("Se cambio el nombre del cliente %i de la lista"+i);
                        break;
                        
                    case 4:
			aux.setApellidos(sc.nextLine());
                        System.out.println("Se cambio el apellido del cliente %i de la lista"+i);
                        break;
                        
                    case 5:
			aux.setDireccionEntrega(sc.nextLine());
                        System.out.println("Se cambio la direccion de entrega del cliente %i de la lista"+i);
                        break;
                    case 6:
                        
			aux.setTelefono(sc.nextLong());
                        System.out.println("Se cambio el telefono del cliente %i de la lista"+i);
                        break;
                    default:
                        
                        System.out.println("\n No se selecciono una opcion correcta se volvera al menu inicial.");
                        break;
                }
                return;
            }
        }
        System.out.println("El codigo del cliente: %l no esta en la lista del sistema y no esta guardado en los  %i de la lista"+codigoI +i);
    }

    public void EliminarCliente(Cliente newcliente){
        int i=0;

        for(Cliente aux : this.clientes){
            i++;
            if(newcliente.getCedula() == aux.getCedula()){
                System.out.println("Se encontro el cliente en la hubicacion %i"+i);
                clientes.remove(newcliente);
                System.out.println("\n Ya se elimino.");
                return;
            }
        }
        System.out.println("\n El cliente con nombre: %s no se puede eliminar, ya que no se encontro en la lista de clientes"+newcliente.getNombre());
    }
        
    public void llenarLista(ArrayList<Cliente> clientes){
        Scanner sa = new Scanner(System.in);
        int i=0,j=0;

        System.out.println("\n Vamos a inicializar la lista con los primeros clientes;");
        
        do{
            Cliente newcliente = new Cliente();
            j++;

            System.out.println("\n Ingrese el nombre del cliente %i"+j);
            newcliente.setNombre(sa.nextLine());
            System.out.println("Ingrese los apellidos del cliente %i"+j);
            newcliente.setApellidos(sa.nextLine());
            System.out.println("Ingrese la direccion de entrega de: %s %s"+newcliente.getNombre() +newcliente.getApellidos());
            newcliente.setDireccionEntrega(sa.nextLine());
            System.out.println("Ingrese el nuevo codigo de cliente del cliente: %s %s ,recuerde que todos los codigos tienen que ser diferentes"+newcliente.getNombre() +newcliente.getApellidos());
            newcliente.setCodigoCliente(sa.nextLong());
            System.out.println("Ingrese la cedula  del cliente: %s %s"+newcliente.getNombre() +newcliente.getApellidos());
            newcliente.setCedula(sa.nextLong());
            System.out.println("Ingrese el telefono del cliente: %s %s"+newcliente.getNombre() +newcliente.getApellidos());
            newcliente.setTelefono(sa.nextLong());

            clientes.add(newcliente);
            System.out.println("clientes ingresados a la lista");

            System.out.println("\n Si desea parar de ingresar mas clientes a la lista presione 0, por el momento va %i clientes"+j);
            i = sa.nextInt();
        }while(i!=0);
*/