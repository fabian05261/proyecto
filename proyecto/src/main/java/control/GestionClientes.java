package control;

import java.util.ArrayList;
import Entity.Cliente;
import java.util.Scanner;

public class GestionClientes {
    private ArrayList<Cliente> clientes;
    Scanner sc = new Scanner(System.in);
    
    public GestionClientes(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void listadodeClientes(){
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
                        aux.getCodigoCliente() = codigoC;
                        break;
                    case 2:
                        aux.setCedula(sc.nextLong());
                        System.out.println("");
                        break;
                    case 3:
                        aux.
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    default:
                        System.out.println("");
                        break;
                }
                return;
            }
        }
        System.out.println("El codigo del cliente: %l no esta en la lista del sistema y no esta guardado en los  %i de la lista"+newcliente.getCodigoCliente() +i);
    }
}