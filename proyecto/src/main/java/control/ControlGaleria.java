package control;
import java.util.*;
import entity.*;

public class ControlGaleria {
	
    private GestionClientes gestionCliente;
    private ArrayList<Cliente>listaClientes = new ArrayList <Cliente>();
    private ArrayList<Artista>listaArtistas = new ArrayList <Artista>();
    private ArrayList<Obra>listaObras = new ArrayList <Obra>();
    private ArrayList<Compra>compras = new ArrayList<Compra>();

    
    public ControlGaleria(GestionClientes gestionCliente, ArrayList<Cliente> listaClientes,
			ArrayList<Artista> listaArtistas, ArrayList<Obra> listaObras, ArrayList<Compra> compras) {
		super();
		this.gestionCliente = gestionCliente;
		this.listaClientes = listaClientes;
		this.listaArtistas = listaArtistas;
		this.listaObras = listaObras;
		this.compras = compras;
	}

	public GestionClientes getCliente(){
        return gestionCliente;
    }

    public void setCliente(GestionClientes gestionCliente) {
        this.gestionCliente = gestionCliente;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(ArrayList<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }

    public ArrayList<Obra> getListaObras() {
            return listaObras;
    }

    public void setListaObras(ArrayList<Obra> listaObras) {
        this.listaObras = listaObras;
    }

    public void VerObras(Obra obra){
    	
        for(Obra obras:listaObras){
            System.out.println("1.El titulo de la obra es:"+obras.getTitulo());
            System.out.println("2.La fecha de creacion de la obra es:"+obras.getFecha());
            System.out.println("3.El precio referencia de la obra es:"+obras.getPrecioRef());
            //System.out.println("4.La foto de la obra es:");
            System.out.println("5.Las dimensiones de la obra son:"+obras.getDimensiones());
        }
    }

    public void criterio(Obra obra){

        Scanner sc = new Scanner(System.in);
        int criterios;
        String titulo,artista;
        int ano;
        Calendar auxfecha;
        auxfecha=obra.getFecha();
        System.out.println("Ingrese el criterio que desea aplicar para su busqueda, 1 para el titulo, 2 para el artista, 3 para el anho");
        criterios=sc.nextInt();

        switch(criterios){

            case 1:

                System.out.println("Escriba el titulo de la obra que desea buscar");
                titulo=sc.next();

                for(Obra obras:listaObras){
                    if(titulo==obras.getTitulo()){
                            VerObras(obra);
                    }
                }
            break;

            case 2:

                System.out.println("Escriba el artista el cual desea buscar su obra");
                artista=sc.next();
               
                for(Artista artistas:listaArtistas){
                    if(artista==artistas.getNombre()){
                    	for(Obra obras:listaObras)
                    	{
                    		VerObras(obra);
                    	}

                    }
                }
            break;

            case 3:
                System.out.println("Escriba el anho en que fue pintada la obra ");
                ano=sc.nextInt();

                for(Obra obras:listaObras){
                    if(ano==auxfecha.get(auxfecha.YEAR))
                    {
                            VerObras(obra);
                    }
                }
            break;
        }
        sc.close();
    }

    public void BuscarObra(Obra obra){

            criterio(obra);
    }
    public boolean BuscarArtista(Artista artista)
    {
    	for(Artista artistas:listaArtistas)
    	{
    		if(artista.getCodigoArtista()==artistas.getCodigoArtista())
    		{
    			return true;
    		}
    	}
    	return false;
    }
    public void InsertarObra(Obra obra){
    	
    	long aux;
    	int cont=0;
    	aux=obra.getCodigoObra();
    	while(aux>0)
    	{
    		aux=obra.getCodigoObra()/10;
    		cont++;
    	}
        if(7==cont) {
        	for(Obra obras:listaObras){
                if(obra.getCodigoObra()==obras.getCodigoObra()){
                    System.out.println("La obra esta repetida");
                    return;
                }
                System.out.println("Se inserto la obra");
            }
            listaObras.add(obra);
        	
            	for(Artista artistas:obra.getArtista())
            	{
            		if(!BuscarArtista(artistas))
            		{
            			listaArtistas.add(artistas);
            		}
            		artistas.getObras().add(obra);
            	}
        }
        
        else
        {
        	System.out.println("El codigo no es valido");
        	return;
        }

    }
    public void ModificarObra(Obra obra)
    {
        Scanner sc = new Scanner(System.in);
        int opciones,cont=0;
        String nuevoTitulo;
        Calendar nuevaFecha=Calendar.getInstance();
        int ano,mes,dia;
        float nuevoPrecio;
        long nuevoCodigo;
    	for(Obra obras:listaObras)
    	{
    		if(obras.getCodigoObra()!=obra.getCodigoObra())
    		{
    			System.out.println("La obra no existe");
    			return;
    		}
    		else
    			VerObras(obra);
    	}
    	System.out.println("Que valor quiere cambiar de las obras");

    	do
    	{
            System.out.println("Presione 1 para cambiar el codigo de la obra");
            System.out.println("Presione 2 para cambiar el titulo de la obra");
            System.out.println("Presione 3 para cambiar la fecha de la obra");
            System.out.println("Presione 4 para cambiar el precio referencia de la obra");
            System.out.println("Presione 5 para cambiar las dimensiones de la obra");
            System.out.println("Presione 9 para salir del menu");
        	opciones=sc.nextInt();
        	switch(opciones)
        	{
        	case 1:
        		System.out.println("Ingrese el nuevo codigo");
        		nuevoCodigo=sc.nextLong();
        		for(Obra obras:listaObras)
        		{
    				cont++;
    				if(nuevoCodigo==obra.getCodigoObra())
    				{
        			System.out.println("El codigo ya existe, escoja otro");
        			return;
    				}
    				else

        				listaObras.get(cont).setCodigoObra(nuevoCodigo);
        				System.out.println("Se cambio el codigo");
        				}
        		cont=0;
        		break;
        	case 2:
        		System.out.println("Ingrese el nuevo titulo de la obra");
        		nuevoTitulo=sc.next();
    			for(Obra obras:listaObras)
    			{
    				cont++;
    				if(nuevoTitulo==obra.getTitulo())
        			{
        			System.out.println("El titulo ya existe, escoja otro");
        			return;
        			}
        			else
        				listaObras.get(cont).setTitulo(nuevoTitulo);
        				System.out.println("Se cambio el titulo");
 
        			}
        		cont=0;
        		break;
        	case 3:
        		System.out.println("Ingrese la nueva fecha, dia, mes y ano, en ese orden");
        		dia=sc.nextInt();
        		mes=sc.nextInt();
        		ano=sc.nextInt();
        		nuevaFecha.set(ano, mes, dia);
        		for(Obra obras:listaObras)
        		{
    				cont++;
        			if(nuevaFecha==obra.getFecha())
        			{
        				System.out.println("La fecha de la obra ya existe");
        				return;
        			}
        			else
        				listaObras.get(cont).setFecha(nuevaFecha);
        				System.out.println("Se inserto la nueva fecha");

        		}
        		cont=0;
        		break;
        	case 4:
        		System.out.println("Ingrese el nuevo precio referencia de la obra");
        		nuevoPrecio=sc.nextFloat();
        		for(Obra obras:listaObras)
        		{
        			if(nuevoPrecio==obra.getPrecioRef())
        			{
        				System.out.println("El precio ya existe");
        				return;
        			}
        		}
        	}
    	}while(opciones!=0);
    	sc.close();
    }
    //metodos clientes
    public void VerClientes(Cliente cliente){

        for(Cliente clientes:listaClientes){
            System.out.println("El nombre  y apellido del cliente es: "+clientes.getNombre()+clientes.getApellidos());
            System.out.println("La cedula del cliente es: "+clientes.getCedula());
            System.out.println("El telefono del cliente es: "+clientes.getTelefono());
        }
    }
    public void InsertarCliente(Cliente cliente){

        for(Cliente clientes:listaClientes){

            if(cliente.getCodigoCliente()==clientes.getCodigoCliente()){
                System.out.println("El cliente esta repetido");
                return;
            }
            System.out.println("Se inserto el cliente");
            listaClientes.add(cliente);
        }
    }
    public void ModificarDatos(Cliente cliente){

        Scanner sc = new Scanner(System.in);
        int opciones;
        int cont=0;
        boolean encontro = false;
        String nuevoNombre,nuevoApellido,nuevaDireccion;
        long nuevoCodigo;
        long nuevaCedula,nuevoTelefono;

        for(Cliente clientes:listaClientes){
            if(cliente.getCodigoCliente()==clientes.getCodigoCliente()){
                encontro = true;
            }
        }
        if (!encontro)
            System.out.println("El cliente no existe");
        else{
        VerClientes(cliente);
        System.out.println("Seleccione el dato que desea modificar");

        do
        {
            System.out.println("Presione 1 para cambiar el nombre");
            System.out.println("Presione 2 para cambiar el apellido");
            System.out.println("Presione 3 para cambiar la cedula");
            System.out.println("Presione 4 para cambiar el telefono");
            System.out.println("Presione 5 para cambiar la direccion");
            System.out.println("Presion 6 para cambiar el numero de identificacion");
            System.out.println("Presione 9 para salir");
            opciones=sc.nextInt();

            switch(opciones){

                case 1://cambiar nombre 

                    System.out.println("Ingrese el nuevo nombre que desea cambiar");
                    nuevoNombre=sc.next();

                    for(Cliente clientes:listaClientes){	
                            cont++;
                            if(cliente.getNombre()==clientes.getNombre()){
                                listaClientes.get(cont).setNombre(nuevoNombre);
                            }
                    }
                    cont=0;
                break;

                case 2: //cambiar apellido

                    System.out.println("Ingrese el nuevo apellido que desea cambiar");
                    nuevoApellido=sc.next();

                    for(Cliente clientes:listaClientes){
                        cont++;
                        if(cliente.getApellidos()==clientes.getApellidos()){
                            listaClientes.get(cont).setApellidos(nuevoApellido);
                        }
                    }
                    cont=0;
                break;

                case 3://cambiar cedula

                    System.out.println("Ingrese la nueva cedula que desea cambiar");
                    nuevaCedula=sc.nextLong();

                    for(Cliente clientes:listaClientes){
                        cont++;
                        if(cliente.getCedula()==clientes.getCedula()){
                                listaClientes.get(cont).setCedula(nuevaCedula);
                        }
                    }
                    cont=0;
                break;

                case 4://cambiar telefono

                    System.out.println("Ingrese el telefono nuevo que desea cambiar");
                    nuevoTelefono=sc.nextLong();

                    for(Cliente clientes:listaClientes){
                        cont++;
                        if(cliente.getTelefono()==clientes.getTelefono()){
                            listaClientes.get(cont).setTelefono(nuevoTelefono);
                        }
                    }
                    cont=0;
                break;

                case 5://cambiar direccion entrega

                    System.out.println("Ingrese la nueva direccion entrega que desea cambiar");
                    nuevaDireccion=sc.next();
                    for(Cliente clientes:listaClientes){
                        cont++;
                        if(cliente.getDireccionEntrega()==clientes.getDireccionEntrega()){
                            listaClientes.get(cont).setDireccionEntrega(nuevaDireccion);
                        }
                    }
                    cont=0;
                break;

                case 6: //cambiar codigo fuente

                    System.out.println("Ingrese el nuevo codigo que desea cambiar");
                    nuevoCodigo=sc.nextLong();

                    for(Cliente clientes:listaClientes){
                        cont++;
                        if(clientes.getCodigoCliente()==nuevoCodigo){
                            System.out.println("El codigo ya existe, elija uno nuevo");
                            return;
                        }
                        if((clientes.getCodigoCliente()!=nuevoCodigo&&cliente.getCodigoCliente()!=nuevoCodigo)){
                            listaClientes.get(cont).setCodigoCliente(nuevoCodigo);
                            System.out.println("Se ha cambiado el codigo del cliente");
                        }
                    }
                    cont=0;
                break;
            }

        }while(opciones!=9);
        sc.close();
        }
    }

    public void EliminarCliente(Cliente cliente){

        for(Cliente clientes:listaClientes){
            if(cliente.getCodigoCliente()==clientes.getCodigoCliente()){
                System.out.println("El cliente existe y se elimino satisfactoriamente");
                listaClientes.remove(cliente);
            }
            else
                System.out.println("El cliente no existe");
            return;
        }
    }	
    //Toca enviar la lista de compra a revisar, Sirve para imprimir la lista
    public void ListadoComprasExistentes(ArrayList <Compra> Lista){
        String pago;
        Compra Auxcompra;
        Calendar Auxfecha;
        for(int i =0; i < Lista.size(); i++){
            Auxcompra=Lista.get(i);
            Auxfecha=Auxcompra.getFecha();//Comodidad para imprimir
            if(Auxcompra.getPagado())
                pago="Pago";
            else
                pago="No pago";
            System.out.printf("Codigo de compra:\t%s\nFecha de compra:\t%d-%d-%d\nPagado:\t%s\n",Auxcompra.getCodigoCompra(),Auxfecha.get(Auxfecha.DATE),Auxfecha.get(Auxfecha.MONTH)+1,Auxfecha.get(Auxfecha.YEAR),pago);
        }
    }
    public void ListadoComprasPorFecha(ArrayList <Compra> Lista, int mes, int anio){
        String pago;
        Compra Auxcompra;
        Calendar auxfecha;
        for(int i =0; i < Lista.size(); i++){
            Auxcompra=Lista.get(i);
            auxfecha = Auxcompra.getFecha();
            if(mes-1 == auxfecha.get(auxfecha.MONTH))
                if(anio == auxfecha.get(auxfecha.YEAR)){
                    if(Auxcompra.getPagado())
                        pago="Pago";
                    else
                        pago="No pago";
                    System.out.printf("Codigo de compra:\t%s\nFecha de compra:\t%d-%d-%d\nPagado:\t%s\n",Auxcompra.getCodigoCompra(),auxfecha.get(auxfecha.DATE),auxfecha.get(auxfecha.MONTH)+1,auxfecha.get(auxfecha.YEAR),pago);
                }
        }
    }
}