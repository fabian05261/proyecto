package control;

import java.util.*;
import entity.*;
import enumeration.Clasificacion;

public class ControlGaleria {

    
    private GestionClientes gestionCliente= new GestionClientes();
    private GestionObras gestionObras = new GestionObras();
    private HashMap<Integer,Cliente> listaClientes = new HashMap<Integer,Cliente>();
    private HashMap<Integer,Artista> listaArtistas = new HashMap<Integer,Artista>();
    private ArrayList<Obra> listaObras = new ArrayList<Obra>();
    private ArrayList<Compra> compras = new ArrayList<Compra>();
    

    public ControlGaleria() {
        this.listaClientes.putAll(this.gestionCliente.inListaClientesMap());
        this.listaObras.addAll(this.gestionObras.inListaObras());
        this.listaArtistas.putAll(this.gestionObras.inListaArtistasMap());
    }

    public ControlGaleria(HashMap<Integer,Artista> listaArtistas, ArrayList<Compra> compras) {
        this.listaArtistas = listaArtistas;
        this.compras = compras;
        this.listaClientes.putAll(this.gestionCliente.inListaClientesMap());
        this.listaObras.addAll(this.gestionObras.inListaObras());
    }

    public GestionClientes getCliente() {
        return gestionCliente;
    }

    public void setCliente(GestionClientes gestionCliente) {
        this.gestionCliente = gestionCliente;
    }
    
    public GestionObras getObras() {
        return gestionObras;
    }

    public void setObras(GestionObras gestionObras) {
        this.gestionObras = gestionObras;
    }

    public HashMap<Integer,Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(HashMap<Integer,Cliente>listaClientes) {
        this.listaClientes = listaClientes;
    }

    public HashMap<Integer,Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(HashMap<Integer,Artista> listaArtistas) {
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
    
    public void VerObras() {

        for (Obra obras : listaObras) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("1.El titulo de la obra es:" + obras.getTitulo());
            System.out.println("2.La fecha de creacion de la obra es:" + obras.getFecha().getTime());
            System.out.println("3.El precio referencia de la obra es:" + obras.getPrecioRef());
            //System.out.println("4.La foto de la obra es:");
            System.out.println("5.Las dimensiones de la obra son:" + obras.getDimensiones());
            System.out.println("-------------------------------------------------------------");
        }
    }

    public void criterio() {

        Scanner sc = new Scanner(System.in);
        int criterios;
        String titulo;
        long artista;
        int ano;
        System.out.println("Ingrese el criterio que desea aplicar para su busqueda, 1 para el titulo, 2 para el artista, 3 para el anho");
        criterios = sc.nextInt();

        switch (criterios) {

            case 1:

                System.out.println("Escriba el titulo de la obra que desea buscar");
                titulo = sc.next();

                for (Obra obras : listaObras) {
                    if (titulo.equals(obras.getTitulo())) {
                        System.out.println("-------------------------------------------------------------");
                        System.out.println("1.El titulo de la obra es:" + obras.getTitulo());
                        System.out.println("2.La fecha de creacion de la obra es:" + obras.getFecha().getTime());
                        System.out.println("3.El precio referencia de la obra es:" + obras.getPrecioRef());
                        //System.out.println("4.La foto de la obra es:");
                        System.out.println("5.Las dimensiones de la obra son:" + obras.getDimensiones());
                        System.out.println("-------------------------------------------------------------");
                    }
                }
                break;

            case 2:

                System.out.println("Escriba el codigo del artista el cual desea buscar su obra");
                artista = sc.nextLong();

                for (Artista artistas : listaArtistas.values()) {
                    if (artista == artistas.getCodigoArtista()) {
                        for (Obra obras : artistas.getObras()) {
                            System.out.println("1.El titulo de la obra es:" + obras.getTitulo());
                            System.out.println("2.La fecha de creacion de la obra es:" + obras.getFecha().getTime());
                            System.out.println("3.El precio referencia de la obra es:" + obras.getPrecioRef());
                            //System.out.println("4.La foto de la obra es:");
                            System.out.println("5.Las dimensiones de la obra son:" + obras.getDimensiones());
                        }

                    }
                }
                break;

            case 3:
                System.out.println("Escriba el anho en que fue pintada la obra ");
                ano = sc.nextInt();

                for (Obra obras : listaObras) {
                    if (ano == obras.getFecha().get(obras.getFecha().YEAR)) {
                        System.out.println("1.El titulo de la obra es:" + obras.getTitulo());
                        System.out.println("2.La fecha de creacion de la obra es:" + obras.getFecha());
                        System.out.println("3.El precio referencia de la obra es:" + obras.getPrecioRef());
                        //System.out.println("4.La foto de la obra es:");
                        System.out.println("5.Las dimensiones de la obra son:" + obras.getDimensiones());
                    }
                }
                break;
        }
        //sc.close();
    }

    public void BuscarObra() {
        criterio();
    }

    public boolean BuscarArtista(Artista artista) {
        for (Artista artistas : listaArtistas.values()) {
            if (artista.getCodigoArtista() == artistas.getCodigoArtista()) {
                return true;
            }
        }
        return false;
    }

    public void InsertarObra() {
        Scanner sc = new Scanner(System.in);
        String tit,dims;
        Calendar fechados = Calendar.getInstance();
        long codiguito;
        float preciox;
        int dia,mes,anio;
        System.out.println("Ingrese titulo de la Obra");
        tit=sc.next();
        System.out.println("Ingrese Fecha de la Obra(dia,mes,año en espacios diferentes)");
        dia=sc.nextInt();
        mes=sc.nextInt();
        anio=sc.nextInt();
        fechados.set(anio, mes-1, dia);
        System.out.println("Ingrese codigo de obra de la Obra");
        codiguito=sc.nextLong();
        System.out.println("Ingrese precio de referencia de la Obra");
        preciox = sc.nextFloat();
        System.out.println("Ingrese dimenciones de la Obra(ejemplo 3X3)");
        dims= sc.next();
        System.out.printf("Seleccione que tipo de obra es:\n1.Escultura\n2.Cuadro\n3.Instalacion");
        int tipoobra=sc.nextInt();
        Obra obra;
        switch(tipoobra){
            case 1:
                System.out.println("Ingrese el peso de la Obra");
                double peso=sc.nextDouble();
                System.out.println("Ingrese el codigo del material");
                long cods = sc.nextLong();
                Material mats = new Material();
                if(gestionObras.material1.getCodigo() == cods)
                    mats=gestionObras.material1;
                else if(gestionObras.material2.getCodigo() == cods)
                    mats=gestionObras.material2;
                else if(gestionObras.material3.getCodigo() == cods)
                    mats=gestionObras.material3;
                else if(gestionObras.material4.getCodigo() == cods)
                    mats=gestionObras.material4;
                else if(gestionObras.material5.getCodigo() == cods)
                    mats=gestionObras.material5;
                else if(gestionObras.material6.getCodigo() == cods)
                    mats=gestionObras.material6;
                else if(gestionObras.material7.getCodigo() == cods)
                    mats=gestionObras.material7;
                else if(gestionObras.material8.getCodigo() == cods)
                    mats=gestionObras.material8;
                else
                    System.out.println("El codigo de su material no se encuentra, verifique");
                obra= new Escultura(codiguito,tit,fechados,preciox,dims,mats,peso);
                break;
        
        case 2:
                System.out.println("Ingrese el tema de la Obra");
                String tema=sc.next();
                System.out.println("Ingrese la tecnica del material");
                String tecn = sc.next();
                System.out.printf("Seleccione la clasificacion de la Obra\n1.Obra Maestra\n2.Obra Representativa");
                int clas = sc.nextInt();
                if(clas == 1){
                    obra= new Cuadro(codiguito,tit,fechados,preciox,dims,Clasificacion.OBRA_MAESTRA,tema,tecn);
                }
                else{
                    obra= new Cuadro(codiguito,tit,fechados,preciox,dims,Clasificacion.OBRA_MAESTRA,tema,tecn);
                }
                break;
        default:
            System.out.println("Ingrese la descripcion de su instalacion");
            String des = sc.nextLine();
            Material mats1 = new Material();
            ArrayList <Material> materialesx = new ArrayList<Material>();
            long cods1=0;
            do{
                System.out.println("Ingrese el codigo del material, si ya no desea añadir otro digite 0");
                cods = sc.nextLong();
                if(gestionObras.material1.getCodigo() == cods1){
                    mats1=gestionObras.material1;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material2.getCodigo() == cods1){
                    mats1=gestionObras.material2;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material3.getCodigo() == cods1){
                    mats1=gestionObras.material3;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material4.getCodigo() == cods1){
                    mats1=gestionObras.material4;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material5.getCodigo() == cods1){
                    mats1=gestionObras.material5;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material6.getCodigo() == cods1){
                    mats1=gestionObras.material6;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material7.getCodigo() == cods1){
                    mats1=gestionObras.material7;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material8.getCodigo() == cods1){
                    mats1=gestionObras.material8;
                    materialesx.add(mats1);
                }
                else
                    System.out.println("El codigo de su material no se encuentra, verifique");
            }while(cods != 0);
            
            obra = new Instalacion(codiguito,tit,fechados,preciox,dims, des,materialesx);
        }
        long aux;
        int cont = 0;
        aux = obra.getCodigoObra();
        while (aux >= 1) {
            aux = aux / 10;
            cont++;
        }
        if (7 == cont) {
            for (Obra obras : listaObras) {
                if (codiguito == obras.getCodigoObra()) {
                    System.out.println("La obra esta repetida");
                    return;
                }
            }
            int counter = 0;
            for (Artista artistas : listaArtistas.values()) {
                        System.out.println("-------------------------------------------");
                        System.out.println(counter+1);
                        System.out.println("Nombre:" + artistas.getNombre());
                        System.out.println("Apellido:" + artistas.getApellido());
                        System.out.println("Cedula:" + artistas.getCedula());
                        System.out.println("-------------------------------------------");
                        counter+=1;
                }
            int des=1;
            while(des!=-1){
                System.out.println("ingrese el numero del artista de la lista que esta relacionado con la obra");
                System.out.println("Si este no aparece por favor digite 0");
                System.out.println("Si ya termino ingrese -1 por favor");
                des=sc.nextInt();
                if(des>0){
                    obra.getArtista().add(listaArtistas.get(des-1));
                }
                else if(des==0){
                    System.out.println("Ingrese el nombre del artista");
                    String nombreaux = sc.next();
                    System.out.println("Ingrese el Apellido del artista");
                    String apellidox = sc.next();
                    System.out.println("Ingrese la cedula del artista");
                    long cedulax=sc.nextLong();
                    System.out.println("Ingrese el codigo del artista");
                    codiguito=sc.nextLong();
                    System.out.println("Ingrese la fecha de nacimiento del artista (dia,mes,año)");
                    dia=sc.nextInt();
                    mes=sc.nextInt();
                    anio=sc.nextInt();
                    fechados.set(anio, mes-1, dia);
                    System.out.println("Ingrese el telefono del artista");
                    long telefonox=sc.nextLong();
                    Artista artistaux= new Artista(codiguito,cedulax,nombreaux,apellidox,fechados,telefonox);
                    obra.getArtista().add(artistaux);
                    artistaux.getObras().add(obra);
                    listaArtistas.put(counter+1,artistaux);
                    System.out.println("Desea agregar otro artista");
                    System.out.println("1.Si");
                    System.out.println("0.No");
                    des=sc.nextInt()-1;
                }
            }
              listaObras.add(obra);
        } else {
            System.out.println("El codigo no es valido");
        }
    }

    public void ModificarObra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la obra a buscar");
        long codiguito= sc.nextLong();
        int opciones;
        boolean encontro=false ,encontro1 = false;
        String nuevoTitulo, nuevasDimensiones;
        Calendar nuevaFecha = Calendar.getInstance();
        int ano, mes, dia;
        float nuevoPrecio;
        long nuevoCodigo;
        Obra obra;
        switch(tipoobra){
            case 1:
                System.out.println("Ingrese el peso de la Obra");
                double peso=sc.nextDouble();
                System.out.println("Ingrese el codigo del material");
                long cods = sc.nextLong();
                Material mats = new Material();
                if(gestionObras.material1.getCodigo() == cods)
                    mats=gestionObras.material1;
                else if(gestionObras.material2.getCodigo() == cods)
                    mats=gestionObras.material2;
                else if(gestionObras.material3.getCodigo() == cods)
                    mats=gestionObras.material3;
                else if(gestionObras.material4.getCodigo() == cods)
                    mats=gestionObras.material4;
                else if(gestionObras.material5.getCodigo() == cods)
                    mats=gestionObras.material5;
                else if(gestionObras.material6.getCodigo() == cods)
                    mats=gestionObras.material6;
                else if(gestionObras.material7.getCodigo() == cods)
                    mats=gestionObras.material7;
                else if(gestionObras.material8.getCodigo() == cods)
                    mats=gestionObras.material8;
                else
                    System.out.println("El codigo de su material no se encuentra, verifique");
                obra= new Escultura(codiguito,tit,fechados,preciox,dims,mats,peso);
                break;
        
        case 2:
                System.out.println("Ingrese el tema de la Obra");
                String tema=sc.next();
                System.out.println("Ingrese la tecnica del material");
                String tecn = sc.next();
                System.out.printf("Seleccione la clasificacion de la Obra\n1.Obra Maestra\n2.Obra Representativa");
                int clas = sc.nextInt();
                if(clas == 1){
                    obra= new Cuadro(codiguito,tit,fechados,preciox,dims,Clasificacion.OBRA_MAESTRA,tema,tecn);
                }
                else{
                    obra= new Cuadro(codiguito,tit,fechados,preciox,dims,Clasificacion.OBRA_MAESTRA,tema,tecn);
                }
                break;
        default:
            System.out.println("Ingrese la descripcion de su instalacion");
            String des = sc.nextLine();
            Material mats1 = new Material();
            ArrayList <Material> materialesx = new ArrayList<Material>();
            long cods1=0;
            do{
                System.out.println("Ingrese el codigo del material, si ya no desea añadir otro digite 0");
                cods = sc.nextLong();
                if(gestionObras.material1.getCodigo() == cods1){
                    mats1=gestionObras.material1;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material2.getCodigo() == cods1){
                    mats1=gestionObras.material2;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material3.getCodigo() == cods1){
                    mats1=gestionObras.material3;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material4.getCodigo() == cods1){
                    mats1=gestionObras.material4;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material5.getCodigo() == cods1){
                    mats1=gestionObras.material5;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material6.getCodigo() == cods1){
                    mats1=gestionObras.material6;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material7.getCodigo() == cods1){
                    mats1=gestionObras.material7;
                    materialesx.add(mats1);
                }
                else if(gestionObras.material8.getCodigo() == cods1){
                    mats1=gestionObras.material8;
                    materialesx.add(mats1);
                }
                else
                    System.out.println("El codigo de su material no se encuentra, verifique");
            }while(cods != 0);
            
            obra = new Instalacion(codiguito,tit,fechados,preciox,dims, des,materialesx);
        }
        for (Obra obras : listaObras) {
            if (obras.getCodigoObra() != codiguito) {
                encontro = false;
            } else {
                encontro = true;
                obra=obras;
                System.out.println("1.El titulo de la obra es:" + obras.getTitulo());
                System.out.println("2.La fecha de creacion de la obra es:" + obras.getFecha().getTime());
                System.out.println("3.El precio referencia de la obra es:" + obras.getPrecioRef());
                //System.out.println("4.La foto de la obra es:");
                System.out.println("5.Las dimensiones de la obra son:" + obras.getDimensiones());
            }
        }
        if (encontro) {
            System.out.println("Que valor quiere cambiar de las obras");

            do {
                System.out.println("Presione 1 para cambiar el codigo de la obra");
                System.out.println("Presione 2 para cambiar el titulo de la obra");
                System.out.println("Presione 3 para cambiar la fecha de la obra");
                System.out.println("Presione 4 para cambiar el precio referencia de la obra");
                System.out.println("Presione 5 para cambiar las dimensiones de la obra");
                System.out.println("Presione 9 para salir del menu");
                opciones = sc.nextInt();
                switch (opciones) {
                    case 1:
                        System.out.println("Ingrese el nuevo codigo");
                        nuevoCodigo = sc.nextLong();
                        for(Obra obras: listaObras){
                            if (nuevoCodigo == obras.getCodigoObra()) {
                                encontro1=true;
                                System.out.println("El codigo ya existe, escoja otro");
                            }
                        }
                            if(!encontro1){
                                obra.setCodigoObra(nuevoCodigo);
                                System.out.println("Se ha cambiado el codigo correctamente");
                                System.out.println(obra.getCodigoObra());
                            }
                            else
                                encontro1=false;
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo titulo de la obra");
                        nuevoTitulo = sc.next();
                        for (Obra obras : listaObras) {
                            if (nuevoTitulo.equals(obras.getTitulo())) {
                                encontro1=true;
                                System.out.println("El titulo ya existe, escoja otro");
                            }
                        }
                           if (!encontro1) {
                               obra.setTitulo(nuevoTitulo);
                               System.out.println("Se cambio el titulo");
                           }
                           else
                               encontro1=false;
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva fecha, dia, mes y ano, en ese orden");
                        dia = sc.nextInt();
                        mes = sc.nextInt();
                        ano = sc.nextInt();
                        nuevaFecha.set(ano, mes, dia);
                        obra.setFecha(nuevaFecha);
                        System.out.println("Se inserto la nueva fecha");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo precio referencia de la obra");
                        nuevoPrecio = sc.nextFloat();
                        obra.setPrecioRef(nuevoPrecio);
                        System.out.println("Se cambio el precio de referencia de la obra");
                        break;
                    case 5:
                        System.out.println("Ingrese las nuevas dimensiones de la obra");
                        nuevasDimensiones = sc.next();
                        obra.setDimensiones(nuevasDimensiones);
                        System.out.println("Se cambiaron las dimensiones de la obra");
                        break;
                }
            } while (opciones != 9);
        }
        else
            System.out.println("No se encontro la obra con ese codigo");
    }

    public void EliminarObra() {
        Scanner sc = new Scanner(System.in);
        long codigo;
        int x;
        boolean encontro=false;
        boolean confirmar = false;
        System.out.println("Ingrese el codigo de la obra que desea eliminar");
        codigo = sc.nextLong();
        Obra obra = new Obra();
        for (Obra obras : listaObras) {
            if (obras.getCodigoObra() != codigo) {
                   encontro=false;
            }
            else{
                encontro=true;
                obra=obras;
            }
        }
            if(encontro) {
                System.out.println("Realmente desea eliminar la obra? presione 1 para confirmar 0 para cancelar");
                x = sc.nextInt();
                if (x == 1) {
                    confirmar = true;
                } else {
                    confirmar = false;
                }
                if (confirmar == true) {
                    System.out.println("La obra existe y se elimino satisfactoriamente");
                    listaObras.remove(obra);
                } else {
                    System.out.println("Se ha cancelado");
                }
            }
            else
                System.out.println("Su obra no existe por favor verifique su codigo");
    }

    //metodos clientes
    public void VerClientes() {

        for (Cliente clientes : listaClientes.values()) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("El nombre  y apellido del cliente es: " + clientes.getNombre()+" " + clientes.getApellidos());
            System.out.println("La cedula del cliente es: " + clientes.getCedula());
            System.out.println("El telefono del cliente es: " + clientes.getTelefono());
            System.out.println("---------------------------------------------------------------");
        }
    }

    public void BuscarCliente(long codigo) {
        boolean encontro=false;
        for (Cliente clientes : listaClientes.values()) {
            if (codigo == clientes.getCedula()) {
                encontro=true;
                System.out.println("Se ha encontrado el cliente");
                System.out.println("---------------------------------------------------------------");
                 System.out.println("El nombre  y apellido del cliente es: " + clientes.getNombre()+" " + clientes.getApellidos());
                System.out.println("La cedula del cliente es: " + clientes.getCedula());
                System.out.println("El telefono del cliente es: " + clientes.getTelefono());
                System.out.println("---------------------------------------------------------------");
            }
        }
        if(!encontro)
            System.out.println("No existe el cliente en la base de datos");
    }

    public void InsertarCliente(Cliente cliente) {
        boolean encontro=false;
        for (Cliente clientes : listaClientes.values()) {

            if (cliente.getCodigoCliente() == clientes.getCodigoCliente()) {
                System.out.println("El cliente esta repetido");
                encontro=true;
            }
        }
           if(!encontro){
            System.out.println("Se inserto el cliente");
            listaClientes.put(listaClientes.size(),cliente);
           }
    }

    public void ModificarDatos(long codigo) {

        Scanner sc = new Scanner(System.in);
        int opciones;
        int cont = 0;
        boolean encontro = false, encontro1=false;
        String nuevoNombre, nuevoApellido, nuevaDireccion;
        long nuevoCodigo;
        long nuevaCedula, nuevoTelefono;
        Cliente cliente= new Cliente();

        for (Cliente clientes : listaClientes.values()) {
            if (codigo == clientes.getCedula()) {
                encontro = true;
                cliente=clientes;
                System.out.println("---------------------------------------------------------------");
                System.out.println("El nombre  y apellido del cliente es: " + clientes.getNombre()+" " + clientes.getApellidos());
                System.out.println("La cedula del cliente es: " + clientes.getCedula());
                System.out.println("El telefono del cliente es: " + clientes.getTelefono());
                System.out.println("---------------------------------------------------------------");
                break;
            }
            else{encontro = false;}
        }
        if (encontro){
             System.out.println("Seleccione el dato que desea modificar");
                do {
                    System.out.println("Presione 1 para cambiar el nombre");
                    System.out.println("Presione 2 para cambiar el apellido");
                    System.out.println("Presione 3 para cambiar la cedula");
                    System.out.println("Presione 4 para cambiar el telefono");
                    System.out.println("Presione 5 para cambiar la direccion");
                    System.out.println("Presion 6 para cambiar codigo");
                    System.out.println("Presione 9 para salir");
                    opciones = sc.nextInt();

                    switch (opciones) {

                        case 1://cambiar nombre 

                            System.out.println("Ingrese el nuevo Nombre que desea cambiar");
                            nuevoNombre = sc.next();
                            cliente.setNombre(nuevoNombre);
                            System.out.println("Se realizo el cambio de Nombre al Cliente");
                            break;

                        case 2: //cambiar apellido

                            System.out.println("Ingrese el nuevo Apellido que desea cambiar");
                            nuevoApellido = sc.next();
                            cliente.setApellidos(nuevoApellido);
                            System.out.println("Se realizo el cambio de Apellido al Cliente");
                            break;

                        case 3://cambiar cedula

                            System.out.println("Ingrese la nueva cedula que desea cambiar");
                            nuevaCedula = sc.nextLong();

                            for (Cliente clientes1 : listaClientes.values()) {
                                if (nuevaCedula == clientes1.getCedula()) {
                                    encontro1=true;
                                }
                            }
                            if(encontro1){
                                System.out.println("La nueva cedula ya existe, verifique nuevamente");
                                encontro1=false;
                            }
                            else{
                                cliente.setCedula(nuevaCedula);
                                System.out.println("Se actualizo la cedula del cliente");
                            }
                            break;

                        case 4://cambiar telefono

                            System.out.println("Ingrese el telefono nuevo que desea cambiar");
                            nuevoTelefono = sc.nextLong();
                            cliente.setTelefono(nuevoTelefono);
                            System.out.println("Se actualizo el telefono del cliente");
                            break;

                        case 5://cambiar direccion entrega

                            System.out.println("Ingrese la nueva direccion entrega que desea cambiar");
                            nuevaDireccion = sc.next();
                            cliente.setDireccionEntrega(nuevaDireccion);
                            System.out.println("Se actualizo la direccion del cliente");
                            break;

                        case 6: //cambiar codigo fuente

                            System.out.println("Ingrese el nuevo codigo que desea cambiar");
                            nuevoCodigo = sc.nextLong();
                            for(Cliente clientes:listaClientes.values()){
                                if(clientes.getCodigoCliente()==nuevoCodigo){
                                    encontro1=true;
                                    System.out.println("El codigo nuevo ya existe, por favor verifique nuevamente");
                                }
                            }
                            if(encontro1){
                                encontro1=false;
                            }
                            else{
                                cliente.setCodigoCliente(nuevoCodigo);
                                System.out.println("Se ha cambiado el codigo del Cliente");
                            }
                            break;
                    }

                } while (opciones != 9);
        }
        else {
            System.out.println("El cliente no existe");
        }
    }

    public void EliminarCliente() {

        Scanner sc = new Scanner(System.in);
        long codigo;
        int x;
        boolean encontro=false;
        boolean confirmar=false;
        System.out.println("Ingrese la cedula del cliente que desea eliminar");
        codigo = sc.nextLong();
        int cont=0;
        Cliente cliente=new Cliente();
        for (Cliente clientes : listaClientes.values()) {
            if (codigo == clientes.getCedula()) {
                encontro=true;
                cliente=clientes;
                break;
            }
            else{
                encontro=false;
            }
            cont++;
        }    
            if(encontro) {
                System.out.println("Realmente desea eliminar el cliente? presione 1 para confirmar 0 para cancelar");
                x = sc.nextInt();
                if (x == 1) {
                    confirmar = true;
                } else {
                    confirmar = false;
                }
            if (confirmar == true) {
                if(null==cliente.getCompras()){
                listaClientes.remove(cont,cliente);
                System.out.println("Se elimino el cliente satisfactoriamente");
                }
                else{
                    System.out.println("No se puede eliminar el cliente dado que tiene al menos una compra relacionada");
                }
            } else {
                System.out.println("Se ha cancelado");
            }
        }
            else
                System.out.println("Este cliente no existe");
    }

    //Toca enviar la lista de compra a revisar, Sirve para imprimir la lista
    public void ListadoComprasExistentes() {

        String pago;
        Compra Auxcompra;
        Calendar Auxfecha;
        for (int i = 0; i < compras.size(); i++) {
            Auxcompra = compras.get(i);
            Auxfecha = Auxcompra.getFecha();//Comodidad para imprimir
            if (Auxcompra.getPagado()) {
                pago = "Pago";
            } else {
                pago = "No pago";
            }
            System.out.printf("Codigo de compra:\t%s\nFecha de compra:\t%d-%d-%d\nPagado:\t%s\n", Auxcompra.getCodigoCompra(), Auxfecha.get(Auxfecha.DATE), Auxfecha.get(Auxfecha.MONTH) + 1, Auxfecha.get(Auxfecha.YEAR), pago);
        }
    }

    public void ListadoComprasPorFecha(int mes, int anio) {

        String pago;
        Compra Auxcompra;
        Calendar auxfecha;
        for (int i = 0; i < compras.size(); i++) {
            Auxcompra = compras.get(i);
            auxfecha = Auxcompra.getFecha();
            if (mes - 1 == auxfecha.get(auxfecha.MONTH)) {
                if (anio == auxfecha.get(auxfecha.YEAR)) {
                    if (Auxcompra.getPagado()) {
                        pago = "Pago";
                    } else {
                        pago = "No pago";
                    }
                    System.out.printf("Codigo de compra:\t%s\nFecha de compra:\t%d-%d-%d\nPagado:\t%s\n", Auxcompra.getCodigoCompra(), auxfecha.get(auxfecha.DATE), auxfecha.get(auxfecha.MONTH) + 1, auxfecha.get(auxfecha.YEAR), pago);
                }
            }
        }
    }

    public void CompraObra(String Titulo, long codigocompra, long codigo) {

        Obra Auxobra = new Obra();
        Cliente comprador = new Cliente();
        boolean encontro = false, encontro1=false, encontro2=false;
        for (Obra obras : listaObras) {
            if (Titulo.equals(obras.getTitulo())) {
                Auxobra = obras;
                encontro1=true;
                break;
            } else {
                encontro1=false;
            }
        }
        if(encontro1){
        for (Cliente clientes : listaClientes.values()) {
            if (codigo == clientes.getCodigoCliente()) {
                encontro2=true;
                comprador = clientes;
            }
        }
        if(encontro2){
        Calendar hoy = Calendar.getInstance();
        boolean pago;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Por favor seleccione una opcion.\n\t1.Se realizo el pago\n\t0.Pago pendiente\n");
        int revisar = sc.nextInt();
        if (revisar != 0) {
            pago = true;
        } else {
            pago = false;
        }
        Compra Auxcompra = new Compra(codigocompra, hoy, pago);
        Auxcompra.setCompraCliente(comprador);
        Auxcompra.setCompraObra(Auxobra);
        System.out.println("hola");
        for (Compra comprar : compras) {
            if (comprar.getCompraObra().getTitulo().equals(Titulo)) {
                if (comprar.getCompraCliente().getCodigoCliente() == comprador.getCodigoCliente()) {
                    encontro = true;
                } 
            }
        }
        if (!encontro) {
            Auxobra.setCompra(Auxcompra);
            for (int i = 0; i < Auxobra.getArtista().size(); i++) {
                Auxobra.getArtista().get(i).getVentas().add(Auxcompra);
            }
            comprador.getCompras().add(Auxcompra);
            compras.add(Auxcompra);
            System.out.println("Se ha anadido su compra con exito");
        } else {
            System.out.println("Esta compra ya se realizo, por favor verifique");
        }
        }
        }
        else{
            System.out.println("La obra "+Titulo+" no existe");
        }
        
    
    }     

    //codigo de compra a borrar
    public void EliminarComprar(long codigo) {
        boolean encontro = false;
        Compra aborrar = new Compra();
        for (Compra auxcompras : compras) {
            if (codigo == auxcompras.getCodigoCompra()) {
                aborrar = auxcompras;
                encontro = true;
                break;
            }
        }
        if (!encontro) {
            System.out.println("La compra que desea eliminar no existe");
            return;
        } else {
            for (int i = 0; i < aborrar.getCompraObra().getArtista().size(); i++) {
                for (int j = 0; j < aborrar.getCompraObra().getArtista().get(i).getVentas().size(); j++) {
                    if (aborrar.getCodigoCompra() == aborrar.getCompraObra().getArtista().get(i).getVentas().get(j).getCodigoCompra()) {
                        aborrar.getCompraObra().getArtista().get(i).getVentas().remove(j);
                        break;
                    }
                }
            }
            for (int i = 0; i < aborrar.getCompraCliente().getCompras().size(); i++) {
                if (aborrar.getCodigoCompra() == aborrar.getCompraCliente().getCompras().get(i).getCodigoCompra()) {
                    aborrar.getCompraCliente().getCompras().remove(i);
                    break;
                }
            }
            for (int i = 0; i < compras.size(); i++) {
                if (aborrar.getCodigoCompra() == compras.get(i).getCodigoCompra()) {
                    compras.remove(i);
                    System.out.println("Se ha eliminado la compra correctamente");
                    break;
                }
            }
        }
    }

    private int comprasArtista(long cedula) {
        int cont = 0;
        for (Compra compras : compras) {															//verifica las compras que estan relacionadas con la lista artistas
            for (Artista artistas : compras.getCompraObra().getArtista())//se cuenta la cantidad de veces que se realiza la compra
            {
                if (cedula == artistas.getCedula()) {
                    cont++;
                }
            }
        }

        return cont;
    }

    public void ArtistaMasVendido() {
        int tam = listaArtistas.size();
        int aux, cont = 0;
        String aux1;
        int[] obrasVendidas = new int[tam];
        String[] artistas = new String[tam];
        for (int i = 0; i < tam; i++)//ambos arreglos tienen el mismo tamaño, ya que poseen informacion que va de la mano
        {
            obrasVendidas[i] = comprasArtista(listaArtistas.get(i).getCedula());//llena el arreglo, llamando al metodo con la cantidad de compras
            artistas[i] = listaArtistas.get(i).toString();//guarda la informacion del artista
        }
        for (int i = 0; i < tam; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (obrasVendidas[i] < obrasVendidas[j]) {
                    aux = obrasVendidas[i];//se ordenan las obras vendidas de mayor a menor
                    obrasVendidas[i] = obrasVendidas[j];
                    obrasVendidas[j] = aux;

                    aux1 = artistas[i];//se ordenan los artistas simultanemante 
                    artistas[i] = artistas[j];
                    artistas[i] = aux1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            cont++;
            System.out.println(cont + "\nLas obras vendidas fueron: " + obrasVendidas[i] + "\nLa cantidad artistas con mas ventas : " + artistas[i]);
        }
    }
}