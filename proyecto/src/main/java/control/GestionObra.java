package control;
import java.util.ArrayList;
import entity.Obra;
import java.util.Scanner;

public class GestionObras {
	
	public void inListaObras(ArrayList<Obra> listaObras){
		
		 Obra monaLisa = new Obra(123390, "MonaLisa", 10 02 2020, 120000, "20x50");
		 listaObras.add(monaLisa);
		 
		 Obra ultimaCena = new Obra(123391, "UltimaCena", 15 11 2019, 200000, "25x50");
		 listaObras.add(ultimaCena);
		 
		 Obra lasMeninas = new Obra(123392, "LasMeninas", 18 06 2020, 19000, "15x50");
		 listaObras.add(lasMeninas);
		 
		 Obra nocheEstrellada = new Obra(123393, "LaNocheEstrellada", 27 09 2020, 250000, "35x50");
		 listaObras.add(nocheEstrellada);
		 
		 Obra grito = new Obra(123394, "ElGrito", 23 01 2020, 20000, "15x50");
		 listaObras.add(grito);
		 
		 Obra capilla = new Obra(123395, "LaCapillaSixtina", 20 09 2020, 290000, "50x50");
		 listaObras.add(capilla);
		 
		 Obra nenufares = new Obra(123396, "Nenurfares", 30 06 2020, 25000, "25x50");
		 listaObras.add(nenufares);
		 
		 Obra persistencia = new Obra(123397, "LaPersistenciaDeLaMemoria", 12 07 2019, 30000, "45x50");
		 listaObras.add(persistencia);
		 
		 Obra rueda = new Obra(123398, "LaRuedaDeBicicleta", 10 01 2018, 15000, "25x50");
		 listaObras.add(rueda);
		 
		 Obra guernica = new Obra(123399, "Guernica", 10 10 2010, 10000, "25x50");
		 listaObras.add(guernica);
		 
		 System.out.println("\n Se ingresaron las siguientes obras:");
		 int cont = 0;
		 for(Obra aux : listaObras){
	            cont++;
	            System.out.println(aux.toString());
	     }
	     System.out.println("Se anadieron a la lista de obras" + cont + "nuevas obras");
		 
	}

}
