package control;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import entity.Artista;
import entity.Cliente;

//crea e instancias los Clientes y llenando la lista de clientes de la clase ControlGaleria

public class GestionClientes{
	
	public HashMap<String, Cliente> inListaClientesMap(){
		
    	HashMap<String, Cliente> listaClientesMap = new HashMap<String, Cliente>();
    	listaClientesMap.put("cliente1", new Cliente (12345,4052,"Julian","Rojas","Crr 6 N4",31243512));
    	listaClientesMap.put("cliente2", new Cliente (12346,4053,"Juan","González Flores","Crr 1 N3",32052647));
    	listaClientesMap.put("cliente3", new Cliente (12347,4054,"Pedro","González Ramírez","Cll 2 N11",31045567));
    	listaClientesMap.put("cliente4", new Cliente (12348,4055,"Mario","Gómez Ruiz","Crr 2 N6",31352944));
    	listaClientesMap.put("cliente5", new Cliente (12349,4056,"Maria","Fernández","Crr 4 N9",33225612));
    	listaClientesMap.put("cliente6", new Cliente (12350,4057,"Andres","López","Cll 8 N2",31031045));
    	listaClientesMap.put("cliente7", new Cliente (12351,4058,"Pablo","Díaz Martínez","Diag 3 N13",3002123));
    	listaClientesMap.put("cliente8", new Cliente (12352,4059,"Diego","Pérez","Crr 9 N4",30574652));
    	listaClientesMap.put("cliente9", new Cliente (12353,4060,"Felipe","García Sánchez","Diag 6 N7",31131078));
    	listaClientesMap.put("cliente10", new Cliente (12354,4061,"Andrea","Romero","Crr 8 N1",32342415));
    	listaClientesMap.put("cliente11", new Cliente (12355,4062,"Laura","Sosa Torres","Cll 9 N8",31232546));
    	listaClientesMap.put("cliente12", new Cliente (12356,4063,"Liliana","Álvarez","Diag 6 N5",30052990));
    	
    	return listaClientesMap;
    }
    
   
    public ArrayList<Cliente> inListaClientes(){
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

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

        return listaClientes;
    }
}
