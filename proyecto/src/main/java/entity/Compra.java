/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Calendar;

/**
 *
 * @author Sebastián Bustacara
 */
public class Compra {
    private long codigoCompra;
    private Calendar fecha;
    private boolean pagado;
  	private ArrayList<Compra>compraCliente=new ArrayList<Compra>();
    private ArrayList<Obra>compraObra=new ArrayList<Obra>();
    
    public ArrayList<Obra> getCompraObra() {
		return compraObra;
	}

	public void setCompraObra(ArrayList<Obra> compraObra) {
		this.compraObra = compraObra;
	}

	public ArrayList<Compra> getCompraCliente() {
		return compraCliente;
	}

	public void setCompraCliente(ArrayList<Compra> compraCliente) {
		this.compraCliente = compraCliente;
	}
    Compra(){};
    
    //antes de enviar fecha utilizar getInstance
    Compra(long codigoCompra, Calendar fecha, boolean pagado){
        this.codigoCompra=codigoCompra;
        this.fecha=fecha;
        this.pagado=pagado;
    }
    
    public void setCodigoCompra(long codigoCompra){
        this.codigoCompra=codigoCompra;
    }
    
    public void setFecha(Calendar fecha){
        this.fecha=fecha;
    }
    
    public void setPagado(boolean pagado){
        this.pagado=pagado;
    }
    
    public long getCodigoCompra(){
        return this.codigoCompra;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public boolean getPagado(){
        return this.pagado;
    }
    
    
    
}
