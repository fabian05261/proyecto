package control;

import java.util.ArrayList;
import Entity.Cliente;

public class GestionClientes {
    private ArrayList<Cliente> clientes;

    public GestionClientes(ArrayList<Cliente> clientes) {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void listadodeClientes(){
        for(Cliente aux : this.clientes){
            System.out.println(aux.toString());
        }
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
}
