/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Sebastián Bustacara
 */
public class Compra {
    private long codigoCompra;
    private Calendar fecha;
    private boolean pagado;
    
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
    
    //Toca enviar la lista de compra a revisar, Sirve para imprimir la lista
    public void ListadoComprasExistentes(ArrayList <Compra> Lista){
        String pago;
        Compra Aux;
        for(int i =0; i < Lista.size(); i++){
            Aux=Lista.get(i);
            if(Aux.pagado)
                pago="Pago";
            else
                pago="No pago";
            System.out.printf("Codigo de compra:\t%s\nFecha de compra:\t%d-%d-%d\nPagado:\t%s\n",Aux.codigoCompra,Aux.fecha.get(Aux.fecha.DATE),Aux.fecha.get(Aux.fecha.MONTH)+1,Aux.fecha.get(Aux.fecha.YEAR),pago);
        }
    }
}
