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
    
}
