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

    public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
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
        String nuevoTitulo,nuevasDimensiones;
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
    				if(nuevoCodigo==obras.getCodigoObra())
    				{
        			System.out.println("El codigo ya existe, escoja otro");
        			return;
    				}
        		}
    				for(Obra obras:listaObras)
    				{
    					cont++;
    					if(obra.getCodigoObra()==obras.getCodigoObra())
    					{
            				listaObras.get(cont).setCodigoObra(nuevoCodigo);
            				System.out.println("Se cambio el codigo");
    					}
    				}

        		cont=0;
        		break;
        	case 2:
        		System.out.println("Ingrese el nuevo titulo de la obra");
        		nuevoTitulo=sc.next();
    			for(Obra obras:listaObras)
    			{
    				if(nuevoTitulo==obras.getTitulo())
        			{
        			System.out.println("El titulo ya existe, escoja otro");
        			return;
        			}
    			}
    				for(Obra obras:listaObras)
    				{
        				cont++;
        				if(obra.getTitulo()==obras.getTitulo())
        				{
        				listaObras.get(cont).setTitulo(nuevoTitulo);
        				System.out.println("Se cambio el titulo");
        				}
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
        			if((nuevaFecha==obra.getFecha()&&obra.getFecha()!=obras.getFecha()))// no estoy seguro
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
        			cont++;
        			if((nuevoPrecio==obra.getPrecioRef()&&obra.getPrecioRef()!=obras.getPrecioRef()))//no estoy seguro
        			{
        				System.out.println("El precio para esa obra ya existe");
        				return;
        			}
        			else
        				listaObras.get(cont).setPrecioRef(nuevoPrecio);
        			System.out.println("Se cambio el precio de la obra");
        		}
        		cont=0;
        		break;
        	case 5:
        		System.out.println("Ingrese las nuevas dimensiones de la obra");
        		nuevasDimensiones=sc.next();
        		for(Obra obras:listaObras)
        		{
        			cont++;
        			if((nuevasDimensiones==obra.getDimensiones()&&obra.getDimensiones()!=obras.getDimensiones()))//no estoy seguro
        			{
        				System.out.println("Las dimensiones ya existen para la obra");
        				return;
        			}
        			else
        				listaObras.get(cont).setDimensiones(nuevasDimensiones);
        			System.out.println("Se cambiaron las dimensiones de la obra");
        		}
        		cont=0;
        		break;
        	}
    	}while(opciones!=0);
    	sc.close();
    }
    public void EliminarObra(Obra obra)
    {
    	 Scanner sc = new Scanner(System.in);
    	 long codigo;
    	 int x;
    	 boolean confirmar=false;
    	 System.out.println("Ingrese el codigo de la obra que desea eliminar");
    	 codigo=sc.nextLong();
    	 for(Obra obras:listaObras)
    	 {
    		 if(obras.getCodigoObra()!=codigo)
    		 {
    			 System.out.println("La obra no existe");
    			 return;
    		 }
    		 else 
    			 System.out.println("Realmente desea eliminar la obra? presione 1 para confirmar 0 para cancelar");
    		 x=sc.nextInt();
    		 if(x==1)
    		 {
    			 confirmar=true;
    		 }
    		 	else
    		 		confirmar=false;
    		 if(confirmar==true)
    		 {
    			 System.out.println("La obra existe y se elimino satisfactoriamente");
    			 listaObras.remove(obra);
    		 } 
    		 else
    			 System.out.println("Se ha cancelado");
    		 break;
    	 }
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
                                System.out.println("Se cambio el nombre");
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
                            System.out.println("Se ha cambiado el apellido");
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
                                System.out.println("La cedula se ha cambiado");
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
                            System.out.println("Se cambio el telefono");
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
                            System.out.println("Se cambio la direccion de entrega");
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

        Scanner sc = new Scanner(System.in);
        long codigo;
        int x;
        boolean confirmar;
        System.out.println("Ingrese el codigo del cliente que desea eliminar");
        codigo=sc.nextLong();

        for(Cliente clientes:listaClientes){
            if(codigo!=clientes.getCodigoCliente()){
                System.out.println("El codigo del cliente no existe");
            }
            else
                System.out.println("Realmnete desea eliminar el cliente? presione 1 para confirmar 0 para cancelar");
            x=sc.nextInt();
            if(x==1){
            	confirmar=true;
            }
            else 
            	confirmar=false;
            if(confirmar==true){
                listaClientes.remove(cliente);
                System.out.println("Se elimino el cliente satisfactoriamente");
            }
            else
            	System.out.println("Se ha cancelado");
            break;
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
    public void CompraObra(Obra obracomprar, long codigocompra, Cliente comprador){

        Obra Auxobra = new Obra();
        boolean encontro = false;
        for(Obra obras:listaObras){
            if(obracomprar.getCodigoObra()==obras.getCodigoObra()){
                Auxobra = obras;
                break;
            }
            else{
                System.out.println("La obra "+obracomprar.getTitulo()+" no existe");
                return;
            }
        }
        Calendar hoy = Calendar.getInstance();
        boolean pago;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Por favor seleccione una opcion.\n\t1.Se realizo el pago\n\t0.Pago pendiente\n");
        int revisar = sc.nextInt();
        if(revisar != 0)
            pago = true;
        else
            pago=false;
        Compra Auxcompra = new Compra(codigocompra, hoy, pago);
        Auxcompra.setCompraCliente(comprador);
        Auxcompra.setCompraObra(Auxobra);
        for(Compra comprar: compras){
            if(comprar.getCompraObra().getTitulo().equals(obracomprar.getTitulo())){
                if(comprar.getCompraCliente().getCodigoCliente() == comprador.getCodigoCliente()){
                    encontro=true;
                    break;
                }
                else
                    encontro=false;
                }
            else
                encontro = false;
        }
        if(!encontro){
            Auxobra.setCompra(Auxcompra);
            for(int i =0; i<Auxobra.getArtista().size(); i++)
                Auxobra.getArtista().get(i).getVentas().add(Auxcompra);
            comprador.getCompras().add(Auxcompra);
            compras.add(Auxcompra);
            System.out.println("Se ha anadido su compra con exito");
        }
        else
            System.out.println("Esta compra ya se realizo, por favor verifique");
    }
    
    public void EliminarComprar(Compra aborrar){
        boolean encontro= false;
        int j = 0;
        for(Compra auxcompras: compras){
            if(aborrar.getCodigoCompra()== auxcompras.getCodigoCompra()){
                encontro=true;
                break;
            }
        }
        if(!encontro){
            System.out.println("La compra que desea eliminar no existe");
            return;
        }
        else{
            for(int i=0; i< aborrar.getCompraObra().getArtista().size(); i++){
                for(j = 0;j < aborrar.getCompraObra().getArtista().get(i).getVentas().size();j++){
                    if(aborrar.getCodigoCompra() == aborrar.getCompraObra().getArtista().get(i).getVentas().get(j).getCodigoCompra()){
                        aborrar.getCompraObra().getArtista().get(i).getVentas().remove(j);
                        break;
                    }
                }
            }
            for(int i=0; i <aborrar.getCompraCliente().getCompras().size(); i++){
                if(aborrar.getCodigoCompra()==aborrar.getCompraCliente().getCompras().get(i).getCodigoCompra()){
                    
                }
            }
        }
    }
    private int comprasArtista(long cedula)
    {
    	int cont=0;
    	for(Compra compras:compras)
    	{															//verifica las compras que estan relacionadas con la lista artistas
    		for(Artista artistas:compras.getCompraObra().getArtista())//se cuenta la cantidad de veces que se realiza la compra
    		{
    			if(cedula==artistas.getCedula())
    			{
    				cont++;
    			}
    		}
    	}
    	
    	return cont;
    }
    public void ArtistaMasVendido(Artista artista)
    {
    	int tam=listaArtistas.size();
    	int aux,cont=0;
    	String aux1;
    	int [] obrasVendidas=new int [tam];
    	String[] artistas=new String [tam];
    	for(int i=0;i<tam;i++)//ambos arreglos tienen el mismo tamaño, ya que poseen informacion que va de la mano
    	{
    		obrasVendidas[i] = comprasArtista(listaArtistas.get(i).getCedula());//llena el arreglo, llamando al metodo con la cantidad de compras
    		artistas[i]=listaArtistas.get(i).toString();//guarda la informacion del artista
    	}
    	for(int i=0;i<tam;i++)
    	{
    		for(int j=i+1;j<tam;j++)
    		{
    			if(obrasVendidas[i]<obrasVendidas[j])
    			{
    				aux=obrasVendidas[i];//se ordenan las obras vendidas de mayor a menor
    				obrasVendidas[i]=obrasVendidas[j];
    				obrasVendidas[j]=aux;
    				
    				aux1=artistas[i];//se ordenan los artistas simultanemante 
    				artistas[i]=artistas[j];
    				artistas[i]=aux1;
    			}
    		}
    	}
    	for(int i=0;i<tam;i++)
    	{
    		cont++;
    		System.out.println(cont+"\nLas obras vendidas fueron: "+obrasVendidas[i]+"\nLa cantidad artistas con mas ventas : "+artistas[i]);
    	}
    }
}